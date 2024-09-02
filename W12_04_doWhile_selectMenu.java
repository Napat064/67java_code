package W12;

import java.util.Scanner;   // นำเข้าคลาส Scanner

public class W12_04_doWhile_selectMenu {

    public static void main(String[] args) {
        // ประกาศ Scanner object
        Scanner kb = new Scanner(System.in);

        // ประกาศตัวแปรเพื่อเก็บค่าที่ผู้ใช้เลือก
        int choice;

        // ให้ผู้ใช้เลือกเมนูซ้ำจนกว่าจะเลือกออก ใช้ do-while
        // แสดงเมนู
        // รับค่าเลือกเมนู
        do {
            System.out.println("====================================");
            System.out.println("Menu:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Exit");
            System.out.println("====================================");

            System.out.println("Enter your choice : ");// แสดงข้อความให้ผู้ใช้ป้อนเลือกเมนู Enter your choice:
            choice = kb.nextInt();// รับค่าจากคีย์บอร์ดเก็บไว้ในตัวแปร choice
            System.out.println("------------------------------------");
            switch (choice) {
                case 1:     // ถ้าผู้ใช้เลือก 1
                    System.out.print("Enter the first number: ");
                    int nam1 = kb.nextInt();// รับค่าจากคีย์บอร์ดเก็บไว้ในตัวแปร num1
                    System.out.print("Enter the first number: ");
                    int nam2 = kb.nextInt();// รับค่าจากคีย์บอร์ดเก็บไว้ในตัวแปร num2
                    int sum = nam1 + nam2;// คำนวณผลรวม
                    System.out.println("The sum is " + sum);// แสดงผลรวม
                    break;// ออกจาก switch

                case 2:
                    System.out.print("Enter the first number: ");
                    int nam3 = kb.nextInt();// รับค่าจากคีย์บอร์ดเก็บไว้ในตัวแปร num3
                    System.out.print("Enter the first number: ");
                    int nam4 = kb.nextInt();// รับค่าจากคีย์บอร์ดเก็บไว้ในตัวแปร num4
                    int difference = nam3 - nam4;// คำนวณผลรวม
                    System.out.println("The difference is " + difference);// แสดงผลรวม
                    break;// ออกจาก switch

                case 3:
                    System.out.println("Goodbye");
                    break;
                default:    // ถ้าผู้ใช้เลือกเมนูอื่น
                    System.out.println("Invalid choice. Please try again.");
                // แสดงข้อความเลือกเมนูไม่ถูกต้อง
            }
        } while (choice != 3);// เงื่อนไขคือ วนลูปไปเรื่อยๆ จนกว่าผู้ใช้จะเลือก 3
        // ตรวจสอบเมนูที่ผู้ใช้เลือก

        // ปิด Scanner object
    }
}
