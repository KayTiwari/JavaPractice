public class method{
    public static void main(String[] args){
        int a = 10;
        int b = 6;
        int c = minFunction(a, b);
        System.out.println(c);
    }

    public static int minFunction(int n1, int n2){
        int min;

        if (n1 > n2){
            min = n2;
        } else {
            min = n1;
        }
        return min;
    }
}