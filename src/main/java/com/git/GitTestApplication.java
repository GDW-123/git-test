package com.git;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitTestApplication {
    public static void main(String[] args) {
        System.out.println("11111111");
        System.out.println("aaaaaa");
        System.out.println("sssss");
        SpringApplication.run(GitTestApplication.class, args);
        System.out.println("hot-fix");
        System.out.println("hot-fix2");
    }
}
