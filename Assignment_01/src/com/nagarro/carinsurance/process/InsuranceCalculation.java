package com.nagarro.carinsurance.process;

import com.nagarro.carinsurance.constant.CarType;
import com.nagarro.carinsurance.constant.InsuranceType;
import com.nagarro.carinsurance.model.Car;

public class InsuranceCalculation {
    public Double calculateInsurance(Car car){
        String type=car.getCarType();
        Double price = car.getPrice();
        String insuranceType= car.getInsuranceType();
        Double total_insurance=0.0;
        if(type.equalsIgnoreCase(String.valueOf(CarType.Hatchback))) {
            total_insurance = (price * 5) / 100;
            if (insuranceType.equalsIgnoreCase(String.valueOf(InsuranceType.Premium)))
                total_insurance = total_insurance + (total_insurance * 20) / 100;

        } else if (type.equalsIgnoreCase(String.valueOf(CarType.Sedan))) {
            total_insurance = (price * 8) / 100;
            if (insuranceType.equalsIgnoreCase(String.valueOf(InsuranceType.Premium)))
                total_insurance = total_insurance + (total_insurance * 20) / 100;

        } else if (type.equalsIgnoreCase(String.valueOf(CarType.SUV))) {
            total_insurance = (price * 10) / 100;
            if (insuranceType.equalsIgnoreCase(String.valueOf(InsuranceType.Premium)))
                total_insurance = total_insurance + (total_insurance * 20) / 100;

        }
        return  total_insurance;
    }
}
