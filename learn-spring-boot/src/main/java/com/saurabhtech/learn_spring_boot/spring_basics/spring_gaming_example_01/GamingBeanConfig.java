package com.saurabhtech.learn_spring_boot.spring_basics.spring_gaming_example_01;

import com.saurabhtech.learn_spring_boot.spring_basics.loose_coupling_example.GamingConsole;
import com.saurabhtech.learn_spring_boot.spring_basics.loose_coupling_example.MarioGame;
import com.saurabhtech.learn_spring_boot.spring_basics.loose_coupling_example.GameRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingBeanConfig {

    @Bean
    public GamingConsole runMarioGame(){
        return new MarioGame();
    }

//    @Bean
//    public GameRunner gameRunner(GamingConsole gamingConsole){
//        return new GameRunner(gamingConsole);
//    }

    @Bean
    public GameRunner gameRunner(){
        return new GameRunner(runMarioGame());
    }
    // We can use both methods pass the parameter or even pass the method call


}
