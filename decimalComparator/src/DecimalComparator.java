public class DecimalComparator {
    public static void main(String[] args) {
        areEqualByThreeDecimalPlaces(789.897, 789.890);
    }

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {

        int total1 = (int) (num1 * 1000);
        int total2 = (int) (num2 * 1000);
        if (total1 == total2) {
            return true;


        }

        return false;
    }
}