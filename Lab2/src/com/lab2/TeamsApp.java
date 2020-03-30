package com.lab2;
/*
Problem 3
        You have been asked to develop a java application
        to allow to enter the number of Students can hit in the group. The application
        should then calculate and display how many Students can be filled  in the Team and how
        many Students have left over.
        Your application should use instantiable classes to separate the calculations from the user input and output.
        TeamsApp.java
        -- takes input from the user
        -- uses the Teams -- the instantiable class to perform the actual computations
*/
import java.util.*;
public class TeamsApp {

	public static void main(String[] args) {
		
		// declare local variables
		int numStudents, teamSize, numOfTeams, remainings;
		
        //declare a variable called input and create an object of type Scanner
		Scanner input = new Scanner (System.in);
		
        // declare a variable called myTeams to be able to work with an object of type Teams and create an object of type Teams
		Teams myTeams = new Teams();
		
        //input "Please enter the number of students: "
		System.out.println("Please enter number of students: ");
		numStudents = input.nextInt();
		myTeams.setNumOfStudents(numStudents);
		
        //input "Please enter the size of the groups: "
		System.out.println("Please enter the size of group: ");
		teamSize = input.nextInt();
		myTeams.setTeamSize(teamSize);
		
        //process
		myTeams.calc();
		
        //output of getNumOfTeams, getRemmainigs
		numOfTeams = myTeams.getNumOfTeams();
		remainings = myTeams.getRemainings();
		
        System.out.println("The number of teams of "+teamSize+" from a group of "
                + numStudents+" will be "+numOfTeams+" teams with "+remainings+" left over.");


	}

}
