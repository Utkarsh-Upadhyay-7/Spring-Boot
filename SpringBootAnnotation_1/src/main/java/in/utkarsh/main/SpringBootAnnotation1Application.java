package in.utkarsh.main;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import in.utkarsh.main.beans.Student;

@SpringBootApplication
public class SpringBootAnnotation1Application  {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAnnotation1Application.class, args);
	}

}
