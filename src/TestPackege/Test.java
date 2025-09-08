package TestPackege;

abstract class Test {
    protected static double doubleNumber1;
    protected static double doubleNumber2;

    protected static  int degree;

    protected static double intNumber1;
    protected static double intNumber2;

    @org.junit.jupiter.api.BeforeAll
    public static void setUp(){
        doubleNumber1 = 4.2;
        doubleNumber2 = 7.9;

        intNumber1 = 5;
        intNumber2 = 4;

        degree = 4;
    }
}
