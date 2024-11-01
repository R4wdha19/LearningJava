import java.util.ArrayList;
import java.util.List;

public class FirstLast6 {
    public static void main(String[] args) {
        firstLast6();
    }

    public static void firstLast6() {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int target = 6;

        if (numbers[0] == target || numbers[numbers.length - 1] == target) {
            System.out.println("TRUE");
        }
        else {
            System.out.println("FALSE");
        }

    }
}
