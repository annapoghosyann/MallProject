package services;

import model.Store;

import java.util.Scanner;

public class StoreFactory {

    public Store create() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter store name");
        String name = sc.nextLine();
        System.out.println("Choose the store type(enter number from 1 to 6)");
        String type = shopType(sc.nextInt());
        System.out.println("Enter in which floor is the store");
        int floor = sc.nextInt();
        return new Store(name, type, floor);
    }

    public Store getInfo(){
        return create();
    }

    private String shopType(int shopTypeNumber) {
        String type = "";

        switch (shopTypeNumber) {
            case 1:
                type = "Sport";
                break;
            case 2:
                type = "Men";
                break;
            case 3:
                type = "Women";
                break;
            case 4:
                type = "Baby";
                break;
            case 5:
                type = "Household";
                break;
            case 6:
                type = "Electronics";
                break;
        }
        return type;
    }
}