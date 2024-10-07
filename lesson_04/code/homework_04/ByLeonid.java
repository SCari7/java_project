package homework_04;

public class ByLeonid {
    // code by Ivan Alekseenko



        private static final double NAUTICAL_MILE_TO_METERS = 1852;
        private static final double METERS_TO_KILOMETERS = 0.001;

        public static void main(String[] args) {
            double nauticalMiles = 1;

            double kilometers = convertNauticalMilesToKm(nauticalMiles);
            System.out.println(nauticalMiles + " морская миля в километрах = " + kilometers);
            System.out.printf("Километры %.2f", kilometers);
            System.out.println(" километров");
            System.out.println();
        }//end of main

        public static double convertNauticalMilesToKm(double nauticalMiles) {
            return nauticalMiles * NAUTICAL_MILE_TO_METERS * METERS_TO_KILOMETERS;
        }

}
