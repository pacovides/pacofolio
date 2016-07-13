package com.pacovides.pacofolio;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.pacovides.pacofolio.model.Project;
import com.pacovides.pacofolio.persistance.ProjectRepository;

@SpringBootApplication
public class PacofolioApplication {
	
	private static final Logger logger = LoggerFactory.getLogger(PacofolioApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(PacofolioApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner init(ProjectRepository projectRepo){
		return (x)->{
			logger.info("Initializing pacofolio...");
			for(Project project : projectRepo.findAll()){
				logger.info(project.toString());
			}
		};
	}
}
