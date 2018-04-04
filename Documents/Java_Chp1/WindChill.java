public class WindChill{
    public static void main(String[] args){
        double temp = Double.parseDouble(args[0]);
        double wind_spd = Double.parseDouble(args[1]);
        double wind_chill = 35.74 + 0.6215*temp + (0.4275*temp - 35.75) * Math.pow(wind_spd, 0.16);
        System.out.println("Temperature = " + temp);
        System.out.println("Wind speed  = " + wind_spd);
        System.out.println("Wind chill  = " + wind_chill);
    }
}