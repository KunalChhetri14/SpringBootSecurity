package com.kunal.jaigaonBankApp.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class NoticesController {

  @GetMapping("/notices")
  public String getMyAccountDetails(){
    return "Here are the notice details";
  }

}
