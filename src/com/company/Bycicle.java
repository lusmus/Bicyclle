package com.company;

public class Bycicle {
    public String name;
    public int year;
    public String color;
    public int speed;
    public int numberOfWheals;

    public int miles(int n){
        return speed*n;
    }
    public void print(){
        System.out.println(name);
    }
}
