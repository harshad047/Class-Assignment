package com.tss.creational.builder.model;

public class SportsCarBuilder implements CarBuilder{
	private Car car = new Car();

    public void buildEngine() {
        car.setEngine("V8 Engine");
    }

    public void buildWheels() {
        car.setWheels(4);
    }

    public void buildAirConditioning() {
        car.setAirConditioning(true);
    }

    public Car getCar() {
        return car;
    }
}
