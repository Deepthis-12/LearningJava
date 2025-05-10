package udemy_java_for_absolute_beginners.unit1_fundementals.sec5_user_inputs_with_scanner;

public class StringFormatting {
    public static void main(String[] args) {
        int age = 10;
        String name = "Jack";
        double heightInMeters = 1.6;
        System.out.println("You are " + age + " years old Mr."+name + " and you are "+heightInMeters+" tall");
        System.out.format("You are  %d  years old Mr.%s  and you are %.2f tall",age,"nikki",heightInMeters);
    }

}
