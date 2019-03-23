package com.chord;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.chord.mapper")
public class ZtreedemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZtreedemoApplication.class, args);
	}

}
