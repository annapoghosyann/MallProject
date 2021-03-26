package myMallProject;

public class FoodCourt {
    String name;
    private byte floor;
    Employee[] employees;

    public void setFloor(byte floor) {
        if (floor > 0 && floor < 4)
            this.floor = floor;
    }

    public byte getFloor() {
        return floor;
    }

}
