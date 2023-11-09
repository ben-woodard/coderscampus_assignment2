package com.coderscampus.assignment2;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {

		// Generating random number and assigning to gameNumber //
		Random randomNumber = new Random();
		int gameNumber = randomNumber.nextInt(1, 100);

		// Obtain user Guess convert to Integer and assign to convertedUserGuess//
		System.out.println("Pick a number between 1 and 100");
		Scanner gameScanner = new Scanner(System.in);
		String userGuess = gameScanner.nextLine();
		Integer convertedUserGuess = Integer.parseInt(userGuess);

		// While loop to with conditionals comparing gameNumber and convertedUserGuess//
		int i = 1;
		while (i < 5) {
			if (convertedUserGuess < gameNumber) {
				System.out.println("Please pick a higher number");
				userGuess = gameScanner.nextLine();
				convertedUserGuess = Integer.parseInt(userGuess);
				i++;
			} else if (convertedUserGuess > gameNumber) {
				System.out.println("Please pick a lower number");
				userGuess = gameScanner.nextLine();
				convertedUserGuess = Integer.parseInt(userGuess);
				i++;
			}

			// Conditional statement if convertedUserGuess = gameNumber, or user has hit 5 guesses//
			if (convertedUserGuess == gameNumber) {
				System.out.println("You Win!");
				System.out.println(i);
				break;
			} else if (i == 5) {
				System.out.println("You Lose!");
				System.out.println("The number was: " + gameNumber);
			}
		}
		gameScanner.close();
	}
}
