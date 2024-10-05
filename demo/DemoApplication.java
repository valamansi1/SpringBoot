package com.gpx.spring.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		var ctx=SpringApplication.run(DemoApplication.class, args);

    MyFirstService myFirstService=ctx.getBean(MyFirstService.class);
    System.out.println(myFirstService.myStory());
    System.out.println(myFirstService.getJavaVersion());
    System.out.println(myFirstService.getOSName());
    System.out.println(myFirstService.getName());
    System.out.println(myFirstService.getAppname());
    System.out.println(myFirstService.getPropertyfromanotherfile());

  }
}
