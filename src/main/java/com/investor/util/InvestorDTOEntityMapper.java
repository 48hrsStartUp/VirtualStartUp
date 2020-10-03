package com.investor.util;

import com.investor.entity.InvestorEntity;
import com.investor.models.Investor;
import com.investor.models.InvestorResponse;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class InvestorDTOEntityMapper {
  private ModelMapper modelMapper = new ModelMapper();

  public InvestorEntity mapInvestor(Investor investor) {
    InvestorEntity investorEntity = modelMapper.map(investor, InvestorEntity.class);

    return investorEntity;
  }

  public InvestorResponse mapInvestorResponse(InvestorEntity investorEntity) {
    InvestorResponse investorResponse = modelMapper.map(investorEntity, InvestorResponse.class);

    return investorResponse;
  }
}
