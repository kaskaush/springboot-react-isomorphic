package com.kaushik.springbootreactisomorphic.springbootreactisomorphicpoc.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan("com.kaushik.springbootreactisomorphic.springbootreactisomorphicpoc.entities")
@SpringBootApplication
public class SpringbootReactIsomorphicPocApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootReactIsomorphicPocApplication.class, args);
	}

}
