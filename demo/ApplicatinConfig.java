package com.gpx.spring.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ApplicatinConfig {

  @Bean
  @Qualifier("bean1")
  public MyFirstClass myFirstBean(){
    return new MyFirstClass("MyFirstBean");
  }

  @Bean
  @Qualifier("bean2")
  public MyFirstClass mySecondBean(){
    return new MyFirstClass("MySecondBean");
  }

  @Bean
  @Qualifier("bean3")
  public MyFirstClass myThirdBean(){
    return new MyFirstClass("MyThirdBean");
  }
}
