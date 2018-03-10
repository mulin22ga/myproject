package com.java2.object;

public class Car {
private double discount;
String CarName;
int price;

public Car (String CarName,int price,double discount) {
	this.CarName=CarName;
	this.price=price;
	this.discount=discount;
}
public void print() {
	System.out.println(CarName+"\t"+price+"\t"+discount+"\t"+getTotalPrice());
}
public int getTotalPrice() {
	return (int) (price*discount);
}
}
