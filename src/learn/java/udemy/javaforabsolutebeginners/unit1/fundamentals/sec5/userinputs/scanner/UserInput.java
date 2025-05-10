package learn.java.udemy.javaforabsolutebeginners.unit1.fundamentals.sec5.userinputs.scanner;
import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        System.out.println("Enter something");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("User entered : "+name);
    }

}
