public class RaceUtility {
    public static double milesToKm(double miles){
        return miles * 1.60934;
    }

    public static double kmToMiles(double km){
        return km / 1.60934;
    }

    public static String makeProper(String improper){
        String proper = "";
        
        int spaceIndex = improper.indexOf(" ");
        while (proper.length() != improper.length()){
            String currentWord = improper.substring(0, spaceIndex);

        }
    }


}
