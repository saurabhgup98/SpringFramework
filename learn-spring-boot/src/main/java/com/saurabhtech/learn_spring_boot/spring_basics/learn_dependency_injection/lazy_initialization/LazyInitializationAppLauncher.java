package com.saurabhtech.learn_spring_boot.spring_basics.learn_dependency_injection.lazy_initialization;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class ClassA {

}

// Lazy can be annotated on class with @Component or Method with @Bean
// Lazy not preferred as we want to see any issues in starting of app(app will not start if any issues)
//      unless there is complex logic
// Lazy can also be used with class@Configuration, then all bean method will be initialized.
// Note: Without Lazy the initialization is called "Eager Initialization & is Default Initialization or
//          By annotation @Lazy(value=false)
@Component
@Lazy
class ClassB {
    private ClassA classA;

    public ClassB(ClassA classA) {
        System.out.println("some initialization logic goes through");
        // If @Lazy is not annotated, This class automatically wired due to Constructor Injection
        // and loaded in the start of the Project or application.
        // Else using lazy whenever the bean is called, that time it will be initialized
        this.classA = classA;
    }

    public void doSomething(){
        System.out.println("Do something:: Inside class B");
    }
}

@Configuration
@ComponentScan
public class LazyInitializationAppLauncher {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(LazyInitializationAppLauncher.class);
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        System.out.println("Initialization of context is completed");
        context.getBean(ClassB.class).doSomething();
    }
}
