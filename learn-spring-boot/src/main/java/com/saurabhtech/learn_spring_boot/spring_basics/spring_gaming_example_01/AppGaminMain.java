package com.saurabhtech.learn_spring_boot.spring_basics.spring_gaming_example_01;

import com.saurabhtech.learn_spring_boot.spring_basics.loose_coupling_example.GameRunner;
import com.saurabhtech.learn_spring_boot.spring_basics.loose_coupling_example.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppGaminMain {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(GamingBeanConfig.class);
        context.getBean(GamingConsole.class).up();
        context.getBean(GameRunner.class).run();
    }
}
