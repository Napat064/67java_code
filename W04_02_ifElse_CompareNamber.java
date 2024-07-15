import java.util.Scanner;
public class W04_02_ifElse_CompareNamber{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter frst number: ");
        int num1 = input.nextInt();
        System.out.print("Enter Second number: ");
        int num2 = input.nextInt();

        int result = 0;

        if(num1>num2) {
                result = num1-num2;
                System.out.println("The namber 1 is greater than the number 2");
        } else {
                result = num1+num2;
                System.out.println("The namber 1 is less than ro equal to the number 2");
        }
        System.out.print("The result is: " + result);
    }
}