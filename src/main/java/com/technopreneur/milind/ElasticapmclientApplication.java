package com.technopreneur.milind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import co.elastic.apm.attach.ElasticApmAttacher;
import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class ElasticapmclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ElasticapmclientApplication.class, args);
	}

}
