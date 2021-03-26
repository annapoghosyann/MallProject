package myMallProject;

public class Shop {
    String name;


    String shopType (int shopTypeNumber){

  //      make get set,, make with arrays
        switch (shopTypeNumber){
            case 1:
                return "Sport";
            case 2:
                return "Men";
            case 3:
                return "Women";
            case 4:
                return "Baby";
            case 5:
                return "Household";
            case 6:
                return "Electronics";
            default:
                return "Invalid input!";
        }
    }


    private byte floor;
    public void setFloor(byte floor) {
        if (floor > 0 && floor < 4)
        this.floor = floor;
    }

    public byte getFloor() {
        return floor;
    }

}
