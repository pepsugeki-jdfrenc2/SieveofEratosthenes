/**
 * A prime number finder class that finds the prime numbers up to n.
 * Author: John French
 * Version: 1-13-23
 */

import java.util.Arrays;
import java.util.InputMismatchException;

public class PrimeNumberFinder {
    /**
     * A mehthod that finds all prime numbers up to the argument aLimit.
     * @param aLimit the upper limit of prime numbers to search for
     * @param aVerbose Whether the code prints the prime numbers found
     */
    public void finder(int aLimit, boolean aVerbose) {
        boolean verbose = aVerbose;
        int limit = aLimit;
        //Start time begins after user input
        long startTime = System.nanoTime();
        boolean[] primes = new boolean[limit + 1]; //An array of booleans that correlate to that position
        Arrays.fill(primes, true); //All indexes start at true except 0 and 1
        primes[0] = primes[1] = false;
        int sqrt = (int) Math.sqrt(limit);
        //We check for primes up to the square root of the limit
        for (int i = 2; i <= sqrt; i++) {
            if (primes[i]) {
                for (int j = i * i; j <= limit; j += i) {
                    primes[j] = false;
                }
            }
        }
        //Loop to print the prime numbers
        if(verbose){
            for (int i = 0; i <= limit; i++) {
                if (primes[i]) {
                    System.out.print(i + " ");
                }
            }
        }

        //Print the final runtime.
        long endTime = System.nanoTime();
        System.out.println("Total runtime: " + (endTime - startTime) + " ns\n");
    }
}
