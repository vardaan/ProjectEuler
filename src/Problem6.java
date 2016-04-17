/**
 * The sum of the squares of the first ten natural numbers is, 1^2+2^2+...+10^2=38512+22+...+102=385.
 * The square of the sum of the first ten natural numbers is, (1+2+⋯+10)2=552=3025(1+2+⋯+10)2=552=3025.
 * Hence the difference between the sum of the squares of the first ten natural numbers and the
 * square of the sum is 3025−385=26403025−385=2640.
 *
 * Find the difference between the sum of the squares of the first NN natural numbers and the
 * square
 * of the sum.
 *
 * Input Format
 * First line contains TT that denotes the number of test cases. This is followed by TT lines, each
 * containing an integer, NN.
 *
 * Output Format
 * Print the required answer for each test case.
 *
 * Constraints
 * 1≤T≤1041≤T≤104
 * 1≤N≤1041≤N≤104
 */
public class Problem6 {
  public static void main(String[] args) {
    //Scanner in = new Scanner(System.in);
    //int n = in.nextInt();
    //for (int i = 0; i < n; i++) {
    //  System.out.println(diffSumOfSqAndSqOfSum(in.nextInt()));
    //}
    System.out.println(diffSumOfSqAndSqOfSum(10000));
    //System.out.println(sumofSq(10));
  }

  private static long diffSumOfSqAndSqOfSum(int n) {
    long sumOfSq = sumofSq(n);
    long sqOfSum = sqOfSum(n);
    return sumOfSq - sqOfSum;
  }

  private static long sqOfSum(int n) {
    long sumOfNumUptoN = ((n) * (n + 1)) / 2;
    return sumOfNumUptoN * sumOfNumUptoN;
  }

  private static long sumofSq(int n) {
    return (n * (n + 1) * (2 * n + 1)) / 6;
  }
}
