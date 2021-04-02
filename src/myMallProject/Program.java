package myMallProject;

public class Program {
    public static void main(String[] args) {
        Mall mall = new Mall();
        mall.name = "MyMall";
        mall.location = "Yerevan, Komitas";
        mall.taxPayerID = "12345";
        mall.floorCount=3;

        Store store1 = new Store();
        store1.name="SportLand";
        store1.shopType(1);
        store1.setFloor((byte) 1);
        store1.getFloor();

        Store store2 = new Store();
        store2.name="Massimo Duty";
        store2.shopType(2);
        store2.setFloor((byte) 2);
        store2.getFloor();

        Store store3 = new Store();
        store3.name="Zara";
        store3.shopType(3);
        store3.setFloor((byte) 2);
        store3.getFloor();

        FoodCourt foodCourt = new FoodCourt();
        foodCourt.shopType();
        foodCourt.name="Food Court";
        foodCourt.setFloor((byte) 3);
        foodCourt.getFloor();


        Security security = new Security();
        security.serviceType();
        security.setFloor((byte) 1);
        security.getFloor();

        Cleaning cleaning = new Cleaning();
        cleaning.serviceType();
        cleaning.setFloor((byte) 1);
        cleaning.getFloor();


        Employee employee1 = new Employee();
        employee1.setName("Ani Vardanyan");
        employee1.getName();
        employee1.setAge(25);
        employee1.getAge();
        employee1.setMale(false);
        employee1.isMale();
        employee1.setPosition("Sales Manager");
        employee1.getPosition();
        employee1.setAddress("Baghramyan");
        employee1.getAddress();
        employee1.setPhoneNumber("091919191");
        employee1.getPhoneNumber();
        employee1.setSalaryInDram(309000);
        employee1.getSalaryInDram();

        Employee employee2 = new Employee();
        employee2.setName("Liana Tovmasyan");
        employee2.getName();
        employee2.setAge(21);
        employee2.getAge();
        employee2.setMale(false);
        employee2.isMale();
        employee2.setPosition("Sales Assistant");
        employee2.getPosition();
        employee2.setAddress("Tumanyan");
        employee2.getAddress();
        employee2.setPhoneNumber("093939393");
        employee2.getPhoneNumber();
        employee2.setSalaryInDram(205000);
        employee2.getSalaryInDram();

        Employee employee3 = new Employee();
        employee3.setName("Samvel Poghosyan");
        employee3.getName();
        employee3.setAge(19);
        employee3.getAge();
        employee3.setMale(true);
        employee3.isMale();
        employee3.setPosition("Sales Assistant");
        employee3.getPosition();
        employee3.setAddress("Nalbandyan");
        employee3.getAddress();
        employee3.setPhoneNumber("097979797");
        employee3.getPhoneNumber();
        employee3.setSalaryInDram(160000);
        employee3.getSalaryInDram();


    }
}
