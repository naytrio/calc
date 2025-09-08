package ValidPackage;

import java.util.Arrays;

public class Valid {
    public static boolean factorialValid(double num) {
        if (num <= 0) {
            return false;
        }
        if (num != Math.round(num)) {
            return false;
        }
        return true;
    }

    public static boolean degreeValid(double number) {
        if (number == Math.round(number)) {
            return true;
        }
        return false;
    }

    public static boolean operationValid(String operation) {
        String[] operations = {"+", "-", "*", "/", "^", "!"};
        if (Arrays.asList(operations).contains(operation)) {
            return true;
        }
        return false;
    }
}
