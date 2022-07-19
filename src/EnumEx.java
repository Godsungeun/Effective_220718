//class Seasons {
//    public static final Seasons SPRING = new Seasons();
//    public static final Seasons SUMMER = new Seasons();
//    public static final Seasons FALL = new Seasons();
//    public static final Seasons WINTER = new Seasons();
//}
//class Frameworks {
//    public static final Seasons DJANGO = new Seasons();
//    public static final Seasons SPRING = new Seasons();
//    public static final Seasons NEST = new Seasons();
//    public static final Seasons EXPRESS = new Seasons();
//}

enum Level{
    LOW,
    MEDIUM,
    HIGH
}

public class EnumEx {
    public static void main(String[] args) {
        Level level = Level.MEDIUM;

        Level[] allLevels = Level.values();
        for(Level x : allLevels){
            System.out.printf("%s=%d%n", x.name(), x.ordinal());
        }
        Level findLevel= Level.valueOf("LOW");
        System.out.println(findLevel);
        System.out.println(Level.LOW == Level.valueOf("LOW"));

        switch(level){
            case LOW:
                System.out.println("낮은 레벨");
                break;
            case MEDIUM:
                System.out.println("중간 레벨");
                break;
            case HIGH:
                System.out.println("높은 레벨");
                break;

        }
    }
}
