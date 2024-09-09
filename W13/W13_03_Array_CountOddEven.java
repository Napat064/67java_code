package W13;

public class W13_03_Array_CountOddEven {

    public static void main(String[] args) {
        int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        int countOdd = 0;
        int countEven = 0;
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
            if (number[i] % 2 == 0) {
                countOdd++;
            } else {
                countEven++;
            }
        }
        System.out.println("\nAmount For all Number : " + number.length);
        System.out.println("Amount For Odd Number : " + countOdd);
        System.out.println("Amount For Even Number : " + countEven);
    }
}
