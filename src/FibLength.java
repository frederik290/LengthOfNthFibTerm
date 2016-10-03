import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Calculating the number of digits in the n'th Fibonacci Number
 * Formula found at: http://www.had2know.com/academics/number-digits-length-fibonacci-number.html
 * The explicit formula for fib is:  F(n) = [ φ^n - (-1/φ)^n ]/sqrt(5)
 */

public class FibLength {
    private static final double THE_GOLDEN_RATIO = (1 + Math.sqrt(5))/2;

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        double phiToNthPower = Math.pow(THE_GOLDEN_RATIO, n);
        double fibApprox = (phiToNthPower - Math.pow((-1/THE_GOLDEN_RATIO),n))/Math.sqrt(5);
        BigInteger fibIntegerPart = new BigDecimal(fibApprox).toBigInteger();
        String fibString = "" + fibIntegerPart;

        System.out.println("There is " + fibString.length() + " digits, in the " + n +
                "'th term of the fib sequence!");

    }
}
