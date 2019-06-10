public class variablesdatatypes4{
    public String myVar = "Instance Variable";
    public void myMethod(){
        String myVar = "Inside Method";
        System.out.println(myVar);
    }

    public static void main(String[] args){
        variablesdatatypes4 obj = new variablesdatatypes4();
        System.out.println("calling method");
        obj.myMethod();
        System.out.println(obj.myVar);
    }
}