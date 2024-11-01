import java.util.ArrayList;
import java.util.List;

public class FirstLast6 {
    public static void main(String[]  args){
        firstLast6();
    }

    public static void firstLast6() {
        int[] firstNumbersSet = {1, 2, 3, 4, 5, 6};
        int[] secondNumbersSet = {6, 5, 4, 3, 2, 1};
        int[] thirdNumbersSet = {6, 2, 3, 6, 5, 6};
        int[] fourthNumbersSet = {1, 2, 3, 6, 5, 7};
        int target = 6;

        if (firstNumbersSet[0] == target || firstNumbersSet[firstNumbersSet.length - 1] == target) {
            System.out.println("TRUE");
        } else if (secondNumbersSet[0] == target || secondNumbersSet[secondNumbersSet.length - 1] == target) {
            System.out.println("TRUE");
        } else if (thirdNumbersSet[0] == target || thirdNumbersSet[thirdNumbersSet.length - 1] == target) {
            System.out.println("TRUE");
        } else if (fourthNumbersSet[0] == target || fourthNumbersSet[fourthNumbersSet.length - 1] == target) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }

    }
}
