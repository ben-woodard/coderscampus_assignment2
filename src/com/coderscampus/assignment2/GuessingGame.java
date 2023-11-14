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
		int guessCount = 1;
		while (convertedUserGuess != gameNumber) {

			// Conditional if convertedUserGuess = gameNumber
			if (convertedUserGuess == gameNumber) {
				System.out.println("You Win!");
				break;
			}

			// Conditional Statements for guessCount < 5
			if (guessCount < 5) {
				if (convertedUserGuess < 1 || convertedUserGuess > 100) {
					System.out.println("Your guess is not between 1 and 100, please try again");
					userGuess = gameScanner.nextLine();
					convertedUserGuess = Integer.parseInt(userGuess);
				} else if (convertedUserGuess < gameNumber) {
					guessCount++;
					System.out.println("Please pick a higher number");
					userGuess = gameScanner.nextLine();
					convertedUserGuess = Integer.parseInt(userGuess);
				} else if (convertedUserGuess > gameNumber) {
					guessCount++;
					System.out.println("Please pick a lower number");
					userGuess = gameScanner.nextLine();
					convertedUserGuess = Integer.parseInt(userGuess);
				}
			}

			// conditionals for guessCount == 5
			if (guessCount == 5) {
				if (convertedUserGuess > 100 || convertedUserGuess < 1) {
					System.out.println("Your guess is not between 1 and 100, please try again");
					userGuess = gameScanner.nextLine();
					convertedUserGuess = Integer.parseInt(userGuess);
				} else {
					System.out.println("You Lose!");
					System.out.println("The number was: " + gameNumber);
					break;
				}
			}
			System.out.println(guessCount);
		}
		gameScanner.close();
	}
}
