package com.nevermind.SpringCourse;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {

    public void build() {
        System.out.println("Compiled on Laptop");
    }
}



















