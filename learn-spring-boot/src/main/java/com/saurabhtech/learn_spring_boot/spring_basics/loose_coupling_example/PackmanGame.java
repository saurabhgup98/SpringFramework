package com.saurabhtech.learn_spring_boot.spring_basics.loose_coupling_example;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary // Note: @Qualifier has More Priority than @Primary
public class PackmanGame implements GamingConsole{
    public void left() {
        System.out.println("PackmanGame :: Move Left");
    }

    public void right() {
        System.out.println("PackmanGame :: Move right");
    }

    public void up() {
        System.out.println("PackmanGame :: Move up");
    }

    public void down() {
        System.out.println("PackmanGame :: Move down");
    }
}
