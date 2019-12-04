package com.company;

public class Main {

    public static void main(String[] args) {
	Bycicle cycle=new Bycicle();
	cycle.color="green";
	cycle.name="Star";
	cycle.numberOfWheals=2;
	cycle.speed=30;
	cycle.year=2012;
	System.out.println(cycle.miles(4));
	cycle.print();
    }
}
