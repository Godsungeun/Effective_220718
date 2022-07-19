import java.util.function.IntBinaryOperator;

public class ramda_method {
    public static void main(String[] args) {
        IntBinaryOperator operator;
        //IntBinaryOperator :

        //정적 메서드
        //클래스이름::메서드이름
        operator = Calculator::staticMethod;
        System.out.println("정적메서드 결과 : " + operator.applyAsInt(3,5));

        //인스턴스 메서드
        //인스턴스명::메서드이름
        Calculator calculator = new Calculator();
        operator = calculator::instanceMethod;
        System.out.println("인스턴스 메서드 결과 : " + operator.applyAsInt(3,5));
        //  IntBinaryOperator - .applyAsInt : 두 int형 연산과 int형 결과값 반환
    }
}
//출력값
//정적메서드 결과 : 8
//인스턴스 메서드 결과 : 15
