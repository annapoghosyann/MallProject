package services;

import model.FoodCourt;

import java.util.Scanner;

public class FoodCourtFactory {
    public FoodCourt create() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the names of food outlets");
        String foodOutlets = sc.nextLine();
        System.out.println("Enter in which floor is the Food court");
        int floor = sc.nextInt();
        return new FoodCourt(foodOutlets, floor);
    }
}
