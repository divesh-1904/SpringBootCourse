package com.nevermind.SpringCourse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Dev {

//    @Autowired
    Laptop laptop; // Field Injection

    public Dev (Laptop laptop) {
        this.laptop = laptop; // Constructor Injection
    }

//    @Autowired
//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop; // Setter Injection
//    }

    public void build() {
        System.out.println("Hello World");
        laptop.build();
    }
}







