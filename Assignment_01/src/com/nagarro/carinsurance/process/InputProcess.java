package com.nagarro.carinsurance.process;

import com.nagarro.carinsurance.constant.CarType;
import com.nagarro.carinsurance.constant.InsuranceType;
import com.nagarro.carinsurance.exception.InvalidCarType;
import com.nagarro.carinsurance.exception.InvalidInsuranceType;
import com.nagarro.carinsurance.exception.InvalidPrice;
import com.nagarro.carinsurance.model.Car;

public class InputProcess {
    public Car carDetail(String[] input){

        String model=input[0];
        String type=input[1];
        Double price= Double.valueOf(input[2]);
        String insuranceType=input[3];
        if(!(type.equalsIgnoreCase(String.valueOf(CarType.Hatchback)) ||type.equalsIgnoreCase(String.valueOf(CarType.Sedan))
                || type.equalsIgnoreCase(String.valueOf(CarType.SUV)))){
            throw new InvalidCarType("Invalid car type, Please Enter Hatchback or Sedan or SUV ");
        }
        if(price<0){
            throw new InvalidPrice("Price Can't be negative number");
        }
        if (!(insuranceType.equalsIgnoreCase(String.valueOf(InsuranceType.Premium))|| insuranceType.equalsIgnoreCase(String.valueOf(InsuranceType.Basic))))
            throw new InvalidInsuranceType("Invalid insurance type, Please Enter Basic or Premium");

        Car car=new Car(model,type,price,insuranceType);
        return car;
    }
}
