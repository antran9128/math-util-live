package com.fu.mathutil;

public class MathUtil {

    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid argument. N must be between 0..20");
        }

        if (n == 0) {
            return 1;
        }

        return n * getFactorial(n - 1);
    }

}
