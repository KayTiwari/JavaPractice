import java.util.Scanner;

public class switchstatements{
    public static void main(String[] args){
        int age;
        Scanner inputDevice =  new Scanner(System.in);

        System.out.println("What is your age?");
        age = inputDevice.nextInt();
        switch(age){
            case 18: 
                System.out.println("is 18");
                break;
            case 19: 
                System.out.println("is 19");
                break;
            case 20: 
                System.out.println("is 20");
                break;
            // case (age < 18):
            //     System.out.println("not old enough");
            //boolean does not work here
            default:
                System.out.println("fuck you");
                break;
        }
    }
}