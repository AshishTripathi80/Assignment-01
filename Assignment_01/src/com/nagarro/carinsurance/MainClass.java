package com.nagarro.carinsurance;

import com.nagarro.carinsurance.exception.InvalidCarType;
import com.nagarro.carinsurance.exception.InvalidInsuranceType;
import com.nagarro.carinsurance.exception.InvalidPrice;
import com.nagarro.carinsurance.model.Car;
import com.nagarro.carinsurance.process.InputProcess;
import com.nagarro.carinsurance.process.InsuranceCalculation;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        inputAcceptor();
    }
    public static void inputAcceptor(){
        Scanner sc = new Scanner(System.in);
        char choice;
        try{
            do{

                System.out.println("Enter the Car Details (Its Model, CarType, Price, Insurance Type)");

                String str = sc.nextLine();
                /* Taking input in one line
                * And split it with space
                * */
                String[] input = str.split(" ");
                InputProcess inputProcess = new InputProcess();
                Car car = inputProcess.carDetail(input); // Calling inputProcess to validate input
                InsuranceCalculation insuranceCalculation=new InsuranceCalculation();
                Double total=insuranceCalculation.calculateInsurance(car); // to calculate Total Insurance
                System.out.println("Car model: "+car.getModel()+", Price: "+car.getPrice()+", total insurance to be paid: "+total);
                System.out.println("Do you want to enter details of any other car (y/n):");
                choice =sc.nextLine().charAt(0);
            }while (choice =='y' || choice =='Y');
        }catch (InvalidCarType e){
            System.out.println("Invalid car type, Please Enter Hatchback or Sedan or SUV");
            inputAcceptor();
        } catch (InvalidInsuranceType e){
            System.out.println("Invalid insurance type, Please Enter Basic or Premium");
            inputAcceptor();
        }catch (InvalidPrice e){
            System.out.println("Enter Price in right format");
            inputAcceptor();
        }catch (NumberFormatException e){
            System.out.println("price can't be character");
            inputAcceptor();
        }
    }

}
