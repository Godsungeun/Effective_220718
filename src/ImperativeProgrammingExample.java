import java.util.List;

public class ImperativeProgrammingExample {
    public static void main(String[] args) {
        //List 에 있는 숫자들 중에서 4보다 큰 짝수의 합계 구하기
        List<Integer> numbers = List.of(1,3,6,7,8,11);
        // 일반적 코드
//        int sum = 0;
//
//        for(int number : numbers){
//            if(number>4 && number%2==0) {
//                sum += number;
//            }
//        }
//        System.out.println("# 명령형 프로그래밍 : " + sum);
        int sum =
                numbers.stream()
                        .filter(number -> number > 4 && (number % 2 ==0))
                        .mapToInt(number -> number)
                        .sum();
        System.out.println("# 선언형 프로그래밍: " + sum);
    }
}
// 출력값
// # 명령형 프로그래밍 : 14