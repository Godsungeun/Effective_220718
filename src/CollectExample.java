import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectExample {
    public static void main(String[] args) {
        List<Student2> totalList = Arrays.asList( // 리스트로 만들고
                new Student2("김코딩", 10, Student2.Gender.Male),
                new Student2("김인기", 8, Student2.Gender.Female),
                new Student2("이자바", 9, Student2.Gender.Male),
                new Student2("최민선", 10, Student2.Gender.Female)
        );

        List<Student2> maleList = totalList.stream() //리스트 스트림으로 만들고
                .filter(s -> s.getGender() == Student2.Gender.Male) //Male인지 필터링
                .collect(Collectors.toList()); //필터링한 요소들을 다시 List로 수집

        maleList.stream().forEach(n->System.out.println(n.getName())); // 스트림 최종연산 출력

        Set<Student2> femaleSet = totalList.stream() //Set 스트림 만들고
                .filter(s -> s.getGender() == Student2.Gender.Female) //Female인지 필터링
                .collect(Collectors.toCollection(HashSet::new)); // HashSet으로 수집

        femaleSet.stream().forEach(n->System.out.println(n.getName())); //스트림 최종연산 출력
    }
}
