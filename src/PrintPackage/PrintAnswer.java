package PrintPackage;

public class PrintAnswer {
    public static void answerPrint(long number){
        System.out.println("ответ: " + number);
    }
    public static void answerPrint(double number){
        System.out.printf("ответ: %.2f%n", number);
    }
}
