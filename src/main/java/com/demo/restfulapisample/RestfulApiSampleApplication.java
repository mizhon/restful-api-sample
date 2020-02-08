package com.demo.restfulapisample;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author mizhon
 */
@SpringBootApplication
@MapperScan(basePackages = "com.demo.restfulapisample.dao")
public class RestfulApiSampleApplication {

	public static void main(String[] args) {
		System.out.println("Hello World!~");
		SpringApplication.run(RestfulApiSampleApplication.class, args);
	}

}
