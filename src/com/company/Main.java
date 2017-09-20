package com.company;
import java.util.Scanner;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

      VehicleInfo vehicleInfo = new VehicleInfo();
      Scanner sc = new Scanner(System.in);
      TelematicsService telematicsService = new TelematicsService();


      System.out.println("Enter Vehicles Vin: ");
      int VIN = sc.nextInt();
      vehicleInfo.setVIN(VIN);
      System.out.println("Vehicle's VIN: " + vehicleInfo.getVIN());

      System.out.println("Enter Vehicle's Odometer Reading: ");
      int odometer = sc.nextInt();
      vehicleInfo.setOdometer(odometer);
      System.out.println("Vehicle's Odometer: " + vehicleInfo.getOdometer());

      System.out.println("Enter Vehicle's Oil Consumption: ");
      double consumption = sc.nextDouble();
      vehicleInfo.setConsumption(consumption);


      System.out.println("Enter Vehicle's Last Oil Change: ");
      double lastOilChange = sc.nextDouble();
      vehicleInfo.setLastOilChange(lastOilChange);

      System.out.println("Enter Vehicle's Engine Size:");
      double engineSize = sc.nextDouble();
      vehicleInfo.setEngineSize(engineSize);


      System.out.println("vin: "+VIN);
      System.out.println("Odomter: "+odometer);
      System.out.println("Gas Consumption: "+ consumption);
      System.out.println("Last Oil Change: "+lastOilChange);
      System.out.println("Engine Size: "+engineSize);
      System.out.println(new Date());

      telematicsService.report(new Date(),vehicleInfo);

    }
}
