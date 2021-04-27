package model;

public abstract class Shop {
    protected String name;
    Employee[] employees;
    protected int floor;
    protected String shopType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        if (floor >= 0 && floor < 10)
        this.floor = floor;
    }

    public String getShopType() {
        return shopType;
    }

    public void setShopType(String shopType) {
        this.shopType = shopType;
    }
}
