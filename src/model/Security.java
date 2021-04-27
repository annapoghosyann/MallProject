package model;

public class Security implements Service{

    public String serviceType(){
        return "This is the Security section!";
    }
    Employee[] employees;
    private byte floor;

    public void setFloor(byte floor) {
        if (floor > 0 && floor < 4)
            this.floor = floor;
    }
    public byte getFloor() {
        return floor;
    }
}
