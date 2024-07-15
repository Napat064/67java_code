import java.util.Scanner; // นำคลาส Scanner จาก package java.util

public class W04_03_AreaCircie{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in); // สร้างอ๊อปเจ็กด์ของคลาส Scanner
        System.out.print("ป้อนค่ารัศมีของวงกลม: "); //แสดงข้อความที่ผู้ใช้
        double radius = sc.nextDouble(); //รับค่ารัศมีจากผู้ใช้ละเก็บ

        // double radius; // ประกาศตัวแปลเก็บค่ารัศมี
        // radius = 10; // กำหนดค่ารัศมีเป็น 10

        double area; // ประกาศตัวแปลเก็บค่าพื้นที่
        double PI=3.14159; // ประกาศค่าคงที่ PI
        if(radius>0) {
               area = PI*radius*radius; //คำนวนพื้นที่ของวงกลม

            System.out.println("พื้นที่ของวงกลมที่มีรัสมีเท่ากับ "+radius+" คือ "+area);

        } else {
               System.out.println("Error: รัศมีต้องมากกว่า 0"); 
        }
       
    }
}