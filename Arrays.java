public class Arrays {
    public static void main(String[] args) {
       // firstLast6();
        commonEnd();
    }

    public static void firstLast6() {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int target = 6;

        if (numbers[0] == target || numbers[numbers.length - 1] == target) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }

    }

    public static void commonEnd() {
        int[] firstNumbers = {1, 2, 3, 4, 5, 6};
        int[] secondNumbers = {1, 2, 3, 4, 5, 6};

        if (firstNumbers[0] == secondNumbers[0] || firstNumbers[firstNumbers.length - 1] == secondNumbers[secondNumbers.length - 1]) {
            System.out.println("TRUE");
        }
        else {
            System.out.println("FALSE");
        }
    }

}
