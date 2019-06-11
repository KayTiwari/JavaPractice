public class finnaly{
    public static void main(String[] args){
    int a[] = new int [2];
    try{
        System.out.println("Access element three" + a[3]);
    }
    catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Exception thrown"+e);
    }
    finally{
        a[0] = 6;
        System.out.println("first element value"+a[0]);
        System.out.println("finally statement executed");
    }
    }
}