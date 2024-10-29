import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaGradeCalculator {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        calculator();
        numberTypeChecker();
    }


    public static void calculator() {
        System.out.println("Please Enter The Score To Get The Grade ");
        int score = input.nextInt();
        if (score >= 90 && score <= 100) {
            System.out.println("Excellent You Got A");
        } else if (score >= 80 && score < 90) {
            System.out.println("Great Work You Got B");
        } else if (score >= 70 && score < 80) {
            System.out.println("Good Work You Got C");
        } else if (score >= 60 && score < 70) {
            System.out.println("Need To Study More ! You Got D");
        } else if (score > 100) {
            System.out.println("Be Serious ! No one will ever get more than 100 ");
        } else {
            System.out.println("Sorry you have failed");
        }
    }

    public static void numberTypeChecker() {
        System.out.println("Please Enter The Number To Be Checked");
        int number = input.nextInt();
        if (number == 0) {
            System.out.println("0 is by default Even");
        } else if (number % 2 == 0) {
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is Odd");
        }

    }

    public static void maxOfThreeNumber() {
        List<Integer> numbers = new ArrayList<>(3);

    }
}

