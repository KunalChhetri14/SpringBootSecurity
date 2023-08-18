package com.kunal.jaigaonBankApp.config;

import org.springframework.boot.autoconfigure.security.*;
import org.springframework.context.annotation.*;
import org.springframework.core.annotation.*;
import org.springframework.security.config.annotation.web.builders.*;
import org.springframework.security.web.*;

@Configuration
public class ProjectSecurityConfig {

  @Bean
  SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {

    //Below is the custom security requirements


    //to Deny all urls even after authentication
//    http.authorizeHttpRequests().anyRequest().denyAll()
//        .and().formLogin()
//        .and().httpBasic();
//    return http.build();

    //to permitall apis
    http.authorizeHttpRequests().anyRequest().permitAll()
      .and().formLogin()
      .and().httpBasic();
    return http.build();

//    http.authorizeHttpRequests()
//      .requestMatchers("/myAccount/**","/myCards", "/myBalance", "/myLoans").authenticated()
//      .requestMatchers("/notices", "/contact").permitAll()
////      .anyRequest().authenticated();
//      .and().formLogin()
//      .and().httpBasic();
//    return http.build();
  }

}
