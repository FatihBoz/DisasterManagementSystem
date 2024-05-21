/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package swing;

import classes.Earthquake;
import classes.FacilityFactory;
import classes.Flood;
import classes.Incident;
import classes.LandSlide;
import classes.User;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;
import javax.swing.SwingUtilities;

/**
 *
 * @author gokay
 */
public class Ooadproject {
     public static ArrayList<User> userList = new ArrayList<>();
     public static ArrayList<Incident> incidentList = new ArrayList<>();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                scanFiles();
                FacilityFactory f = new FacilityFactory();
                createIncidentList();
                
                new Login().setVisible(true);
                
                
            }
        });
       
       
    }
    public static void scanFiles(){
       String fileName = "src\\user.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                String username = data[0];
                String name = data[1];
                String surname = data[2];
                String bloodType = data[3];
                String emailAdress = data[4];
                String password = data[5];
                String phoneNumber = data[6];
                String adress = data[7];
                User user = new User(username,name,surname,bloodType,emailAdress,password,phoneNumber,adress);
                userList.add(user);
                

           }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        
        
   }
    public ArrayList<User> getUserList(){
        return this.userList;
    }
    public static void createIncidentList(){
        String fileName = "src\\earthquake.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                String incidentAdress = data[0];
                long location = Long.valueOf(data[1]);
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy", Locale.ENGLISH);
                LocalDate date = LocalDate.parse(data[2], formatter);
               
                LocalDate time = date; 
                int severity = Integer.parseInt(data[4]);
                Incident i = new Earthquake(incidentAdress, location, time, "Earthquake",severity);
                incidentList.add(i);

           }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        fileName = "src\\flood.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                String incidentAdress = data[0];
                long location = Long.valueOf(data[1]);
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy", Locale.ENGLISH);
                LocalDate date = LocalDate.parse(data[2], formatter);
               
                LocalDate time = date; 
                String severity = data[4];
                int effectedArea = Integer.parseInt(data[5]);
                
                Flood f = new Flood(incidentAdress, location, time, "Flood", severity,effectedArea);
                incidentList.add(f);

           }
        } catch (IOException e) {
            e.printStackTrace();
        }
        fileName = "src\\landslide.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                String incidentAdress = data[0];
                long location = Long.valueOf(data[1]);
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy", Locale.ENGLISH);
                LocalDate date = LocalDate.parse(data[2], formatter);
               
                LocalDate time = date; 
                String severity = data[4];
                int valleyDepth = Integer.parseInt(data[5]);
                
                LandSlide f = new LandSlide(incidentAdress, location, time, "LandSlide", severity,valleyDepth);
                incidentList.add(f);

           }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
    }
    
    

