/**
 * Created by vardan sharma on 15/4/16.
 */
public class Utils {

  public static boolean isPrime(long n) {
    if (n < 2) return false;
    for (long i = 2, p = (int) Math.sqrt(n) + 1; i < p; i++) {
      if (n % i == 0) return false;
    }
    return true;
  }
}
