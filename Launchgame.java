package com.Assignment2;

import java.util.Objects;
import java.util.Scanner;

public class Launchgame {
	
	private static String newOption = "no";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("       **Welcome To Guessing Game**      ");
		
		
		
		 boolean submenu = false;

         while (!submenu) {
        	 

     		Umpire u=new Umpire();
     		
     		u.collectNumFromGuesser();
     		u.collectNumFromPlayer();
     		u.compare();
     		 
     		Scanner scanner = new Scanner(System.in);
             System.out.print("\nWould you like to choose another option from the boarding menu system? \nPlease enter yes or no: ");
             newOption = scanner.next();
             newOption =  newOption.toLowerCase();
             switch (newOption) {
                 case "yes":
                	 continue;

                 case "no":
                     submenu = true;
                     break;

                 default:
                     System.out.println("It's not a valid option");
             }
         }
         if (Objects.equals(newOption, "no")){
             System.out.println("Thank you");
            
         }

	}

}




