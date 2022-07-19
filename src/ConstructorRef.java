import java.util.function.BiFunction;
import java.util.function.Function;

public class ConstructorRef {
    public static void main(String[] args) throws Exception {
        //throws 예외클래스1, 예외클래스2 ... : 메소드 선언부 끝에 작성,
        //메소드에서 처리하지 않은 예외를 호출한 곳으로 떠넘기는 역할
        //위처럼 예외부분을 Exception(상위 예외 클래스)만으로 모든 예외를 간단히 떠넘길 수도도있다.
        //throws 키워드가 붙은 메소드는 반드시 try 블록 내에서 호출되어야함.

        Function<String, Member> function1 = Member::new;
        Member member1 = function1.apply("kimcoding");

        BiFunction<String, String, Member> function2 = Member::new;
        Member member2 = function2.apply("kimcoding", "김코딩");
    }
}

