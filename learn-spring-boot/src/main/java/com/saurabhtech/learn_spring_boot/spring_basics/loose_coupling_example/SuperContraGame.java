package com.saurabhtech.learn_spring_boot.spring_basics.loose_coupling_example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContraGameQualifier") //Explore more
public class SuperContraGame implements GamingConsole{
    public void left() {
        System.out.println("SuperContraGame :: Move Left");
    }

    public void right() {
        System.out.println("SuperContraGame :: Move right");
    }

    public void up() {
        System.out.println("SuperContraGame :: Move up");
    }

    public void down() {
        System.out.println("SuperContraGame :: fire");
    }
}
