package udemy_java_for_absolute_beginners.unit1_fundementals.sec5_user_inputs_scanner;

import java.util.Scanner;

public class InputTokens {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("What is your name ?");
        String firstname=scanner.next();
        String lastname=scanner.next();
        System.out.format("The user name is %s %s",firstname,lastname);

        System.out.println("\n\nPlease enter your name again ?");
        Scanner scanner1=new Scanner(System.in);
        String fullName = scanner1.nextLine();
        System.out.format("The user name is %s",fullName);
    }
}
