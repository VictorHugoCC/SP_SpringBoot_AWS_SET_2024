package org.example.teste_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "org.example")
public class TesteSpringApplication {
    public static void main(String[] args) {
        SpringApplication.run(TesteSpringApplication.class, args);
    }
}


