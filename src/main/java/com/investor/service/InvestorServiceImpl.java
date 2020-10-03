package com.investor.service;

import com.investor.entity.InvestorEntity;
import com.investor.exception.EntityNotFoundException;
import com.investor.models.Investor;
import com.investor.models.InvestorResponse;
import com.investor.repository.InvestorRepository;
import com.investor.util.InvestorDTOEntityMapper;
import java.util.Optional;
import java.util.UUID;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class InvestorServiceImpl implements InvestorService {
  @Autowired private InvestorDTOEntityMapper investorDTOEntityMapper;

  @Autowired private InvestorRepository investorRepository;

  @Override
  public InvestorResponse createInvestor(Investor investor) {

    InvestorEntity investorEntity = investorDTOEntityMapper.mapInvestor(investor);
    investorEntity.setInvestorId(UUID.randomUUID());
    InvestorEntity investorEntityCreated = investorRepository.save(investorEntity);

    InvestorResponse investorResponse =
        investorDTOEntityMapper.mapInvestorResponse(investorEntityCreated);
    return investorResponse;
  }

  @Override
  public InvestorResponse updateInvestor(Investor investor, UUID investorId) {

    Optional<InvestorEntity> investorEntityOptional = investorRepository.findById(investorId);
    if (investorEntityOptional.isPresent()) {
      investorEntityOptional.get().setInvestorId(investorId);
      investorEntityOptional.get().setContactDetails(investor.getContactDetails()!=null?investor.getContactDetails():investorEntityOptional.get().getContactDetails());

      InvestorEntity investorEntitySaved = investorRepository.save((investorEntityOptional.get()));
      InvestorResponse investorResponse =
          investorDTOEntityMapper.mapInvestorResponse(investorEntitySaved);
      return investorResponse;
    }
    throw new EntityNotFoundException("Investor not found for market Id" + investorId);
  }

  @Override
  public InvestorResponse getInvestor(UUID investorId) throws EntityNotFoundException {
    Optional<InvestorEntity> investorEntityOptional = getById(investorId);

    if (investorEntityOptional.isPresent()) {
      InvestorResponse investorResponse =
          investorDTOEntityMapper.mapInvestorResponse(investorEntityOptional.get());
      return investorResponse;
    }

    throw new EntityNotFoundException("Investor not found with id" + investorId);
  }

  public Optional<InvestorEntity> getById(UUID investorId) {
    return investorRepository.findById(investorId);
  }
}
