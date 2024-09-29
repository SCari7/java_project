package übungen;

public class booleanÜb {
    public static void main(String[] args) {
        boolean isGoodWeather = false;
        boolean isNight = false;
        if (isNight) {
            System.out.println("spat´");
        }
        if (!isNight && isGoodWeather) {
            System.out.println("gulat´");
        }
        if (!isNight && !isGoodWeather) {
            System.out.println("chitat´ knigy");
        }


        boolean isGoodWeather1 = true;
        boolean isNight1 = false;
        if (isNight1) {
            System.out.println("spat´");
        }
        if (!isNight1 && isGoodWeather1) {
            System.out.println("gulat´");
        }
        if (!isNight1 && !isGoodWeather1) {
            System.out.println("chitat´ knigy");
        }

        boolean isGoodWeather2 = true;
        boolean isNight2 = true;
        if (isNight2) {
            System.out.println("spat´");
        }
        if (!isNight2 && isGoodWeather2) {
            System.out.println("gulat´");
        }
        if (!isNight2 && !isGoodWeather2) {
            System.out.println("chitat´ knigy");
        }
    }

}
