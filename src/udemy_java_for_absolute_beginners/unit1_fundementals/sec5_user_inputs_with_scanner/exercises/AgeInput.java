package udemy_java_for_absolute_beginners.unit1_fundementals.sec5_user_inputs_with_scanner.exercises;

import java.util.Scanner;

public class AgeInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("First Name: ");
        String firstName = scanner.next();

        System.out.print("Age: ");
        int age = scanner.nextInt();

        System.out.print("Amount of money in your pocket: £");
        double money = scanner.nextDouble();

        System.out.println();

        double moneyNeeded = Math.ceil(money) - money;

        System.out.println("Your name is " + firstName + " and you are " + age + " years old.");
        System.out.format("You have £%.2f on you and need £%.2f.", money, moneyNeeded);

        /*Exercise1: It prints “You’ve lived x years. In another x years you’ll be 2x years old.”,
        where x is their age. */
        System.out.format("\nYou’ve lived %d years. In another %d years you’ll be %d years old.",age,age,2*age);
        System.out.println("\nYou’ve lived "+age+" years. In another " +age+" years you’ll be "+2*age+" years old.");

        /*
        It informs the user of how many characters are in their name. Use .length() method on the string
        "Your name is x and your name has y characters"
        */

        System.out.format("\nYour name is %s and your name has %d characters",firstName, firstName.length());

    }
}
