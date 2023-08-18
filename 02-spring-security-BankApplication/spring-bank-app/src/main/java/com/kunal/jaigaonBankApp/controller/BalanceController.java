package com.kunal.jaigaonBankApp.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class BalanceController {

  @GetMapping("/myBalance")
  public String getMyBalance() {
    return "My balance";
  }
}
