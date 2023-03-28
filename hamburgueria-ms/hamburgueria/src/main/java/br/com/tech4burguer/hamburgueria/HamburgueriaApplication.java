package br.com.tech4burguer.hamburgueria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class HamburgueriaApplication {

	public static void main(String[] args) {
		SpringApplication.run(HamburgueriaApplication.class, args);
	}

}
