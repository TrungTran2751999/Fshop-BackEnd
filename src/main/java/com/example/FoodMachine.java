package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FoodMachine {
    public String PORT = System.getenv("PORT");
    public static void main(String[] args) {
        SpringApplication.run(FoodMachine.class, args);
    }

}
