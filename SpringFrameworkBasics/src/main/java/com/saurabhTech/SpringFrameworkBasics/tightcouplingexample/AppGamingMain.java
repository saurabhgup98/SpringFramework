package com.saurabhTech.SpringFrameworkBasics.tightcouplingexample;

public class AppGamingMain {
    public static void main(String[] args) {
//        var game = new MarioGame();
        var game = new SuperContraGame();

        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }

}
