public class variablesdatatypes2{
        static int count = 0;

        public void increment() {
            count++;
        };

        public static void main(String[] args) {
            variablesdatatypes2 obj1 = new variablesdatatypes2();
            variablesdatatypes2 obj2 = new variablesdatatypes2();
            obj1.increment();
            obj2.increment();

            System.out.println(obj1.count);
            System.out.println(+obj2.count);
        }
}