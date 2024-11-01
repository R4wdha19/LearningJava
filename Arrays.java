public class Arrays {
    public static void main(String[] args) {
        // firstLast6();
/*
        commonEnd();
*/
        swapEnds();
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
        } else {
            System.out.println("FALSE");
        }
    }

    public static void swapEnds() {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int firstNumber = numbers[0];
        int secondNumber = numbers[numbers.length - 1];
        numbers[numbers.length - 1] = firstNumber;
        numbers[0] = secondNumber;
        for(int x: numbers){
            System.out.println(x);
        }


    }

}
