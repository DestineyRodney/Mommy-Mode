package com.example.newlywed;

import com.example.newlywed.models.User;
import com.example.newlywed.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class NewlyWedApplication {

    public static void main(String[] args) {
        SpringApplication.run(NewlyWedApplication.class, args);

    }

//    @Bean
//    public CommandLineRunner run(UserRepository repository){
//        return (args ->{
//            insertJavaAdvocates(repository);
//            System.out.println(repository.findAll());
//        });
//    }

//    private void insertJavaAdvocates(UserRepository repository){
//        repository.save(new User());
//    }

}
