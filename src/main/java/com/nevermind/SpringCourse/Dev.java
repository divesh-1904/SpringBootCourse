package com.nevermind.SpringCourse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Dev {

    Computer comp;

    public Dev (Computer comp) {
        this.comp = comp; // Constructor Injection
    }

    public void build() {
        System.out.println("Hello World");
        comp.build();
    }
}







