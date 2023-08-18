package com.kunal.jaigaonBankApp.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class ContactController {

  @GetMapping("/contact")
  public String getMyAccountDetails(){
    return "Here are the contact details";
  }

}
