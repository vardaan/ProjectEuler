import java.util.Scanner;

import static java.lang.System.out;

/**
 * This problem is a programming version of Problem 1 from projecteuler.net
 *
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
 * The sum of these multiples is 23.
 *
 * Find the sum of all the multiples of 3 or 5 below N.
 *
 * Input Format
 * First line contains TT that denotes the number of test cases. This is followed by TT lines, each
 * containing an integer, NN.
 *
 * Output Format
 * For each test case, print an integer that denotes the sum of all the multiples of 3 or 5 below
 * NN.
 *
 * Constraints
 * 1≤T≤1051≤T≤105
 * 1≤N≤1091≤N≤109
 *
 * Sample Input
 *
 * 2
 * 10
 * 100
 * Sample Output
 *
 * 23
 * 2318
 */
public class Problem1 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    for (int i = 0; i < n; i++) {
      int input = in.nextInt();
      out.println(
          sumOfMultipleOfN(input - 1, 3) + sumOfMultipleOfN(input - 1, 5) - sumOfMultipleOfN(
              input - 1, 15));
    }
  }

  public static long sumOfMultipleOfN(int input, int n) {
    long lastNum = input - (input % n);
    return ((lastNum / n) * (n + lastNum)) / 2;
  }
}
