package com.gpx.spring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
@PropertySource("classpath:property-file-2")
public class MyFirstService {

  private MyFirstClass myFirstClass;

  @Autowired
  private Environment environment;

  @Value("alibou")
  private String name;

  public String getName() {
    return name;
  }

  @Value("${spring}")
  private String appname;

  public String getAppname() {
    return appname;
  }

  @Value("${my.prop}")
  public String propertyfromanotherfile;

  public String getPropertyfromanotherfile() {
    return propertyfromanotherfile;
  }

  public void setEnvironment(Environment environment) {
    this.environment = environment;
  }

  public MyFirstService(
   @Qualifier("bean2") MyFirstClass myFirstClass) {
    this.myFirstClass = myFirstClass;
  }


  public String myStory(){
    return "the dependency is saying "+ myFirstClass.sayHello();
  }

  public String getJavaVersion(){
    return environment.getProperty("java.version");
  }

  public String getOSName(){
    return environment.getProperty("os.name");
  }
}
