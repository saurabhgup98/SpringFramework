package com.saurabhtech.learn_spring_boot.spring_basics.spring_basics_01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age){};
/** When we create class, we need to declare constructor,getter & setters etc
 *  Using this no need to declare all those things
 *  Introduced in JDK 16 */
record User(String name, String id){};

record Address(String address, String city) {};
record Student(Person person,Address address) {};

@Configuration
public class SpringBasicsOneConfig {
    // Spring Beans => Things Managed By Spring
    // Here define methods to create ths spring Beans

    @Bean
    public String name(){
        return "Saurabh";
    }

    @Bean
    public int age(){
        return  29;
    }

    @Bean
    public Person getPerson(){
        return new Person("Rashi", 29);
    }

    @Bean(name = "getUserAddress") // we can give custom name to the BEan
    public Address getAddress() {
        return new Address("Baker Street", "London");
    }

    @Bean
    public User getUser(){
        return new User("Akash","1");
    }

    @Bean
    @Primary
    public User getUserTwo(){
        return new User("Nita","2");
    }

    @Bean
    public Person getPersonUsingExistingNameAndAgeMethodCall(){
        return new Person(name(),age());
    }

    @Bean
    public Student getStudent() {
        return new Student(getPerson(),getAddress());
    }

    @Bean
    public Student getStudentUsingParameters(String name, int age, Address address){
        return new Student(new Person("Surabhi",28),getAddress());
    }
}
