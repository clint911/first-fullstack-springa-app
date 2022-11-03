package com.fullstackExample.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

public class SpringbootBackendApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootBackendApplication.class, args);

    }

    @Autowired
    private userRepository userRepository;

    @Override
    public void  run(String...args) throws Exception {
        this.userRepository.save(new User("Ramesh", "Fadatare", "ramesh@gmail.com"));
        this.userRepository.save(new User("Tom", "Cruise", "tomcruise@gmail.com"));
        this.userRepository.save(new User("Tony", "Stack", "tony@gmail.com"));
    }
}
