package com.github.wushujing.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by wushujing on 06/12/2016.
 */
@SpringBootApplication(scanBasePackages = {"com.github.wushujing.hello"})
public class App {
	public static void main(String[] args) {
		System.setProperty("server.port", "8081");
		SpringApplication.run(App.class, args);
	}
}
