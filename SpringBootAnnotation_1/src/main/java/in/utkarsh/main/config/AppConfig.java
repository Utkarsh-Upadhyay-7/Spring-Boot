package in.utkarsh.main.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.utkarsh.main.beans.Student;

@Configuration
public class AppConfig {
	
	@Bean
	public CommandLineRunner cmdLineRunner()
	{
		return new CommandLineRunner() {
			
			@Override
			public void run(String... args) throws Exception {
				stu().display();
				
			}
		};
	}
   
	@Bean
	public Student stu() {
		return new Student("abcd", 15,97);
	}
	
}
