public class forloop {
    public static void main(String args[]){
        final int NUM_FACTS = 100;
        for(int i = 0; i< NUM_FACTS; i++){
            System.out.println(i + "! is " + factorial(i));
        }   
    }

    public static int factorial(int n){
        int results = 1;
        for (int i = 2; i <= n; i++){
            results *= i;
        }
        return results;
    }
}