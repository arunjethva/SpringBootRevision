package in.si.main.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.si.main.beans.Student;

@Configuration
public class AppConfig {

	@Bean
	public CommandLineRunner cmdLineRunner() {
		return new CommandLineRunner() {

			@Override
			public void run(String... args) throws Exception {
				std1Details().displayStdDetails();
				System.out.println("-----------------");
				std2Details().displayStdDetails();
			}
		};
	}

	@Bean
	public Student std1Details() {
		return new Student("Arun jethva", 101, 99.99f);
	}

	@Bean
	public Student std2Details() {
		return new Student("devnag jethva", 102, 90.56f);
	}

}
