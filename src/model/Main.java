package model;

import myexceptions.InvalidAgeException;
import myexceptions.InvalidGenderException;
import myexceptions.InvalidSalaryValueException;
import services.EmployeeFactory;

public class Main {
    public static void main(String[] args) {

//        StoreFactory storeFactory = new StoreFactory();
//        Store store1 = storeFactory.create();
//        store1.printInfo();
//
//        FoodCourtFactory foodCourtFactory = new FoodCourtFactory();
//        FoodCourt foodCourt = foodCourtFactory.create();
//        foodCourt.printInfo();

        EmployeeFactory employeeFactory = new EmployeeFactory();
        Employee employee1 = employeeFactory.create();
        try {
            employee1.printInfo();
        } catch (InvalidSalaryValueException e) {
            System.out.println("Other information will not be visible because of Invalid input value");
        } catch (InvalidAgeException ex) {
            System.out.println("Other information will not be visible because of Invalid input value");
        } catch (InvalidGenderException e) {
            System.out.println("Other information will not be visible because of Invalid input value");
        }

    }
}
