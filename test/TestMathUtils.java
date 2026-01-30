package test;

import java.util.stream.Stream;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import src.MathUtils;



public class TestMathUtils {

    private static Stream<Arguments> additionTests() {
        return Stream.of(
                Arguments.of(1, 2, 3),
                Arguments.of(2, 3, 5),
                Arguments.of(10, 3, 13),
                Arguments.of(5, -2, 3),
                Arguments.of(-10, -5, -15),
                Arguments.of(2, -10, -8),
                Arguments.of(Integer.MAX_VALUE, 10, Integer.MAX_VALUE),
                Arguments.of(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE),
                Arguments.of(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE)
        );
    }
    
    @ParameterizedTest
    @MethodSource("additionTests")
    public void testAddition(int input1, int input2, int expectedOutput) {
        int result = MathUtils.add(input1, input2);
        Assert.assertEquals(expectedOutput, result);
    }



    private static Stream<Arguments> subtractionTests() {
        return Stream.of(
                Arguments.of(3, 2, 1),
                Arguments.of(2, 3, -1),
                Arguments.of(10, 3, 7),
                Arguments.of(5, -2, 7),
                Arguments.of(-10, -5, -5),
                Arguments.of(-2, -10, 8),
                Arguments.of(Integer.MAX_VALUE, -10, Integer.MAX_VALUE),
                Arguments.of(Integer.MIN_VALUE, 10, Integer.MIN_VALUE),
                Arguments.of(Integer.MAX_VALUE, Integer.MAX_VALUE, 0),
                Arguments.of(Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE),
                Arguments.of(Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE)
        );
    }
    
    @ParameterizedTest
    @MethodSource("subtractionTests")
    public void testSubtraction(int input1, int input2, int expectedOutput) {
        int result = MathUtils.subtract(input1, input2);
        Assert.assertEquals(expectedOutput, result);
    }



    private static Stream<Arguments> multiplicationTests() {
        return Stream.of(
                Arguments.of(3, 2, 6),
                Arguments.of(2, 3, 6),
                Arguments.of(10, 3, 30),
                Arguments.of(5, -2, -10),
                Arguments.of(-10, -5, 50),
                Arguments.of(-2, -10, 20),
                Arguments.of(10, 0, 0),
                Arguments.of(Integer.MAX_VALUE, 0, 0),
                Arguments.of(Integer.MAX_VALUE, -1, -Integer.MAX_VALUE),
                Arguments.of(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE),
                Arguments.of(Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE)
        );
    }
    
    @ParameterizedTest
    @MethodSource("multiplicationTests")
    public void testMultiplication(int input1, int input2, int expectedOutput) {
        int result = MathUtils.multiply(input1, input2);
        Assert.assertEquals(expectedOutput, result);
    }


    private static Stream<Arguments> divisionTests() {
        return Stream.of(
                Arguments.of(3, 2, 1.5),
                Arguments.of(2, 3, 0.6666666666),
                Arguments.of(10, 3, 3.33333333333),
                Arguments.of(5, -2, -2.5),
                Arguments.of(-10, -5, 2.0),
                Arguments.of(-2, -10, 0.2),
                Arguments.of(10, 0, Double.NaN),
                Arguments.of(Integer.MAX_VALUE, 2, (double)Integer.MAX_VALUE / 2.0),
                Arguments.of(1, Integer.MAX_VALUE, 1.0 / Integer.MAX_VALUE),
                Arguments.of(Integer.MAX_VALUE, -Integer.MAX_VALUE, -1.0),
                Arguments.of(0, Integer.MAX_VALUE, 0.0)
        );
    }
    
    @ParameterizedTest
    @MethodSource("divisionTests")
    public void testDivision(int input1, int input2, double expectedOutput) {
        double result = MathUtils.divide(input1, input2);
        Assert.assertEquals(expectedOutput, result, 0.00001);
    }
}
