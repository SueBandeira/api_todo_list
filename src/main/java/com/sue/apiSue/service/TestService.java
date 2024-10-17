package com.sue.apiSue.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service //A service é responsavel por toda lógica da operação
@AllArgsConstructor
public class TestService {

  public void chegouNaCozinha () {
    System.out.println("Seu pedido esta pronto.");
  }
}
