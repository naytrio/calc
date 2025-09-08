package TestPackege;

import ValidPackage.Valid;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class ValidTest extends Test{
    @org.junit.jupiter.api.Test
    void factorialValid(){
        List<Boolean> testResult = new ArrayList<>();
        List<Boolean> correctResult = new ArrayList<>();

        testResult.add(Valid.factorialValid(doubleNumber1));
        testResult.add(Valid.factorialValid(intNumber1));

        correctResult.add(false);
        correctResult.add(true);

        Assert.assertEquals(testResult, correctResult);
    }
    @org.junit.jupiter.api.Test
    void degreeValid(){
        List<Boolean> testResult = new ArrayList<>();
        List<Boolean> correctResult = new ArrayList<>();

        testResult.add(Valid.degreeValid(doubleNumber1));
        testResult.add(Valid.degreeValid(intNumber1));

        correctResult.add(false);
        correctResult.add(true);

        Assert.assertEquals(testResult, correctResult);
    }
    @org.junit.jupiter.api.Test
    void operationValid(){
        List<Boolean> testResult = new ArrayList<>();
        List<Boolean> correctResult = new ArrayList<>();

        testResult.add(Valid.operationValid("+"));
        testResult.add(Valid.operationValid("asdawd"));

        correctResult.add(true);
        correctResult.add(false);

        Assert.assertEquals(testResult, correctResult);
    }
}
