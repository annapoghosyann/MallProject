package model;

import myexceptions.InvalidAgeException;
import myexceptions.InvalidGenderException;
import myexceptions.InvalidSalaryValueException;

public class Employee {

    private String fullName;
    private int age;
    private char gender;
    private double salaryInDram;
    private String position;
    private String address;
    private String phoneNumber;


        public Employee(String name, int age, char gender, double salary, String position, String address, String phoneNumber) {
        this.fullName = name;
        this.age = age;
        this.gender = gender;
        this.salaryInDram = salary;
        this.position = position;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }


    public void printInfo() throws InvalidAgeException, InvalidSalaryValueException, InvalidGenderException {
        System.out.println("Employee's full name: " + fullName);
        System.out.println("Employee's position: " + position);
        System.out.println("Employee's address: " + address);
        System.out.println("Employee's phoneNumber: " + phoneNumber);

        if (gender != 'f' || gender != 'm')
            throw new InvalidGenderException("Invalid");
        else if (gender == 'm')
        System.out.println("Employee's gender: Male");
        else
            System.out.println("Employee's gender: Female");

        if (age<1)
            throw new InvalidAgeException("Invalid");
        else
            System.out.println("Employee's age: " + age);

        if (salaryInDram<0)
            throw new InvalidSalaryValueException("Invalid");
        else System.out.println("Employee's salaryInDram: " + salaryInDram);
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws InvalidAgeException{
        if (age>17 && age<71)
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (gender == 'f' || gender == 'm')
        this.gender = gender;
    }

    public double getSalaryInDram() {
        return salaryInDram;
    }

    public void setSalaryInDram(double salaryInDram) {
        if (salaryInDram >= 50000)
        this.salaryInDram = salaryInDram;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}