package com.sopia.notesapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


@SpringBootApplication
@EnableJpaAuditing //Enable JPA Auditing in the main application.

public class NotesAPIApplication {

    public static void main(String[] args) {
        SpringApplication.run(NotesAPIApplication.class, args);
    }
}
