package com.saurabhTech.SpringFrameworkBasics.tightcouplingexample;

public class GameRunner {
    private MarioGame game;
    private SuperContraGame superContraGame;

    public GameRunner(MarioGame game) {
        this.game = game;
    }

    public GameRunner(SuperContraGame game) {
        this.superContraGame = game;
    }

    public void run(){
        if(null != game){
            System.out.println("Running game " + game);
            game.up();
            game.down();
            game.left();
            game.right();
        }else if(null != superContraGame){
            System.out.println("Running game " + superContraGame);
            superContraGame.up();
            superContraGame.down();
            superContraGame.left();
            superContraGame.right();
        }
    }
}
