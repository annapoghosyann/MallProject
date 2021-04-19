package model;

public class FoodCourt extends Shop {

    private static final String SHOP_TYPE = "FoodCourt";
    private String foodOutlets;

    public FoodCourt(String foodOutlets, int floor) {
        this.setFoodOutlets(foodOutlets);
        super.setFloor(floor);
    }

    public void printInfo() {
        System.out.println("Shop type: " + SHOP_TYPE);
        System.out.println("Food outlets: " + foodOutlets);
        System.out.println("Floor: " + floor);
    }


    public String getFoodOutlets() {
        return foodOutlets;
    }

    public void setFoodOutlets(String foodOutlets) {
        this.foodOutlets = foodOutlets;
    }
}
