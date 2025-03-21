package com.saurabhtech.learn_spring_boot.spring_basics.tight_coupling_example;

public class AppGamingMain {
    public static void main(String[] args) {
//        MarioGame game = new MarioGame();
//        SuperContraGame game = new SuperContraGame();
          PackmanGame game = new PackmanGame();
        GameRunner gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
