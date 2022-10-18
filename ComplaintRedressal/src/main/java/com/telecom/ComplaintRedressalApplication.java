package com.telecom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.telecom")
@EntityScan(basePackages = "com.telecom.bean")
@EnableJpaRepositories(basePackages = "com.telecom.repository")
public class ComplaintRedressalApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComplaintRedressalApplication.class, args);
		System.out.println("Server up on prt 9090");
	}

}
