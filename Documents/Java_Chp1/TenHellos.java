public class TenHellos {
  /**
   * Takes the number of lines to print as a command-line argument.
   * You may assume that the argument is less than 1000.
   * Hint: consider using i % 10 and i % 100 to determine whether to use
   * "st", "nd", "rd", or "th" for printing the ith Hello.
   */
  public static void main(String[] args) {
    int i = 1;
    while (i <= 10) {
      System.out.println(i + "th Hello!");
      i += 1;
    }
  }
}
