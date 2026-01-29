package src;

import java.math.BigInteger;

public class MathUtils {
    
    public static int add(int a, int b) {
        int result;
        try {
            result = Math.addExact(a, b);
        } catch (ArithmeticException ex) {
            BigInteger bigInt = new BigInteger(a + "");
            bigInt.add(new BigInteger(b + ""));

            if (bigInt.signum() == 1) {
                return Integer.MAX_VALUE;
            } else if (bigInt.signum() == 0) {
                return 0;
            } else {
                return Integer.MIN_VALUE;
            }
        }
        
        return result;
    }

    public static int subtract(int a, int b) {
        int result;
        try {
            result = Math.subtractExact(a, b);
        } catch (ArithmeticException ex) {
            BigInteger bigInt = new BigInteger(a + "");
            bigInt.subtract(new BigInteger(b + ""));

            if (bigInt.signum() == 1) {
                return Integer.MAX_VALUE;
            } else if (bigInt.signum() == 0) {
                return 0;
            } else {
                return Integer.MIN_VALUE;
            }
        }
        
        return result;
    }

    public static int multiply(int a, int b) {
        int result;
        try {
            result = Math.multiplyExact(a, b);
        } catch (ArithmeticException ex) {
            BigInteger bigInt = new BigInteger(a + "");
            bigInt.multiply(new BigInteger(b + ""));

            if (bigInt.signum() == 1) {
                return Integer.MAX_VALUE;
            } else if (bigInt.signum() == 0) {
                return 0;
            } else {
                return Integer.MIN_VALUE;
            }
        }
        
        return result;
    }

    public static double divide(int a, int b) {
        if (b == 0) {
            return Double.NaN;
        }

        return (double) a / b;
    }
}
