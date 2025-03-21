package com.saurabhtech.learn_spring_boot.spring_basics.spring_gaming_example_02;

import com.saurabhtech.learn_spring_boot.spring_basics.loose_coupling_example.GameRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // Merging config class into Main class
@ComponentScan("com.saurabhtech.learn_spring_boot.spring_basics.loose_coupling_example")
public class AppGamingMainTwo {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(AppGamingMainTwo.class);
        context.getBean(GameRunner.class).run();

    }

}
