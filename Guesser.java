package com.Assignment2;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;



public class Guesser {

	int guessNum;
	
	//This method guesses a random number between 1 to 100 from the user 
	
	public int guessNumber()
	{
		
		boolean integerNo = false;
		
		while (!integerNo) {
			
		try {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Guesser kindly guess the number between 1 to 100: ");
		guessNum=scan.nextInt();
		
		boolean condition = false; //Initialising condition to false;
		
		while (condition != true) { // Until Condition is true loop
		if(guessNum >=1 && guessNum <=100) {
			return guessNum;
		}else {
			System.out.print("Guesser kindly guess the number between 1 to 100: ");
			guessNum=scan.nextInt();
			
			}
		}
		
		
		}catch (InputMismatchException e) {
            System.out.println("This is not a valid number");

           
            continue;	
		}
		
	}
		return guessNum;	
  
	}
}

