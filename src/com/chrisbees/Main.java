package com.chrisbees;

import java.util.HashMap;
import java.util.Map;

public class Main {
   public static Map<String, String> foodAvailable = new HashMap<>();
    public static void main(String[] args) {
	// write your code here
        Kitchen kitchen = new Kitchen();
        kitchen.addFood(foodAvailable);
        //kitchen.purchaseFood();


    }
}
