package learn.java.udemy.javaforabsolutebeginners.unit1.fundamentals.sec5.userinputs.scanner.exercises;

import java.util.Scanner;

/*
Write a program which divides a restaurant bill so that each person pays an equal amount. Take a look at the hints below
if you get stuck.

Input: no of people,total bill amount
Output: individual bill amount
*/
public class DividingRestaurantBill {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number of people: ");
        int people= scanner.nextInt();
        System.out.println("Enter bill total: ");
        double billAmount=scanner.nextDouble();
        System.out.format("A bill of %.2f is split between %d people comes to approximately: %.2f",
                billAmount, people, billAmount/people);
    }
}
