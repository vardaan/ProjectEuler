import java.util.Scanner;

/**
 * A Pythagorean triplet is a set of three natural numbers, a<b<ca<b<c, for which,
 * a^2+b^2=c^2
 * For example, 3^2+4^2=9+16=25=5232+42=9+16=25=52
 * Given NN, Check if there exists any Pythagorean triplet for which a+b+c=Na+b+c=N
 * Find maximum possible value of abc among all such Pythagorean triplets, If there is no such
 * Pythagorean triplet print −1.
 *
 * Input Format
 * The first line contains an integer T i.e. number of test cases.
 * The next T lines will contain an integer N.
 *
 * Output Format
 * Print the value corresponding to each test case in separate lines.
 *
 * Constraints
 * 1≤T≤3000
 * 1≤N≤3000
 */

//TODO make it more fast 
public class Problem9 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int t = scanner.nextInt();
    for (int i = 0; i < t; i++) {
      System.out.println(calculate(scanner.nextInt()));
    }
  }

  private static int calculate(int n) {
    int max = -1;
    for (int c = n / 4; c <= n / 2; c++) {
      for (int a = 1; a <= n / 2 + 1; a++) {
        int b = n - a - c;
        if (b < 1) continue;
        System.out.println(String.format("a = %s and b = %s and c =%s", a, (b), c));
        if (c * c == (a * a) + b * b) {
          System.out.println(String.format("Triplet abc a = %s and b = %s and c =%s", a, (b), c));
          int triplet = c * a * b;
          if (max < triplet) max = triplet;
        }
      }
    }
    return max;
  }
}
