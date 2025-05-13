package learn.java.udemy.javaforabsolutebeginners.unit1.fundamentals.sec6.conditionalstatements;

import java.util.Scanner;

public class ElseIfStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to roller coaster !!");
        System.out.print("Enter you height in centimeters: ");
        int heightInCentimeters = scanner.nextInt();
        if (heightInCentimeters < 130){
            System.out.println("You are too short !");
        } else if (heightInCentimeters > 210) {
            System.out.println("You are too tall !");
        } else{
            System.out.println("Height accepted. Go ahead !");
        }
    }
}
