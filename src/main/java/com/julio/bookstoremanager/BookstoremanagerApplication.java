package com.julio.bookstoremanager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.spring.web.plugins.Docket;

@SpringBootApplication
public class BookstoremanagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoremanagerApplication.class, args);
	}

}
