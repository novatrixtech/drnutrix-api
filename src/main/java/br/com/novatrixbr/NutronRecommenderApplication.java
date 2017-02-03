package br.com.novatrixbr;

import br.com.novatrixbr.service.CalcsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@SpringBootApplication
public class NutronRecommenderApplication {

//	@Autowired
//	private CalcsService service;

	public static void main(String[] args) {
		SpringApplication.run(NutronRecommenderApplication.class, args);
	}

//	@Bean
//	public String testCalcs() {
//		String s = service.getBalancedMacroDistribution(1000);
//
//		System.out.println(s);
//		return s;
//	}

}
