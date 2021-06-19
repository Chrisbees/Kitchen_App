package com.chrisbees;

import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class Kitchen {
    public static LinkedList<String> mapKeys = new LinkedList<>();

    public void addFood(Map<String, String> foodItems) {
        foodItems.put("Amala", "Amala costs #1000 for a plate");
        foodItems.put("Beans", "Beans costs #1500 for a plate");
        foodItems.put("Rice", "Rice costs #1000 for a plate");
        foodItems.put("Chinese Rice", "Chinese Rice costs #2000 for a plate");
        foodItems.put("Eba", "Eba costs #300 for a plate");
        foodItems.put("Spaghetti", "Spaghetti costs #3000 for a plate");
        foodItems.put("Pizza", "Pizza costs #4000 for a pack");
        foodItems.put("Doughnut", "Doughnut costs #500 for one");
        foodItems.put("Coffee", "Coffee costs #300 for a cup");
        foodItems.put("Meat Pie", "Meat Pie costs #400 for a one");

        for (String key : foodItems.keySet()) {
            mapKeys.add(key);
             System.out.println(key);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome, What would you like to order?: ");
        String food = scanner.nextLine();

        if (foodItems.containsKey(searchFood(food))) {
            System.out.println("You have ordered for: " + food + " " + foodItems.get(food) + "\nWould you like to proceed with the order?");
            food = scanner.nextLine().toLowerCase();
            if (food.equalsIgnoreCase("Yes")){
                System.out.println("Please hold on while we process your order");
            } else {
                System.out.println("Would you like to order something else? ");
                food = scanner.nextLine().toLowerCase();
                if (food.equals("Yes")){
                    System.out.println("What would you like to order? ");
                    food = scanner.nextLine();
                    System.out.println(food + " coming right up, please hold on");
                } else {
                    System.out.println("Thanks for coming, See you next time");
                }
            }
        } else {
            System.out.println("This doesn't exists");
        }
    }


    public  String searchFood(String food) {
        int low = 0;
        int high = mapKeys.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            String midVal = mapKeys.get(mid);
            int cmd = midVal.compareTo(food);
            if (cmd < 0) {
                high = mid - 1;
            } else if (cmd > 0) {
                low = mid + 1;
            } else {
                return mapKeys.get(mid);
            }
        }
        return "Doesn't exists";
    }

}


