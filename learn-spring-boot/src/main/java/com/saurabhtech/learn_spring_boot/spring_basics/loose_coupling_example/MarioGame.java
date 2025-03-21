package com.saurabhtech.learn_spring_boot.spring_basics.loose_coupling_example;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

// Add this @Component annotation if we want the spring to create and Manage bean
// Used in Package spring_gaming_example_02
//@Component
public class MarioGame implements GamingConsole {
    public void left() {
        System.out.println("MarioGame :: Move Left");
    }

    public void right() {
        System.out.println("MarioGame :: Move Right");
    }

    public void up() {
        System.out.println("MarioGame :: Move Up");
    }

    public void down() {
        System.out.println("MarioGame :: Move Down");
    }
}
