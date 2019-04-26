import java.util.Scanner;

public class hello2 {
    public static void main(String args[]){
    Scanner userInputScanner = new Scanner(System.in);
    //Scanner is set to read user input
    System.out.print("What is your name? ");
    String userInputName = userInputScanner.nextLine();
    //Calling our scanner object and using it't built in method "next line";
    System.out.println("Hello " + userInputName + "!");
    }
}