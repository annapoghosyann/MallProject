package services;

import model.Employee;

import java.util.Scanner;

public class EmployeeFactory {
    public Employee create() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee's full name");
        String name = sc.nextLine();
        System.out.println("Enter employee's age");
        int age = sc.nextInt();
        System.out.println("Enter employee's gender(f if Female, m if Male)");
        char gender = sc.next().charAt(0);

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter employee's position");
        String position = scan.nextLine();
        System.out.println("Enter employee's address");
        String address = scan.nextLine();
        System.out.println("Enter employee's salary in Dram");
        double salary = scan.nextDouble();
        System.out.println("Enter employee's phone number");
        String phoneNumber = scan.next();

        return new Employee(name, age, gender, salary, position, address, phoneNumber);
    }
}