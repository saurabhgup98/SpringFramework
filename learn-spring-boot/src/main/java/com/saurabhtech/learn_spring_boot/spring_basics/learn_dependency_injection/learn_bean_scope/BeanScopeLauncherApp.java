package com.saurabhtech.learn_spring_boot.spring_basics.learn_dependency_injection.learn_bean_scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
class NormalClass {

}

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
class Prototype{

}

@Configuration
@ComponentScan
public class BeanScopeLauncherApp {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(BeanScopeLauncherApp.class);
        System.out.println(context.getBean(NormalClass.class));
        System.out.println(context.getBean(NormalClass.class));

        System.out.println(context.getBean(Prototype.class));
        System.out.println(context.getBean(Prototype.class));
        /** Observations
         * In Normal class, however time bean is called, hashcode is "Same"
         *      Hence One Object Instance per Spring IOC Container
         * In Prototype class, Everytime same bean is called, hashcode is Different
         *      Hence Many Object Instances per Spring IOC Container
         *
         * Difference: Spring SingleTon Vs Java Singleton
         * Spring Singleton: One instance per spring IOC container
         * Java Singleton : One Instance per JVM
         * NOTE: 99.9 % singleton Prototype is used, as people run1 instance in 1 jvm
         * */

    }
}
