package com.nagarro.carinsurance.model;

public class Car {
    private String model;
    private String carType;
    private Double price;
    private String insuranceType;

    public Car(String model, String carType, Double price, String insuranceType) {
        this.model = model;
        this.carType = carType;
        this.price = price;
        this.insuranceType = insuranceType;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getInsuranceType() {
        return insuranceType;
    }

    public void setInsuranceType(String insuranceType) {
        this.insuranceType = insuranceType;
    }
}
