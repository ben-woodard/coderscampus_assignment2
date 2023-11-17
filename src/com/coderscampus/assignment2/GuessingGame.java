package com.coderscampus.assignment2;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		Random randomGenerator = new Random();
		int gameNumber = randomGenerator.nextInt(1, 101);

		int userGuess = 0;
		int guessCount = 0;
		while (guessCount < 5) {
			System.out.println("Pick a number between 1 and 100");
			Scanner gameScanner = new Scanner(System.in);
			userGuess = Integer.parseInt(gameScanner.nextLine());

			if (guessCount < 5) {
				if (userGuess < 1 || userGuess > 100) {
					System.out.println("Your guess is not between 1 and 100, please try again");
					continue;
				}
				if (userGuess == gameNumber) {
					System.out.println("You win!");
				} else if (userGuess < gameNumber) {
					System.out.println("Please pick a higher number");

				} else if (userGuess > gameNumber) {
					System.out.println("Please pick a lower number");
				}
				guessCount++;
			}

			if (userGuess != gameNumber) {
				System.out.println("You lose!");
				System.out.println("The number was: " + gameNumber);
			}
			gameScanner.close();
		}
	}
}
