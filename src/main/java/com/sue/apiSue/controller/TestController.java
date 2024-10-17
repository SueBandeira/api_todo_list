package com.sue.apiSue.controller;

import com.sue.apiSue.service.TestService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test") //Default da aplicação posso passar quantos parametros quiser
@AllArgsConstructor
//O controller ele controla os fluxos de informações/dados e confere se essas estão chegando
public class TestController {

  private final TestService testService;


  @GetMapping()
  public void test() {
    System.out.println("minha primeira api");
  }

  @GetMapping("/cozinha")
  public void test2() {
    testService.chegouNaCozinha();
  }
}