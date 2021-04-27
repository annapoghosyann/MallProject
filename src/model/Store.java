package model;

public class Store extends Shop {

    public Store(String name, String type, int floor) {
        super.setName(name);
        super.setFloor(floor);
        super.setShopType(type);
    }

    public void printInfo() {
        System.out.println("Store name: " + name);
        System.out.println("Store type: " + shopType);
        System.out.println("Floor: " + floor);
    }
}
