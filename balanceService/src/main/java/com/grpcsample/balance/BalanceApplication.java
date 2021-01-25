package com.grpcsample.balance;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BalanceApplication {

    public static void main(String[] args) {
        System.out.println("test");
        SpringApplication.run(BalanceApplication.class,args);
    }
}
