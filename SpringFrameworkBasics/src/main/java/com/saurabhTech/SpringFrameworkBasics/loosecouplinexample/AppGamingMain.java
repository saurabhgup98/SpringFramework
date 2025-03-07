package com.saurabhTech.SpringFrameworkBasics.loosecouplinexample;

public class AppGamingMain {
    public static void main(String[] args) {
        var game = new MarioGame();
//        var game = new SuperContra();
//        var game = new Packman();
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
