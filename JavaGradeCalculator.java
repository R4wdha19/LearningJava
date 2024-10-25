import java.util.Scanner;

public class JavaGradeCalculator {

    public static void main (String[] args){
Calculator();

    }
    public static void Calculator(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter The Score To Get The Grade ");
        int score = input.nextInt();
        if(score> 90) {
            System.out.println("Excellent You Got A");
        }
        else if (score> 80 && score<90) {
            System.out.println("Great Work You Got B");
        }
        else if (score> 70 && score<80) {
            System.out.println("Good Work You Got C");
        }
        else if (score> 60 && score<70) {
            System.out.println("Need To Study More ! You Got D");
        }
        else {
            System.out.println("Sorry you have failed");
        }
    }

}