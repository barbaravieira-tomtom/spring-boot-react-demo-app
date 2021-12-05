package demo.vulnerableapp.demovulnerableapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableMongoRepositories
@SpringBootApplication
@Configuration
public class DemovulnerableappApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemovulnerableappApplication.class, args);
	}

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedOrigins("http://localhost:8080",
				"http://0.0.0.0:9090","http://localhost:9090");
				registry.addMapping("/api").allowedOrigins("http://localhost:8080",
						"http://0.0.0.0:9090", "http://localhost:9090");
			}
		};
	}

}
