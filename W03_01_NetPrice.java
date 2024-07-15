public class W03_01_NetPrice {
    public static void main(String[] args){
        //สร้างตัวแปลเพื่อเก็บค่าของแต่ละอย่าง
        short price = 350;
        byte quantity = 10;
        byte percentDiscount = 5;

        int totalPrice = price * quantity;
        int discount = totalPrice * percentDiscount / 100;
        int netPrice = totalPrice - discount;

    System.out.println("ราคาสินค้าทั้งหมด = " + totalPrice + "  บาท");
    System.out.println("ส่วนลด = " + discount + " บาท");
    System.out.println("ราคาสินค้าสุทธิ = " + netPrice + " บาท");
    }
}