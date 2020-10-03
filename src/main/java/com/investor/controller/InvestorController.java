package com.investor.controller;

import com.investor.models.Investor;
import com.investor.models.InvestorResponse;
import com.investor.service.InvestorService;
import java.util.UUID;
import javax.validation.constraints.NotEmpty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class InvestorController {
  @Autowired private InvestorService investorService;

  @PostMapping("/investor")
  public InvestorResponse CreateInvestor(@RequestBody Investor investor) {
    return investorService.createInvestor(investor);
  }

  @PutMapping("/investor/{investorId}")
  public InvestorResponse updateInvestor(
      @RequestBody Investor investor, @NotEmpty @PathVariable UUID investorId) {
    return investorService.updateInvestor(investor, investorId);
  }

  @GetMapping("/investor/{marketId}")
  public InvestorResponse getInvestor(@NotEmpty @PathVariable UUID investorId) {
    return investorService.getInvestor(investorId);
  }
}
