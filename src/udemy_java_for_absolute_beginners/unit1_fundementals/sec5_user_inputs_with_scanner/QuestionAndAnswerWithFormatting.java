package udemy_java_for_absolute_beginners.unit1_fundementals.sec5_user_inputs_with_scanner;
import java.util.Scanner;

public class QuestionAndAnswerWithFormatting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        What is your name ? - Question
        {name} is a good name. - Response

        How old are you,  {name} ? - Question
        Your name is {name} and you are {age} years old  - Response

        What is your height in meters , {name} ? - Question
        {name}, you are {height} in meters  - Response
        */
        System.out.println("what is your name?");
        String name= scanner.next();
        System.out.format("%s is a good name",name);
        System.out.format("\nHow old are you,%s ?",name);

        int age= scanner.nextInt();
        System.out.format("\nYour name is %s and you are %d years old",name,age);
        System.out.format("\n What is your height in meters,%s ?",name);
        double height= scanner.nextDouble();
        System.out.format("\n%s ,you are %f in meters",name,height);
    }

}
