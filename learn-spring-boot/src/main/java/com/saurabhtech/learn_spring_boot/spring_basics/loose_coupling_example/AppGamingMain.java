package com.saurabhtech.learn_spring_boot.spring_basics.loose_coupling_example;

public class AppGamingMain {
    public static void main(String[] args) {
        MarioGame game = new MarioGame();
        GameRunner gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
