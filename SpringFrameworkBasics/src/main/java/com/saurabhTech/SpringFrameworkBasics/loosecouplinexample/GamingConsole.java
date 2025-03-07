package com.saurabhTech.SpringFrameworkBasics.loosecouplinexample;

public interface GamingConsole {
    void up();
    void down();
    void left();
    void right();

    default void extra() {
        System.out.println("Extra");
    }
}
