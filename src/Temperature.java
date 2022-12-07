public class Temperature
{
    private double highTemp;
    private double lowTemp;
    private String tempScale;

    // Precondition: scale must be: "F" or "C"; anything else will default to "F"
    public Temperature(double high, double low, String scale)
    {
        highTemp = high;
        lowTemp = low;

        if (scale.equals("F") || scale.equals("C"))
        {
            tempScale = scale;
        }
        else
        {
            tempScale = "F";
        }
    }

    // 1. Add your two static methods here:

    public static double convertCtoF(double temp){
        return (temp * ((double)9/5)) + 32;
    }

    public static double convertFtoC(double temp){
        return (temp - 32) * ((double)5/9);
    }

    // 2. Add your two instance methods here:

    public void changeToC(){
        highTemp = convertFtoC(highTemp);
        lowTemp = convertFtoC(lowTemp);
        tempScale = "C";
    }

    public void changeToF(){
        highTemp = convertCtoF(highTemp);
        lowTemp = convertCtoF(lowTemp);
        tempScale = "F";
    }

    // 3. Add your private static helper rounding "utility" method here:

    public static double roundToNearestTenth(double num){
        double rounded = (Math.round(num * 10)) / 10;
        return rounded;
    }

    // 4. Complete the toString method below (using your static helper method)
    //    so it returns a String that prints like:

    //    High Temperature: 67.4 F (or C)
    //    Low Temperature: 58.3 F (or C)

    public String toString()
    {
        return "High Temperature: " + roundToNearestTenth(highTemp) + " " + tempScale + "\nLow Temperature: " + roundToNearestTenth(lowTemp) + " " + tempScale;
    }
}
