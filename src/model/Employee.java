package model;

public class Employee {
    private String fullName;
    private int age;

    private char gender;
    private double salaryInDram;
    private String position;
    private String address;
    private String phoneNumber;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
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

 //   Role role;     // global in which shop works

}