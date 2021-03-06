package com.example.stepped_01.Bmi;

public class Bmi {
    private double height;
    private double weight;
    private String gender;
    private double age;

    public Bmi() {

    }

    public Bmi(double height, double weight, String gender, double age) {
        this.height = height;
        this.weight = weight;
        this.gender = gender;
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }
}
