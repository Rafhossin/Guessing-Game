package com.Assignment2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Player {
int playerGuessNum;
	
	public int guessNumber()
	{

		boolean integerNo = false;
		
		while (!integerNo) {
			
		try {
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Player kindly guess the number: ");
		playerGuessNum=scan.nextInt();
		return playerGuessNum;
		}catch (InputMismatchException e) {
            System.out.println("This is not a valid number");

          
            continue;
        }
	}
		return playerGuessNum;
	}
}
