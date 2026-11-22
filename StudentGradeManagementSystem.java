package Student_Grade_System;

import java.util.Scanner;

/*
 * Student Grade Management System
 * Group 1
 * Members:
 * Daniel Oudkerk
 * Thuy Tien Dao
 * Cameron Patterson
 * Omar Reyes
 */

public class StudentGradeManagementSystem {
	
	static final int MAX_STUDENTS = 50;					// Max student amount
    static String[] names = new String[MAX_STUDENTS];   // array 1 → student names
    static int[] grades = new int[MAX_STUDENTS];        // array 2 → student grades
    static int count = 0;                               // students currently stored
    static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		 System.out.println("Welcome please type the number for one of the following options");
	        int choice;
	        do {
	            printMenu();
	            choice = readChoice();
	            switch (choice) {
	                case 1: addStudent(); break;
	                case 2: displayAll(); break;
	                case 3: findGrade(); break;
	                case 4: showAverage(); break;
	                case 5: showHighestLowest(); break;
	                case 6: System.out.println("Goodbye!"); break;
	                default: System.out.println("Invalid choice! Please enter a number between 1 and 6.");
	            }
	            System.out.println();
	        } while (choice != 6);
		}

	//Method to show the selection menu
	
	public static void printMenu() {
        System.out.println("1. Add Student and Grade");
        System.out.println("2. Display All Students and Grades");
        System.out.println("3. Find a Student's Grade");
        System.out.println("4. Calculate Class Average");
        System.out.println("5. Find Highest and Lowest Grades");
        System.out.println("6. Exit");
    }
	
	//Method to read the choices
	
	public static int readChoice() {			
		System.out.print("Please enter a number for one of the following options: ");
        if (!input.hasNextInt()) {
            input.nextLine();          // discard the invalid text
            return -1;
        }
        int choice = input.nextInt();
        input.nextLine();              // consume the newline left by nextInt()
        return choice;
    }
	
	public static void addStudent() { 
		/* TODO Method to Allow users to enter a student name and the corresponding grade.
		Store student information using parallel 1D arrays:
		One array for student names
		One array for student grades (option 1)*/ 
	}
	
	public static void displayAll() { 
	// TODO Method to display all students in the system (option 2)
	}
	public static void findGrade() { 
	// TODO Method to Allow users to search for a student’s grade by entering the student’s name. (option 3) 
	}
	public static void showAverage() { 
	// TODO Method to Compute and display the average grade of all students currently stored. (option 4) 
	}
	public static void showHighestLowest() { 
	//TODO Method to Identify and display: The student with the highest grade & The student with the lowest grades (option 5) 
	}
	
}
