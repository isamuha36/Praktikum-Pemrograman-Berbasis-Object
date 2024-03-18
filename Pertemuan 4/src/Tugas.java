public class Tugas {
    public static void main(String[] args) {
        enum Level{
            LOW, MEDIUM, HIGH;
        }

        Level myLevel = Level.HIGH;
        System.out.println(myLevel);
        System.out.println(myLevel.ordinal());

        switch (myLevel){
            case LOW -> System.out.println("1");
            case MEDIUM -> System.out.println("2");
            case HIGH -> System.out.println("3");
        }
    }
}
