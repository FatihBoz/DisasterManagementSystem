/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import classes.FacilityInterface;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author gokay
 */
public class Pharmacy implements FacilityInterface{

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Icon getIcon() {
        return logo;
    }

    public void setLogo(ImageIcon logo) {
        this.logo = logo;
    }
    private String ID;
    private String name;
    private String adress;
    public Icon logo;
    public Pharmacy(String ID, String name, String adress,Icon logo){
        this.ID = ID;
        this.name = name;
        this.adress = adress;
        this.logo = logo;
        
    }

    @Override
    public void createFacilities() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getName() {
        return this.name; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getAdress() {
        return adress; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setName() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setAdress() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
