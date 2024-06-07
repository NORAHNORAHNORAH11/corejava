package array;

import java.util.Scanner;

public class suraj {
    public static void main(String[] args) {
        // WAP to store and print total, average price of 10 books.

        // Create array to store book prices
        int[] bookPrices = new int[10];

        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Write data in array
        for (int i = 0; i < bookPrices.length; i++) {
            System.out.println("Enter book price:");
            bookPrices[i] = sc.nextInt();
        }

        // Close the scanner
        sc.close();

        // Calculate total and average price
        int sum = 0;
        for (int price : bookPrices) {
            sum += price;
        }

        double average = sum / 10.0;

        // Print each book price
        System.out.println("Book prices:");
        for (int price : bookPrices) {
            System.out.println(price);
        }

        // Print total and average price
        System.out.println("Total = " + sum);
        System.out.println("Average = " + average);
    }
}