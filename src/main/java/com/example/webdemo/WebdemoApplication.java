package com.example.webdemo;
import com.example.webdemo.web.HelloController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;


@SpringBootApplication
public class WebdemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(WebdemoApplication.class, args);
	}
}
