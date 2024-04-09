/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class MainClass {
	Scanner scanner = new Scanner(System.in);

    Freshman freshman = new Freshman("James", (short)20, 12); // Fixed the class instantiation
    Senior senior = new Senior("John", (short)30, 90); // Fixed the class instantiation

    System.out.print("Enter GPA for freshman: ");
    freshman.setGpa(scanner.nextDouble()); // ToDo 12: Set the gpa of the student using the scanner

    System.out.print("Enter GPA for senior: ");
    senior.setGpa(scanner.nextDouble()); // ToDo 12: Set the gpa of the student using the scanner

    System.out.println(freshman);
    System.out.println(senior);

 public static void main(String[] args) {
		// ToDo 5: Fix the error

		// ToDo 6: Fix the constructor of the Student class

                // Todo 7: Create two classes for Freshman and Senior 
	 // Freshman class
public class Freshman extends Student {

    private int credits;

    public Freshman(String name, short age, int credits) {
        super(name, age);
        this.credits = credits;
    }
	// Senior class
public class Senior extends Student {

    private static final int MIN_CREDITS = 85; // ToDo 8: The senior class should have a minimum of 85 credits

    private int credits;

    public Senior(String name, short age, int credits) {
        super(name, age);
        if (credits < MIN_CREDITS) {
            throw new IllegalArgumentException("Senior students must have at least " + MIN_CREDITS + " credits.");
        }
        this.credits = credits;
    }
	public String toString() { // ToDo 11: Add a toString method for the Senior class
    return super.toString() + ", Credits: " + credits;
}
}

                // ToDo 8: The senior class should have a minimum of 85 credits  

		// ToDo 9: Add a toString method for the Student class
		public String toString() { 
    return "Name: " + getName() + ", Age: " + getAge() + ", GPA: " + gpa;
}
	 
		// ToDo 10: Add a toString method for the Freshman class
		public String toString() { 
        return super.toString() + ", Credits: " + credits;
    }
		Student std1= new Student("James", 20);
                // ToDo 11: Add a toString method for the Senior class

		Freshman std1= new Student("James", 20, 12); // name, age, credits

                Senior std2 = new Student("John", 30, 90);

		// ToDo 12: Set the gpa of the student using the scanner and user
		// 			input and then print the output.

		System.out.println(std1);

                System.out.println(std2);

		// ToDo 13: add comments and explain your code

		// ToDo 14: submit using a pull request.
	}

}

