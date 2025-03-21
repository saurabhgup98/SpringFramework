package com.saurabhtech.learn_spring_boot.spring_basics.spring_basics_01;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class AppMain01 {
    public static void main(String[] args) {
        // Launch the spring context
        var context = new AnnotationConfigApplicationContext(SpringBasicsOneConfig.class);

        // Configure the Things we want spring to Manage
        System.out.println("The value of name from Bean named name is" + context.getBean("name"));
        System.out.println("The value of age from Bean named age is :: " + context.getBean("age"));
        System.out.println("The value of Object person from bean named getPerson :: " +
                context.getBean("getPerson"));
        System.out.println("-----------------------------");

        System.out.println("The value of Object person from existing name and age bean :: " +
                context.getBean("getPersonUsingExistingNameAndAgeMethodCall"));
        System.out.println("The value of Object Student from existing getPerson and getUserAddress bean " +
                ":: " + context.getBean("getStudent"));
        System.out.println("The value of Object Student from name,age parameter and getUserAddress bean " +
                ":: " + context.getBean("getStudentUsingParameters"));
        System.out.println("--------------------------------------------------");


        System.out.println("The value of Object Address from bean named getUserAddress :: " +
                context.getBean("getUserAddress"));
        System.out.println("The value of Object User from bean class getUser :: " +
                context.getBean(User.class));
        // NOTE: If we pass "Class Name" to fetch Bean, ensure it has just One bean of that Class ELSE
        //          Get Bean By Name
        System.out.println(context.getBean(User.class));
        System.out.println("---------------------------------------------------------------------------");

        System.out.println("All Beans Internal Bean and we created beans are ");
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        System.out.println("Count of all the beans in the project are :: " +
                context.getBeanDefinitionCount());
    }
}
