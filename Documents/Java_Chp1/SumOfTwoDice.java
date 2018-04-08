public class SumOfTwoDice {
  static final int SIDES = 6;

  /**
   * Prints the sum of two random integers between 1 and 6
   * (such as you might get when rolling dice).
   */
  public static void main(String[] args) {
    int a = 1 + (int) (Math.random() * SIDES);
    int b = 1 + (int) (Math.random() * SIDES);
    int sum = a + b;
    System.out.println(sum);
  }
}
