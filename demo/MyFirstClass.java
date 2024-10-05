package com.gpx.spring.demo;

import org.springframework.beans.factory.annotation.Value;

public class MyFirstClass {


  private String myVar;

  public MyFirstClass(String myVar) {
    this.myVar = myVar;
  }

  public String sayHello(){
    return "hello from my first class and my Var name is " + myVar;
  }
}

