import java.util.regex.Matcher;
import java.util.regex.Pattern;
//import regex java utility

public class regularexpression {
    public static void main(String[] args){
        String line = "This order was placed for SK900";
        String pattern = "(.*)(\\d+)(.*)";

        Pattern r = Pattern.compile(pattern);
        //call imported object and use compile method passing in the regex pattern

        Matcher m = r.matcher(line);
        //pass line we want searched for matching patterns

        if (m.find()){
            System.out.println("found");
        } else System.out.println("not found" + m.group(0));
        

        
    }
}

//used to search and manipulate data
// pattern class - a pattern object is a compiled representation of a regular express
// provide no public constructor - must invoke a static compile method

// matcher class - an engine that interprets pattern against an input string

// pattern syntax exception - an object that is an unchecked exception that indicates a syntax error in the original pattern