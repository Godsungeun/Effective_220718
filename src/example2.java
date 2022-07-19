public class example2 {
    public static void main(String[] args) {
        Myfff example;
        example = (x,y) -> {
            int result = x + y;
            return result;
        };
        int result1 = example.accept(2,5);
        System.out.println(result1);

        example = (x,y) -> {return x+y;};
        int result2=example.accept(2,5);
        System.out.println(result2);
    }
}

@FunctionalInterface
interface Myfff {
    public int accept(int x, int y);
}
