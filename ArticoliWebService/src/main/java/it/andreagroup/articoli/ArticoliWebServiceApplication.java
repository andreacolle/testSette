package it.andreagroup.articoli;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableFeignClients
public class ArticoliWebServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArticoliWebServiceApplication.class, args);
	}

}
