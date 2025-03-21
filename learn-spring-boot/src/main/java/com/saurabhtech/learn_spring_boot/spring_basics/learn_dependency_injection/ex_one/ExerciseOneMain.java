package com.saurabhtech.learn_spring_boot.spring_basics.learn_dependency_injection.ex_one;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.Arrays;

interface DataService{
    int[] retrieveData();
}

@Component
class MongoDbDataService implements DataService {

    @Override
    public int[] retrieveData() {
        System.out.println("Retrieve Data from MongoDbService");
        return new int[] {10,20,30,40};
    }

}

@Component
@Primary
class MySqlDbService implements DataService{

    @Override
    public int[] retrieveData() {
        System.out.println("Retrieve Data from MySqlDbService");
        return new int[] {100,200,300,400};
    }
}

@Component
class BusinessCalculationService {
    private DataService dataService;

    public BusinessCalculationService(DataService dataService) {
        this.dataService = dataService;
    }

    public int findMax(){
        return Arrays.stream(dataService.retrieveData()).max().orElse(0);
    }
}

@Configuration
@ComponentScan
public class ExerciseOneMain {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ExerciseOneMain.class);
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out:: println);
        System.out.println(context.getBean(BusinessCalculationService.class).findMax());
    }
}
