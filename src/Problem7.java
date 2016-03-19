import java.util.Scanner;

/**
 * By listing the first six prime numbers: 2,3,5,7,112,3,5,7,11 and 1313, we can see that the
 * 6th6th
 * prime is 1313.
 * What is the NN'th prime number?
 *
 * Input Format
 * First line contains T that denotes the number of test cases. This is followed by TT lines, each
 * containing an integer, NN.
 *
 * Output Format
 * Print the required answer for each test case.
 *
 * Constraints
 * 1≤T≤1031≤T≤103
 * 1≤N≤10^4
 */
public class Problem7 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    for (int i = 0; i < n; i++) {
      System.out.println(findNthPrime(in));
    }
  }

  private static long findNthPrime(Scanner in) {
    int primesReqd = in.nextInt();
    int numPrimes = 0;
    long sol = 0;
    for (long j = 0; j < Long.MAX_VALUE; j++) {
      if (numPrimes == primesReqd) {
        break;
      }
      if (isPrime(j)) {
        //System.out.println(j);
        numPrimes++;
        sol = j;
      }
    }
    return sol;
  }

  public static boolean isPrime(long n) {
    if (n < 2) return false;
    for (long i = 2, p = (int) Math.sqrt(n) + 1; i < p; i++) {
      if (n % i == 0) return false;
    }
    return true;
  }
}
