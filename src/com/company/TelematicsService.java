package com.company;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;



public class TelematicsService {

  void report(Date date, VehicleInfo vehicleInfo) {

    try {
      ObjectMapper mapper = new ObjectMapper();
      File f = new File("./" + vehicleInfo.getVIN() + ".json");
      FileWriter fileWriter = new FileWriter(f);
      fileWriter.write(mapper.writeValueAsString(vehicleInfo));
      fileWriter.close();

//      ObjectMapper mapper = new ObjectMapper();
//      VehicleInfo vi = mapper.readValue(.json, VehicleInfo.class);
//      File F = new File("./" + )
//      FileWriter = new FileWriter("fileName.html");
//      FileWriter = new BufferedWriter(FileWriter);
//      FileWriter.write("<span>This iss your html content here</span>");
//      FileWriter.newLine(); //this is not actually needed for html files - can make your code more readable though
//      FileWriter.close(); //make sure you close the writer object

    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }
}