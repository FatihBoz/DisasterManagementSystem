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
public abstract class Incident {
    private String incidentAdress;
    private long location;
    private LocalTime time;

    public Incident(String incidentAdress, long location, LocalTime time){
    this.incidentAdress = incidentAdress;
    this.location = location;
    this.time = time;
    }
    
    public String getIncidentAdress() {
        return incidentAdress;
    }

    public void setIncidentAdress(String incidentAdress) {
        this.incidentAdress = incidentAdress;
    }

    public long getLocation() {
        return location;
    }

    public void setLocation(long location) {
        this.location = location;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }
            
    
    
    
    
}
