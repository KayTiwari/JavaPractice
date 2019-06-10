public class parameterbyvalue {
    public static void main(String[] args){
        int a = 30;
        int b = 45;

        swapFunction(a, b);
    }
    public static void swapFunction(int a, int b){
        int c = a;
        a = b;
        b = c;
        System.out.println("a = "+a+ " b = "+  b);
    }

}