package com.sinch.sample.sample_web_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SampleWebAppApplication {

	@RestController
	class HelloController {
		@GetMapping("/samplePage")
		String hello(){
			System.out.println("reached here");
			return "Hello Welcome !";
		}
	}


public static void main (String[] args){
	SpringApplication.run(SampleWebAppApplication.class, args);
}

}
