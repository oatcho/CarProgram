package com.company;

public class Car {

    private String color;
    private String make;
    private String model;
    private int year;

    public void setColor(String carColor) {
        color = carColor;
    }

    public String getColor() {
        return color;
    }

    public void setMake(String carMake) {
        make = carMake;

    }

    public String getMake(){
        return make;
    }

    public void setModel(String carModel) {
        model = carModel;
    }

    public String getModel(){
        return model;
    }

    public void setYear(int carYear){
        year = carYear;
    }

    public int getYear(){
        return year;
    }
}
