/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.time.LocalTime;

/**
 *
 * @author Toshiba
 */
public class Flood extends Incident{
    private String type;
    private String severity; //low, middle, high
    private int effectedArea;
    
    public Flood(String incidentAdress, long location, LocalTime time, String type, String severity,
                   int effectedArea) {
    super(incidentAdress,location,time);
    this.type = type;
    this.severity = severity;
    this.effectedArea = effectedArea;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public int getEffectedArea() {
        return effectedArea;
    }

    public void setEffectedArea(int effectedArea) {
        this.effectedArea = effectedArea;
    }
    
    
}
