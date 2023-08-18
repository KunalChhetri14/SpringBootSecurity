package com.kunal.jaigaonBankApp.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class AccountController {

  @GetMapping("/myAccount")
  public String getMyAccountDetails(){
    return "Here are the account details";
  }

}
