/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class Student extends Human { // ToDo 1: Make this class a child of Human
	
	// ToDo 2: Fix the resulting errors
	 private double gpa;
	// ToDo 3: Add a field for GPA and create a setter and a getter
	//Constructor
	 public Student(String name, short age) {
        super(name, age); // Calling the parent constructor
    }
 // getter for GPA
	public double getGpa() {  // ToDo 3: Getter for GPA
        return gpa;
    }
   //setter for GPA
	public void setGpa(double gpa) { // ToDo 3: Setter for GPA
        this.gpa = gpa;
    }
	// ToDo 4: Add comments to your code
}
