import java.util.*;
import java.text.*;

public class dateformatting{
    public static void main(String[] args){
        Date dNow = new Date();

        SimpleDateFormat ft = new SimpleDateFormat("yyyy.MM.dd EEEE hh.mm.ss zzz");
        System.out.println(ft.format(dNow));
    }
}