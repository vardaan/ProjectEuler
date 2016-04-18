import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by vardan sharma on 15/4/16.
 * The sum of the primes below 1010 is 2+3+5+7=172+3+5+7=17.
 *
 * Find the sum of all the primes not greater than given NN.
 *
 * Input Format
 * The first line contains an integer TT i.e. number of the test cases.
 * The next TT lines will contains an integer NN.
 *
 * Output Format
 * Print the value corresponding to each test case in seperate line.
 *
 * Constraints
 * 1 ≤ T ≤ 10^4
 * 1 ≤ N ≤ 10^6
 */

//TODO solve timeout issue
public class Problem10 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int t = scanner.nextInt();
    for (int i = 0; i < t; i++) {
      System.out.println(calculate(scanner.nextInt()));
    }
  }

  private static long calculate(int i) {
    long sum = 2;

    HashMap<Integer, Boolean> primeMap = new HashMap<Integer, Boolean>(i);
    for (int j = 1; j < i; j++) {
      primeMap.put(j, false);
    }

    for (int j = 2; j < i / 2; j++) {

    }
    return sum;
  }

  public static boolean isPrime(long n) {
    if (n < 2) return false;
    for (long i = 2, p = (int) Math.sqrt(n) + 1; i < p; i++) {
      if (n % i == 0) return false;
    }
    return true;
  }
}
