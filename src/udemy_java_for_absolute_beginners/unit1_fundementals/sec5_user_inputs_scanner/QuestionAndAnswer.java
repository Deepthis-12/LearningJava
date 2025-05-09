package udemy_java_for_absolute_beginners.unit1_fundementals.sec5_user_inputs_scanner;
import java.util.Scanner;

public class QuestionAndAnswer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        What is your name ? - Question
        {name} is a good name. - Response

        How old are you,  {name} ? - Question
        Your name is {name} and you are {age} years old - Response

        What is your height in meters , {name} ? - Question
        {name}, you are {height} in meters - Response
        */
        System.out.println("what is your name?");
        String name=scanner.next();
        System.out.println(name+" is a good name");
        System.out.println("How old are you, " +name+ " ?");
        int age= scanner.nextInt();
        System.out.println("Your name is "+ name+ " and you are " +age+ " years old");
        System.out.println(" What is your height in meters," +name+ "?");
        double height= scanner.nextDouble();
        System.out.println(name+ ",you are "+height+ " in meters");
    }

}
