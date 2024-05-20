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
public class LandSlide extends Incident {
    private String type;
    private String severity;
    private int valleyDepth;
    
    public LandSlide(String incidentAdress, long location, LocalTime time, String type, String severity,
            int valleyDepth) {
        super(incidentAdress, location, time);
        this.type = type;
        this.severity = severity;
        this.valleyDepth = valleyDepth;
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
    
    
}
