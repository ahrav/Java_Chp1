public class PowersOfTwo {
  /**
   * Takes an integer command-line argument n and prints all of the powers of 2 less than or equal
   * to n.
   */
  public static void main(String[] args) {
    int n = Integer.parseInt((args[0]));
    int i = 0;
    int powerOfTwo = 1;

    while (i <= n) {
      System.out.println(i + " " + powerOfTwo);
      powerOfTwo = 2 * powerOfTwo;
      i++;
    }
  }
}
