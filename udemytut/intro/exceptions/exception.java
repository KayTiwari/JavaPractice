import java.io.file;
//import io
import java.io.FileReader;

public class exception {
    public static void main(String[] args){
        File file = new File("E://file.txt");
        FileReader fr = new FileReader(file);
        //takes file as a parameter



    }
}

// exceptional events are problems that arise during execution of program
// normal flow of program is disturbed and the program may not terminate right
// an exception can occur for many reasons - ex. invalid data, file cannot be found, network connection lost
// some exceptions are caused by user error or physical resources that have failed

//1. Chat Exception - exception that occurs during compiler time - programmers handle these errors the mode
//2. Throw Exception - if a method does not handle an exception, the methods THROWS the exception error - user can access the error with a throw
//3.