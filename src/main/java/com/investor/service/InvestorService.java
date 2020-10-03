package com.investor.service;

import com.investor.models.Investor;
import com.investor.models.InvestorResponse;
import java.util.UUID;
import org.springframework.stereotype.Service;

@Service
public interface InvestorService {

  InvestorResponse createInvestor(Investor investor);

  InvestorResponse updateInvestor(Investor investor, UUID marketId);

  InvestorResponse getInvestor(UUID marketId);
}
