package com.example.spring5tutorial.controllers;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
  //Accessing application.properties
  //@Value("${app.name}")
 //private String appName;
  
  @RequestMapping("/hello")
  public String hello() {
	  return "Hello World!" ;
  }
}
