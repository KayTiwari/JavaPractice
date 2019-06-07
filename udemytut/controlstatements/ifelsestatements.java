import java.util.Scanner;

public class ifelsestatements{
    public static void main(String[] args){
        int age;
        Scanner inputDevice = new Scanner(System.in);
        System.out.println("Please enter your age");

        age = inputDevice.nextInt();
        if (age >= 18){
            System.out.println("18 or over");
        } else {
            System.out.println("Younger than 18");
        }
    }
}