package com.nevermind.SpringCourse;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Dev {

    ApplicationContext context;
    Laptop laptop;

    public void setContext(ApplicationContext context) {
        this.context = context;
        laptop = context.getBean(Laptop.class);
    }

    public void build() {
        System.out.println("Hello World");
        laptop.build();
    }
}
