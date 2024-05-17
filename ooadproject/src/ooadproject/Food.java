/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ooadproject;

import java.util.Date;

/**
 *
 * @author Toshiba
 */

public class Food {
	private double calories;
	private String name;
	
	public Food(String name, double calories){
		this.name=name;
		this.calories=calories;
	}
	public double getCalories(){
		return this.calories;
	}
	public String getName(){
		return this.name;
	}
}
