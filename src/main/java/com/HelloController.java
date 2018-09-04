package com;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

  @RequestMapping("/")
  public String index() {
      return "Greetings from Spring Boot!";
  }

	@RequestMapping("/another")
	public String another() {
		return "Here is another";
	}

}
