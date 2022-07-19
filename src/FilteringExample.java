import java.util.Arrays;
import java.util.List;

public class FilteringExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("김코딩", "이자바", "김인기", "김코딩", "kimcoding", "javalee");

        names.stream()
                .distinct()
                .forEach(n -> System.out.println(n));
        System.out.println();

        names.stream()
                .filter(n -> n.startsWith("김")) // 김으로 시작하는 요소들 필터링
                .forEach(n -> System.out.println(n));
        System.out.println();

        names.stream()
                .distinct()
                .filter(n -> n.startsWith("김"))
                .forEach(n -> System.out.println(n));
        System.out.println();

        names.stream()
                .map(s -> s.toUpperCase())  // map으로 모든 요소를! toUpperCase로 대문자로 변환환
               .forEach(n -> System.out.println(n));
    }
}
