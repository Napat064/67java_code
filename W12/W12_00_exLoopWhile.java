// ให้แสดงผลลัพธ์ดังนี้
// ===============
// รอบที่ 1 
// รอบที่ 2 
// รอบที่ 3 
// รอบที่ 4 
// รอบที่ 5 
package W12;

public class W12_00_exLoopWhile {

    public static void main(String[] args) {
        // โครงสร้างคำสั่งลูป For / While แบ่งออกเป็น 3 ส่วน
        // 1. ส่วนตัวแปรเริ่มต้น
        // 2. เงื่อนไข
        // 3. การเพิ่มค่า / การลดค่า
        // TODO 1  
        System.out.println("TODO 1-For Loop");
        for (int i = 1; i <= 5; i++) {
            System.out.println("รอบที่ " + i);
        }
        System.out.println("-----------------------------");
        // ==============================TODO 1 - End for Loop===================================
        System.out.println("TODO 1-While Loop");
        int n = 1;
        while (n <= 5) {
            System.out.println("รอบที่ " + n);
            n++;
        }
        System.out.println("-----------------------------");
// ==============================================================================================
// TODO 2
//คำสั่ง 1 ให้แสดงผลลัพธ์ดังนี้
// ===============
// รอบที่ 1 Hello World
// รอบที่ 2 Hello World
// รอบที่ 3 Hello World
// รอบที่ 4 Hello World
// รอบที่ 5 Hello World
        System.out.println("TODO 2-For Loop");
        for (int i = 1; i <= 5; i++) {
            System.out.println("รอบที่ " + i + " Hello World");
        }
        System.out.println("-----------------------------");
        // ==============================TODO 2 - End for Loop================================
        System.out.println("TODO 2-While Loop");
        int a = 1;
        while (a <= 5) {
            System.out.println("รอบที่ " + a + " Hello World");
            a++;
        }
        System.out.println("-----------------------------");
// ======================================================================
// TODO 3
//คำสั่ง 2 ให้แสดงผลลัพธ์ดังนี้
// ===============
// 1 2 3 4 5 6 7 8 9 10

        System.out.println("TODO 3-For Loop");
        for (int j = 1; j <= 10; j++) {
            System.out.print(j + " ");
        }
        System.out.println("\n-----------------------------");

        // ==============================TODO 3 - End for Loop================================
        System.out.println("TODO 3-While Loop");
        int b = 1;
        while (b <= 10) {
            System.out.print(b + " ");
            b++;
        }
        System.out.println("\n-----------------------------");

// ======================================================================
// TODO 4
//คำสั่ง 2.1 ให้แสดงผลลัพธ์ดังนี้
// ===============
// 1 2 3 4 5 6 7 8 9 10 = 55
        System.out.println("TODO 4-For Loop");
        int sum = 0;
        for (int j = 1; j <= 10; j++) {
            System.out.print(j + " ");
            sum = sum + j; // snm += j;
        }
        System.out.println("= " + sum);
        System.out.println("-----------------------------");
        // ==============================TODO 4 - End for Loop================================

        System.out.println("TODO 4-While Loop");
        sum = 0;
        int e = 1;
        while (e <= 10) {
            System.out.print(e + " ");
            sum = sum + e;
            e++;
        }
        System.out.println("= " + sum);
        System.out.println("-----------------------------");

// ======================================================================
// TODO 5
//คำสั่ง 2.2 ให้แสดงผลลัพธ์ดังนี้
// ===============
// 1+2+3+4+5+6+7+8+9+10 = 55
        System.out.println("TODO 5-For Loop");
        sum = 0;
        for (int j = 1; j <= 10; j++) {
            System.out.print(j);
            sum = sum + j; // snm += j;
            if (j <= 9) {
                System.out.print("+");

            }
        }
        System.out.println(" = " + sum);
        System.out.println("-----------------------------");
        // ==============================TODO 5 - End for Loop================================
        System.out.println("TODO 5-While Loop");
        sum = 0;
        int f = 1;
        while (f <= 10) {
            System.out.print(f);
            sum = sum + f;
            f++;
            if (f <= 10) {
                System.out.print("+");
            }
        }
        System.out.println(" = " + sum);
        System.out.println("-----------------------------");

// ======================================================================
// TODO 6
//คำสั่ง 3 ให้แสดงผลลัพธ์ดังนี้
// ===============
// 10 9 8 7 6 5 4 3 2 1
        System.out.println("TODO 6-For Loop");
        for (int j = 10; j >= 1; j--) {
            System.out.print(j + " ");
        }
        System.out.println("\n-----------------------------");
        // ==============================TODO 6 - End for Loop================================
        System.out.println("TODO 6-While Loop");
        int h = 10;
        while (h >= 1) {
            System.out.print(h + " ");
            h--;
        }
        System.out.println("\n-----------------------------");
// ======================================================================
// TODO 7
//คำสั่ง 4 ให้แสดงผลลัพธ์ดังนี้
// ===============
// 1 3 5 7 9 11 13 15 17 19
        System.out.println("TODO 7-For Loop");
        for (int i = 1; i <= 19; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println("\n-----------------------------");
        // ==============================TODO 6 - End for Loop================================
        System.out.println("TODO 7-While Loop");
        int k = 1;
        while (k <= 19) {
            System.out.print(k + " ");
            k += 2;
        }
        System.out.println("\n-----------------------------");
// ======================================================================
// TODO 8
//คำสั่ง 5 ให้แสดงผลลัพธ์ดังต่อไปนี้
//===============
//2 4 6 8 10 12 14 16 18 20
        System.out.println("TODO 8-For Loop");
        for (int i = 2; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println("\n-----------------------------");
        // ==============================TODO 8 - End for Loop================================
        System.out.println("TODO 8-While Loop");
        sum = 0;
        int c = 2;
        while (c <= 20) {
            System.out.print(c + " ");
            c += 2;
        }
        System.out.println("\n-----------------------------");
// ======================================================================
// TODO 9
//คำสั่ง 6 ให้แสดงผลลัพธ์ดังนี้
// ===============
// 1 4 9 16 25 36 49 64 81 100

        System.out.println("");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i * i + " ");
        }

// ======================================================================
// TODO 10
//คำสั่ง 7 ให้แสดงผลลัพธ์ดังนี้
// ===============
// รอบที่ 1 เลขคี่
// รอบที่ 2 เลขคู่
// รอบที่ 3 เลขคี่
// รอบที่ 4 เลขคู่
// รอบที่ 5 เลขคี่
        System.out.println("");
        for (int i = 1; i <= 5; i++) {
            if (i % 2 == 0) {
                System.out.println("รอบที่ " + i + " เลขคู่");
            } else {
                System.out.println("รอบที่ " + i + " เลขคี่");
            }
        }
    }
}
// ======================================================================
