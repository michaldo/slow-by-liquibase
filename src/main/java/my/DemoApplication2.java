package my;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemoApplication2 {

	public static void main(String[] args) throws Exception {
		org.slf4j.LoggerFactory.getLogger(DemoApplication2.class).info("Boot start1");
		SpringApplication bootstrapApplication = new SpringApplication(DemoApplication2.class);
		bootstrapApplication.setWebEnvironment(false);
		org.slf4j.LoggerFactory.getLogger(DemoApplication2.class).info("Boot start2");
		bootstrapApplication.run(args);
	}

}
