package udemy_java_for_absolute_beginners.unit1_fundementals.sec5_user_inputs;
import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        System.out.println("Enter something");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("User entered : "+name);
    }

}
