package com.thoughtworks.DataHandler;

import java.util.HashMap;
import java.util.Map;

public class HandleDish {
    private String USER_DISH;
    private Map<String,Integer> Dishes;

    public HandleDish(String USER_DISH) {
        this.USER_DISH = USER_DISH;
    }

    public void getMapOfDish() {
        Map<String,Integer> dishes = new HashMap<>();
        String[] allDishes = USER_DISH.split(",");
        for(String value : allDishes) {
            String[] info = value.split(" x ");
            dishes.put(info[0],Integer.parseInt(info[1]));
        }
        Dishes = dishes;
    }


    public Map<String, Integer> getDishes() {
        return Dishes;
    }
}
