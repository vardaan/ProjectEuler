import java.math.BigInteger;
import java.util.Scanner;

/**
 * The numbers 1 to 5 written out in words are One, Two, Three, Four, Five
 *
 * First character of each word will be capital letter for example:
 * 104382426112 is One Hundred Four Billion Three Hundred Eighty Two Million Four Hundred Twenty
 * Six
 * Thousand One Hundred Twelve
 *
 * Given a number, you have to write it in words.
 *
 * Input Format
 * The first line contains an integer T, i.e., number of test cases.
 * Next T lines will contain an integer N.
 *
 * Output Format
 * Print the values corresponding to each test case.
 * TODO 4 test cases are failing :(
 * Constraints
 * 1≤T≤101
 * 0≤N≤10^12
 */
public class Problem17 {
  private static final String[] specialNames = {
      "Hundred", " Thousand", " Million", " Billion", " Trillion", " Quadrillion", " Quintillion"
  };

  private static final String[] tensNames = {
      "", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
  };

  private static final String[] numNames = {
      "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven",
      "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
  };
  private static final long BILLION = 1000000000;
  private static final long MILLION = 1000000;
  private static final long THOUSAND = 1000;
  private static final long HUNDRED = 100;

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    for (int i = 0; i < n; i++) {
      System.out.println(convertToWords(in.nextLong()));
    }
    //for (int i = 0; i < 100000000; i += 100) {
    //  System.out.println(convertToWords(i));
    //}
  }

  private static String convertToWords(long i) {
    if (i < 20) {
      return numNames[((int) i)];
    } else if (i < 100) {
      return tensNames[((int) (i / 10))] + " " + numNames[((int) (i % 10))];
    } else {
      return checkForSpecialCases(i);
    }
  }

  private static String checkForSpecialCases(long i) {
    String s = "";
    boolean spaceAdded = false;
    if (i / BILLION > 1) {
      s += tensNames[((int) (i / BILLION))] + " " + specialNames[3];
      if (i % BILLION > 1) {
        s += " ";
        spaceAdded = true;
      }
    }
    if (i / MILLION > 1) {
      int j = (int) (i % (MILLION * 10));
      s += tensNames[((int) (j / MILLION))] + " " + specialNames[2];
      if (i % MILLION > 1 && !spaceAdded) {
        s += " ";
        spaceAdded = true;
      }
    }
    if (i / THOUSAND > 1) {
      int j = (int) (i % 10000);
      s += tensNames[((int) (j / THOUSAND))] + " " + specialNames[1];
      if (i % THOUSAND > 1 && !spaceAdded) {
        s += " ";
        spaceAdded = true;
      }
    }
    if (i / HUNDRED > 1) {
      int j = (int) (i % 1000);
      s += numNames[((int) (j / HUNDRED))]
          + " "
          + specialNames[0]
          + " "
          + tensNames[(j % 100) / 10]
          + " "
          + numNames[(j % 10)];
    }
    return s;
  }
}
