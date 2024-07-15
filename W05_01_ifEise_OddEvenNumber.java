import java.util.Scanner;

public class W05_01_ifEise_OddEvenNumber{
    public static void main(String[] args){
        Scanner kd = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = kd.nextInt();
        int result = number % 2;
        //Case 1
        if(result!=0) {
            System.out.print(number+ "is an odd number.");
        } else {
            System.out.print(number+ " is an even number.");
        }
        // Case 2
        if(result==1) {
            System.out.print(number+ "is an odd number.");
        } else {
            System.out.print(number+ " is an even number.");
        }
        // Case 3
        if(result==0) {
            System.out.print(number+ " is an even number.");
        } else {
            System.out.print(number+ "is an odd number.");
        }
        // Case 4
        if(result!=1) {
            System.out.print(number+ " is an even number.");
        } else {
            System.out.print(number+ "is an odd number.");
        }
    }
}