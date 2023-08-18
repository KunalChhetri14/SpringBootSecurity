package com.kunal.jaigaonBankApp.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class LoansController {

  @GetMapping("/myLoans")
  public String getMyAccountDetails(){
    return "Here are the loan details";
  }

}
