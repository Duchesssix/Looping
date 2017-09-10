package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int option = 0;  //declare and initialize variable

        Scanner scanner = new Scanner(System.in);  //create scanner to read user input

        do {
            System.out.println("Please enter the number of your selection: ");  //prompt user for input
            //Display menu selections
            System.out.println("1. 1 scoop Vanilla");
            System.out.println("2. 1 scoop Chocolate");
            System.out.println("3. 1 scoop Strawberry");
            System.out.println("4. 1 scoop Vanilla and 1 scoop Chocolate");
            System.out.println("5. i scoop Vanilla and 1 scoop Strawberry");
            System.out.println("6. i scoop Chocolate and 1 scoop Strawberry");
            System.out.println("7. Exit");

            option = scanner.nextInt();  //get option as an Int

            switch (option) {
                case 1:
                    System.out.println("You have selected:");
                    System.out.println("1. 1 scoop Vanilla");
                    break;
                case 2:
                    System.out.println("You have selected:");
                    System.out.println("2. 1 scoop Chocolate");
                    break;
                case 3:
                    System.out.println("You have selected:");
                    System.out.println("3. 1 scoop Strawberry");
                    break;
                case 4:
                    System.out.println("You have selected:");
                    System.out.println("4. 1 scoop Vanilla and 1 scoop Chocolate");
                    break;
                case 5:
                    System.out.println("You have selected:");
                    System.out.println("5. 1 scoop Vanilla and 1 scoop Strawberry");
                    break;
                case 6:
                    System.out.println("You have selected:");
                    System.out.println("6. 1 scoop Chocolate and 1 scoop Strawberry");
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Invalid entry, please try again.");
            }
        } while (option <1 || option > 7);
    }
}

