public class operators {
    public static void main(String[] args){


        //Arithmetic operators
        //  +, -, *, /, %
        // a = 10; b = 10; c = a + b = 20;
        // int num1 = 100;
        // int num2 = 20;
        // System.out.println("Num1 + Num2 = " + (num1 + num2));


        //Assigment operator
        //Re-assigning values to variables
        // int num1 = 10;
        // int num2 = 20;
        // num2 = num1;
        // System.out.println("output = " +num2);


        //Inc/Dec operator
        //num++     auto-increment
        //num--     auto-decrement
        // int num1 = 100;
        // int num2 = 200;
        // num1++;
        // num2--;
        // System.out.println(num1);
        // System.out.println(num2);


        //Logical operators
        // && = and // || = or
        // boolean b1 = true;
        // boolean b2 = false;
        // System.out.println(b1 && b2);
        // System.out.println(b1 || b2);


        //Relational operators
        // =, ==, ===, >, <, >=, <=, <==, >==,
        // int num1 = 10;
        // int num2 = 50;
        // if (num1 == num2){
        //     System.out.println("num1 & num2 are equal");
        // } else{
        //     System.out.println("num1 & num2 are not equal");
        // }


        //Bitwise operators
        // int num1 = 11;
        // int num2 = 22;
        // int result = 0;
        // result = num1 & num2;
        // result2 = num1 | num2;
        // result3 = num1 ^ num2;
        // result4 = num1;
        // result5 = num1 << num2;
        // result5 = num1 >> num2;
        // result5 = num1 >>> num2;
        // System.out.println("num1 & num2 " + +result);


        //Ternary operators
        int num1 , num2;
        num1 = 25;
        num2 = (num1 == 10) ? 100 : 200;
        System.out.println(num2);

        num2 = (num1 == 25) ? 100: 200;
        System.out.println(num2);
    }
}