public class MaximumOfThreeNumbers {
    public static void main(String[]  args){
        maxOfThreeNumbers(1,1,1);
        maxOfThreeNumbers(1,1,3);
        maxOfThreeNumbers(1,2,1);
        maxOfThreeNumbers(1,0,0);
    }

    public static void maxOfThreeNumbers(Integer firstNumber, Integer secondNumber, Integer thirdNUmber) {

        if (firstNumber > secondNumber && firstNumber > thirdNUmber) {
            System.out.println("First Number is the maximum number");
        } else if (secondNumber > firstNumber && secondNumber > thirdNUmber) {
            System.out.println("Second Number is the maximum number");
        } else if (thirdNUmber > secondNumber && thirdNUmber > firstNumber) {
            System.out.println("Third Number is the maximum number");
        } else {
            System.out.println(" All Numbers are equal");
        }
    }
}
