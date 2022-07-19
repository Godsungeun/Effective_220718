import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamLambdaExample {
    public static void main(String[] args) {
        // List 인터페이스에 Student 타입의 객체를 생성하여 작성한 배열을 List로 변환하여 저장
        List <Student> list = Arrays.asList(
                //new 클래스명(인자)
                new Student("김코딩", 95),
                new Student("이자바", 92)
        );

        //스트림 인터페이스에 스튜던트타입의 객체를 생성하여 list의 스트림을 쓸 수 있게...?!
        Stream<Student> stream = list.stream();
        stream.forEach( s -> {
            String name = s.getName();
            int score = s.getScore();
            System.out.println(name + " - " + score);
        });
    }
}
