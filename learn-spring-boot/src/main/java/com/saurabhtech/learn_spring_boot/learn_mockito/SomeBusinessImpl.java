package com.saurabhtech.learn_spring_boot.learn_mockito;

public class SomeBusinessImpl {
    private DataService dataService;

    public SomeBusinessImpl(DataService dataService) {

        this.dataService = dataService;
    }

    public int findGreatestFromAllData() {
        int[] data = dataService.retrieveAllData();
        int greatestValue = Integer.MIN_VALUE;
        for(int value: data) {
            if(value > greatestValue) {
                greatestValue = value;
            }
        }
        return greatestValue;
    }
}
