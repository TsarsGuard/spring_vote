package com.victor.spring_vote;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.victor.spring_vote.dao")
public class SpringVoteApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringVoteApplication.class, args);
	}
}
