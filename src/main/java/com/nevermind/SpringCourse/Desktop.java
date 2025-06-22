package com.nevermind.SpringCourse;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer {

    public void build() {
        System.out.println("Compiled on Desktop");
    }
}



















