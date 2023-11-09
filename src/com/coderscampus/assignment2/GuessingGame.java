package com.coderscampus.assignment2;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {

		// Generating random number //

		Random randomNumber = new Random();
		int gameNumber = randomNumber.nextInt(1, 100);

		// Obtain user Guess convert to //
		System.out.println("Pick a number between 1 and 100");
		Scanner gameScanner = new Scanner(System.in);
		String userGuess = gameScanner.nextLine();
		Integer convertedUserGuess = Integer.parseInt(userGuess);

		// While loop if userGuess != gameNumber//
		int i = 1;
		while (i < 6) {
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

	// Conditional statement if userGuess = gameNumber, or user has hit 5 guesses//
			if (convertedUserGuess == gameNumber) {
				System.out.println("You Win!");
				i = 6;
			} else if (i == 6) {
				System.out.println("You Lose!");
				System.out.println("The number was: " + gameNumber);
			}
		}
		gameScanner.close();
	}
}
