/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.time.LocalDate;

/**
 *
 * @author gokay
 */
public class Earthquake extends Incident {
    private int severity;
    private String type;


    public Earthquake(String incidentAdress, long location, LocalDate time, String type, int severity) {
    super(incidentAdress,location,time,type);
    this.severity = severity;
    this.type = type;
    }

    public int getSeverity() {
        return severity;
    }

    public void setSeverity(int severity) {
        this.severity = severity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    
    
    
}
