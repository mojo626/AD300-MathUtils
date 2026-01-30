package src;

import java.math.BigInteger;

public class MathUtils {
    
    public static int add(int a, int b) {

        BigInteger bigInt = new BigInteger(a + "");
        BigInteger bigResult = bigInt.add(new BigInteger(b + ""));

        if (bigResult.compareTo(new BigInteger(Integer.MIN_VALUE + "")) == 1 && bigResult.compareTo(new BigInteger(Integer.MAX_VALUE + "")) == -1) {
            return bigResult.intValue();
        }

        if (bigResult.signum() == 1) {
            return Integer.MAX_VALUE;
        } else if (bigResult.signum() == 0) {
            return 0;
        } else {
            return Integer.MIN_VALUE;
        }
    }

    public static int subtract(int a, int b) {

        BigInteger bigInt = new BigInteger(a + "");
        BigInteger bigResult = bigInt.subtract(new BigInteger(b + ""));

        if (bigResult.compareTo(new BigInteger(Integer.MIN_VALUE + "")) == 1 && bigResult.compareTo(new BigInteger(Integer.MAX_VALUE + "")) == -1) {
            return bigResult.intValue();
        }

        if (bigResult.signum() == 1) {
            return Integer.MAX_VALUE;
        } else if (bigResult.signum() == 0) {
            return 0;
        } else {
            return Integer.MIN_VALUE;
        }
    }

    public static int multiply(int a, int b) {

        BigInteger bigInt = new BigInteger(a + "");
        BigInteger bigResult = bigInt.multiply(new BigInteger(b + ""));

        if (bigResult.compareTo(new BigInteger(Integer.MIN_VALUE + "")) == 1 && bigResult.compareTo(new BigInteger(Integer.MAX_VALUE + "")) == -1) {
            return bigResult.intValue();
        }

        if (bigResult.signum() == 1) {
            return Integer.MAX_VALUE;
        } else if (bigResult.signum() == 0) {
            return 0;
        } else {
            return Integer.MIN_VALUE;
        }
    }

    //don't need to check for overflow since double limit is much higher than that of int
    public static double divide(int a, int b) {
        if (b == 0) {
            return Double.NaN;
        }

        double result = (double)a / b;

        return result;
    }
}
