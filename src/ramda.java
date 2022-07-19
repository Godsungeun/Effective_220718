public class ramda {
    public static void main(String[] args) {
//        Object obj = new Object() {
//            int sum(int num1, int num2) {
//                return num1+num2;
//            }
//        };

        exampleFun example = (num1, num2) -> num1+num2 ;
        System.out.println(example.sum(10,15));
    }
}
@FunctionalInterface
interface exampleFun {
    public abstract int sum(int num1, int num2);
}

