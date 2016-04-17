import java.util.Scanner;

/**
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10
 * without any remainder.
 * What is the smallest positive number that is evenly divisible(divisible with no remainder) by
 * all
 * of the numbers from 1 to N?
 *
 * Input Format
 * First line contains T that denotes the number of test cases. This is followed by T lines, each
 * containing an integer, N.
 *
 * Output Format
 * Print the required answer for each test case.
 *
 * Constraints
 * 1≤T≤10
 * 1≤N≤40
 */
public class Problem5 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    for (int i = 0; i < n; i++) {
      long sum = smallNumDivideEvenly(in.nextInt());
      System.out.println(sum);
    }
    //System.out.println(smallNumDivideEvenly(10));
  }

  private static long smallNumDivideEvenly(int n) {
    for (int i = n; i < Integer.MAX_VALUE; i++) {
      if (divideEvenly(i, n)) return i;
    }
    return 0;
  }

  private static boolean divideEvenly(int i, int n) {
    for (int j = 2; j <= n; j++) {
      if (i % j != 0) return false;
    }
    return true;
  }
}
