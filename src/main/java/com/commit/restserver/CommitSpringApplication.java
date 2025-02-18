package com.commit.restserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan(basePackages = "com.commit.mappers")
@ComponentScan(basePackages = { "com.commit" })
public class CommitSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommitSpringApplication.class, args);
	}

}
