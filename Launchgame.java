package com.Assignment2;

public class Launchgame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("       **Welcome To Guessing Game**      ");
		
		Umpire u=new Umpire();
		
		u.collectNumFromGuesser();
		u.collectNumFromPlayer();
		u.compare();

	}

}




