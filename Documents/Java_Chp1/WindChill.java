public class WindChill {
  /**
   * Takes two double command-line arguments t and v and prints the wind chill.
   * Uses Math.pow(a, b) to compute ab.
   * Note: the formula is not valid if t is larger than 50 in absolute value
   * or if v is larger than 120 or less than 3.
   */
  public static void main(String[] args) {
    double temp = Double.parseDouble(args[0]);
    double windSpeed = Double.parseDouble(args[1]);
    double windChill = 35.74 + 0.6215 * temp + (0.4275 * temp - 35.75) * Math.pow(windSpeed, 0.16);
    System.out.println("Temperature = " + temp);
    System.out.println("Wind speed  = " + windSpeed);
    System.out.println("Wind chill  = " + windChill);
  }
}
