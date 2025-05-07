package udemy_java_for_absolute_beginners.unit1_fundementals.sec4_variables;

public class DataTypes {
    public static void main(String[] args) {
        String name="Martin";
        int age=11;
        char division='A'; // Or just value 65
        System.out.println("My name is " + name);//String concatenation
        System.out.println("My age is " +age);
        System.out.println("My division is " +division);
        System.out.println(10/4);//2
        System.out.println(10.0/4);//2.5
        int a=10;
        int b=4;
        System.out.println("=======");
        System.out.println(a/b);//2
        System.out.println((float)a); //10.0
        System.out.println((float)a/b);//2.5
        System.out.println((float)(a/b));//2.0
        System.out.println((float) 2);
    }
}
