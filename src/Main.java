public class Main {
    public static void main(String[] args) {
        System.out.println(division(null, 10.0));
    }

    public static Double division(Double numeratore, Double denominatore) {
        double result = 0.0;
        try {
            result = numeratore / denominatore;

        } catch (NullPointerException e) {
            System.out.println("Manca il valore: " + e);
        }
        return result;
    }
}
