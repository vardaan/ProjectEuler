import java.util.Scanner;

/**
 * The prime factors of 13195 are 5, 7, 13 and 29.
 *
 * What is the largest prime factor of a given number N?
 *
 * Input Format
 * First line contains TT, the number of test cases. This is followed by TT lines each containing
 * an
 * integer NN.
 *
 * Output Format
 * For each test case, display the largest prime factor of NN.
 *
 * Constraints
 * 1≤T≤101≤T≤10
 * 10≤N≤101210≤N≤1012
 */

//todo 2 test cases failed
public class Problem3 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    for (int i = 0; i < n; i++) {
      long sum = largestPrimeFactor(10);
      System.out.println(sum);
    }
    //long sum = largestPrimeFactor(10);
    //System.out.println(sum);
  }

  private static long largestPrimeFactor(int n) {
    //find whether i its factor of n
    for (int i = n; i > 0; i--) {
      if (n % i == 0) {
        //System.out.println(i);
        if (isPrime(i)) {
          return i;
        }
      }
    }

    // whether i is prime or not
    return -1;
  }

  private static boolean isPrime(int n) {
    if (n < 2) return false;

    for (int i = 2, size = (int) Math.sqrt(n); i < size; i++) {
      if (n % i == 0) return false;
    }
    return true;
  }
}