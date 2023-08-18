package com.kunal.jaigaonBankApp.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class CardsController {

  @GetMapping("/myCards")
  public String getMyAccountDetails(){
    return "Here are the cards details";
  }

}
