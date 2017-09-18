package com.Strings.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// declare variables
        Scanner sc = new Scanner(System.in);
        String Input;
        String Question1 = "1. The earth revolves around the ___.";
        String Question2 = "2. _______ is the second largest planet in our solar system.";
        String Question3 = "3. A _______ is an object so dense that even light cannot escape its gravity.";
        String Question4 = "4. A ______ is a cloud of gas in which stars form.";
        String Question5 = "5. ______ is the largest moon in our solar system.";
        String Question1Answer = "sun";
        String Question2Answer = "saturn";
        String Question3Answer = "black hole";
        String Question4Answer = "nebula";
        String Question5Answer = "ganymede";
        int TotalCorrect = 0;

        //Ask user the questions and prompt for responses
        System.out.println("Astronomy Quiz");
        System.out.println(Question1);
        Input = sc.nextLine();
        if (Input.equalsIgnoreCase(Question1Answer)) {
            System.out.println("Correct!");
            //add to total for correct number of questions
            TotalCorrect++;
        }
        else {
            System.out.println("Incorrect. The correct answer is " + Question1Answer);
        }
        System.out.println(Question2);
        Input = sc.nextLine();
        if (Input.equalsIgnoreCase(Question2Answer)) {
            System.out.println("Correct!");
            //add to total for correct number of questions
            TotalCorrect++;
        }
        else {
            System.out.println("Incorrect. The correct answer is " + Question2Answer);
        }
        System.out.println(Question3);
        Input = sc.nextLine();
        if (Input.equalsIgnoreCase(Question3Answer)) {
            System.out.println("Correct!");
            //add to total for correct number of questions
            TotalCorrect++;
        }
        else {
            System.out.println("Incorrect. The correct answer is " + Question3Answer);
        }
        System.out.println(Question4);
        Input = sc.nextLine();
        if (Input.equalsIgnoreCase(Question4Answer)) {
            System.out.println("Correct!");
            //add to total for correct number of questions
            TotalCorrect++;
        }
        else {
            System.out.println("Incorrect. The correct answer is " + Question4Answer);
        }
        System.out.println(Question5);
        Input = sc.nextLine();
        if (Input.equalsIgnoreCase(Question5Answer)) {
            System.out.println("Correct!");
            //add to total for correct number of questions
            TotalCorrect++;
        }
        else {
            System.out.println("Incorrect. The correct answer is " + Question5Answer);
        }

        System.out.println("The quiz is complete. You got " + TotalCorrect + " questions correct.");

    }
}
