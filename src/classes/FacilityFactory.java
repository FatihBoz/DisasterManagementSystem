/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/L icenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JList;
import swing.Ooadproject;
import static swing.Ooadproject.userList;

public class FacilityFactory extends JFrame{
    public static ArrayList<FacilityInterface> facilityList = new ArrayList<>();
    
    public FacilityFactory(){
        createFacility();
        
    }
    public static void createFacility(){
        
        String fileName = "src\\facility.txt";
            
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            br.readLine();
            while ((line = br.readLine()) != null) {
               
                String[] data = line.split(",");
                String ID = data[0];
                String name = data[1];
                String adress = data[2];
                Icon i = new ImageIcon("src\\" +ID + ".png");
              
                
                            
                if(ID.charAt(0) == '1'){
                    FacilityInterface f = new Hospital(ID, name, adress,i);
                    facilityList.add(f);
                    
                }
                else if(ID.charAt(0) == '2'){
                    FacilityInterface f = new MusterPoint(ID, name, adress,i);
                    
                    facilityList.add(f);
                }
                else if(ID.charAt(0) == '3'){
                    FacilityInterface f = new Pharmacy(ID, name, adress,i);
                    
                    facilityList.add(f);
                }
                
               

           }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        
    }
    
  
}
