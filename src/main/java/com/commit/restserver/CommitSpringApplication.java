package com.commit.restserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.commit.mappers")
public class CommitSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommitSpringApplication.class, args);
	}

}
