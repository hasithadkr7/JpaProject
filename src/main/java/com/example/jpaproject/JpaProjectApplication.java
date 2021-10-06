package com.example.jpaproject;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpaProjectApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
            Student bob = new Student(
                    "Bob",
                    "Pattrik",
                    "bob@gmail.com",
                    21);
            studentRepository.save(bob);
        };
    }

}
