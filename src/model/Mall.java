package model;

public class Mall {
    private String name;
    private String location;
    private Shop[] shops;
    private Service services;
    private byte floorCount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Shop[] getShops() {
        return shops;
    }

    public void setShops(Shop[] shops) {
        this.shops = shops;
    }

    public Service getServices() {
        return services;
    }

    public void setServices(Service services) {
        this.services = services;
    }

    public byte getFloorCount() {
        return floorCount;
    }

    public void setFloorCount(byte floorCount) {
        this.floorCount = floorCount;
    }
}
