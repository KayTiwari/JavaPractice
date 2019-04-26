public class variablesdatatypes3 {
    String myInstanceVar = "Instance Variable";
    public static void main(String[] args){
        variablesdatatypes3 obj1 = new variablesdatatypes3();
        variablesdatatypes3 obj2 = new variablesdatatypes3();
        variablesdatatypes3 obj3 = new variablesdatatypes3();

        System.out.println(obj1.myInstanceVar);
        System.out.println(obj2.myInstanceVar);
        System.out.println(obj3.myInstanceVar);

        obj2.myInstanceVar = "ChangedText";
        System.out.println(obj1.myInstanceVar);
        System.out.println(obj2.myInstanceVar);
        System.out.println(obj3.myInstanceVar);
    }
}