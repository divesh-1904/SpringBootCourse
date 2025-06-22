package com.nevermind.SpringCourse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Dev {

    Computer comp;

    @Autowired
    public Dev (@Qualifier("laptop") Computer comp) {
        this.comp = comp; // Constructor Injection
    }

    public void build() {
        System.out.println("Hello World");
        comp.build();
    }
}







