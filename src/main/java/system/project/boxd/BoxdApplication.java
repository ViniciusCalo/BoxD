package system.project.boxd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class BoxdApplication {
	public static void main(String[] args) {
		SpringApplication.run(BoxdApplication.class, args);
	}
}
