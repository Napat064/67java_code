package W15;

import java.util.Scanner;

public class W15_02_method_calculator {

    // ทั้งหมดเป็น method ที่มีการรับค่าและคืนค่า
    // 1) Method สำหรับบวกเลข
    static int add(int a, int b) {
        System.out.print(a + " + " + b);
        return a + b;
    }

    // 2) Method สำหรับลบเลข
    static int subtract(int a, int b) {
        System.out.print(a + " - " + b);
        return a - b;
    }

    // 3) Method สำหรับคูณเลข
    static int multipiy(int a, int b) {
        System.out.print(a + " * " + b);
        return a * b;
    }

    // 4) Method สำหรับหารเลข
    static int devide(int a, int b) {
        System.out.print(a + " / " + b);
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ใส่ตัวเลขที่ 1 ");
        int a = sc.nextInt();

        System.out.print("ใส่ตัวเลขที่ 2 ");
        int b = sc.nextInt();

        // 1) Method สำหรับบวกเลข
        System.out.println(" ผลลัพเป็น " + add(a, b));
        // 2) Method สำหรับลบเลข
        System.out.println(" ผลลัพเป็น " + subtract(a, b));
        // 3) Method สำหรับคูณเลข
        System.out.println(" ผลลัพเป็น " + multipiy(a, b));
        // 4) Method สำหรับหารเลข
        System.out.println(" ผลลัพเป็น " + devide(a, b));
    }

}
