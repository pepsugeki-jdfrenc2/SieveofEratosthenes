/**
 * A prime number finder class that finds the prime numbers up to n bsed on a user input.
 * Author: John French
 * Version: 1-13-23
 */

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PrimeNumberFinder {
    public static void main(String[] args) {
        int limit = 0;
        Scanner scanner = new Scanner(System.in);
        //While loop for user input and input validation
        while(true){
            System.out.print("Enter the limit: ");
            try {
                limit = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input, please enter a number");
                scanner.nextLine();
                continue;
            }
        }
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
        for (int i = 0; i <= limit; i++) {
            if (primes[i]) {
                System.out.print(i + " ");
            }
        }
        //Print the final runtime.
        long endTime = System.nanoTime();
        System.out.println("\nTotal runtime: " + (endTime - startTime) + " ns");
    }
}
