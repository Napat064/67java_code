package W13;

import java.util.Scanner;

public class W13_02_introarray {

    public static void main(String[] args) {
        //ประกาศตัวแปล array แบบที่2 โดยไม่รู้ข้อมูลล่วงหน้า
        String[] brandCar = new String[3];
        Scanner kd = new Scanner(System.in);

        //กำหนดค่าให้ Array
        brandCar[0] = "Toyota";
        brandCar[1] = "Honda";
        brandCar[2] = "Nissan";

        System.out.println("Old Brand of cars in the array are:");
        for (int i = 0; i < brandCar.length; i++) {
            System.out.print(brandCar[0] + " / ");
        }

        System.out.println("\n\nPlease enter the brand fo the 3rd car");
        for (int i = 0; i < brandCar.length; i++) {
            System.out.println("Enter brand" + (i + 1) + ": ");
            brandCar[i] = kd.next();

        }

        System.out.println("\nNew Brand of cars in the array are:");
        for (String car : brandCar) {
            System.out.print(car + " / ");
        }
    }
}
