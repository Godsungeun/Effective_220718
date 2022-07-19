class Super {
    void run(){}
}
class sub extends Super {
    @Override // 상위클래스의 메서드를 오버라이딩 할 때 오타등의 오륙가 생기지 않게 방지
    void run(){}
}

class OldClass {
    @Deprecated
    int oldField;
    @Deprecated
    int getOldField() {return oldField;} ;
}

//@Depreacated가 붙은 대상을 사용하는 코드를 작성하면, 컴파일할 때
//        Note: 파일명.java uses or overrides a deprecated API.
//        Note: Recomplie with -Xlint:deprecation for details.
public class ana {
}
