/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author gokay
 */
public abstract class Incident {
    private String type;
    private String incidentAdress;
    private long location;
    private LocalDate time;

    public Incident(String incidentAdress, long location, LocalDate time,String type){
    this.incidentAdress = incidentAdress;
    this.location = location;
    this.time = time;
    this.type = type;
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

    public LocalDate getTime() {
        return time;
    }

    public void setTime(LocalDate time) {
        this.time = time;
    }
    public String getType(){
        return type;
    }
}
