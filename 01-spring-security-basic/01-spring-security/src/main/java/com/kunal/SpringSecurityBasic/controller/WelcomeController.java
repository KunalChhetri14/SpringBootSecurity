package com.kunal.SpringSecurityBasic.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class WelcomeController {

  @RequestMapping("/hello")
  public String getHello() {
    return "Hello this is spring";
  }
}
