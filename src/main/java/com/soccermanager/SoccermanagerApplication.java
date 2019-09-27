package com.soccermanager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SoccermanagerApplication {

	private static final Logger log = LoggerFactory.getLogger(SoccermanagerApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SoccermanagerApplication.class, args);
	}
	@Bean
	public CommandLineRunner demo(GameRepository repository) {
		return (args) -> {

			Game game = repository.findById(1);
			log.info("Game found with findById(1):");
			log.info("--------------------------------");
			log.info(game.toString());
			log.info("");
		};
	}
}
