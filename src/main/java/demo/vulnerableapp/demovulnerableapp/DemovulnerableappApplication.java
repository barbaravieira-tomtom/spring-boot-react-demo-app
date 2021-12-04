package demo.vulnerableapp.demovulnerableapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories
@SpringBootApplication
public class DemovulnerableappApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemovulnerableappApplication.class, args);
	}

	

}
