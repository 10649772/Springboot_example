package com.example.openshift;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringDemoApplication 
{
@GetMapping("/")
public String welcome()
{
	return "Welcome to openshift Deployment";
}

@GetMapping("/{input}")
	public String congrats(@PathVariable String input)
	{
		return "Hi" + input + "your application deployed successfully...";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringDemoApplication.class, args);
	}

}
