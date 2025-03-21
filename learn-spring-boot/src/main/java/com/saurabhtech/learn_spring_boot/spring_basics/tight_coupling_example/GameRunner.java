package com.saurabhtech.learn_spring_boot.spring_basics.tight_coupling_example;

import com.saurabhtech.learn_spring_boot.spring_basics.loose_coupling_example.GamingConsole;

public class GameRunner {
    private MarioGame marioGame;
    private SuperContraGame superContraGame;
    private PackmanGame packmanGame;

    public GameRunner(MarioGame marioGame) {
        this.marioGame = marioGame;
    }

    public GameRunner(SuperContraGame superContraGame) {
        this.superContraGame = superContraGame;
    }

    public GameRunner(PackmanGame packmanGame) {
        this.packmanGame = packmanGame;
    }

    public void run(){
        if (null != marioGame){
            marioGame.up();
            marioGame.down();
            marioGame.left();
            marioGame.right();
        }else if (null != superContraGame){
            superContraGame.up();
            superContraGame.down();
            superContraGame.left();
            superContraGame.right();
        } else if (null != packmanGame){
            packmanGame.up();
            packmanGame.down();
            packmanGame.left();
            packmanGame.right();
        }
    }
}
