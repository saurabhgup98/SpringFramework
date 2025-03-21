package com.saurabhtech.learn_spring_boot.spring_basics.loose_coupling_example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    private GamingConsole gamingConsole;

    // Use below @Qualifier  iF we have @component on more than one class & if we dont want to use
    // @Primary.. Note......... Used Qualifier to learn springGamingExampleTwo
    public GameRunner(@Qualifier("SuperContraGameQualifier") GamingConsole gamingConsole) {
        this.gamingConsole = gamingConsole;
    }
    public void run() {
        System.out.println("Loose Couplin Gaming Example");
        gamingConsole.left();
        gamingConsole.right();
        gamingConsole.up();
        gamingConsole.down();
    }
}