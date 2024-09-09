package W13;

public class W13_01_introarray {

    public static void main(String[] args) {
        // ประกาศ
        String[] colors = {"Purple", "Cyan", "Blue", "Green", "Yellow", "Orange", "Red"};
        int[] banks = {20, 50, 100, 500, 1000};
        char[] alphabet = {'A', 'B', 'C', 'D', 'E'};
        // 
        System.out.println("the first color is " + colors[0]);
        System.out.println("The Third alphabet is " + alphabet[2]);

        // แสดงผลลัพโดยใช้ Loop
        System.err.println("Colors in the array are:");
        for (int i = 0; i < 7; i++) {
            System.out.print(colors[i] + " ");
        }
        System.out.println();
        for (int i = 6; i >= 0; i--) {
            System.out.print(colors[i] + " ");
        }
        System.out.println(" ");
        System.out.println("====================================================================");
        System.out.print("Banks in the array are : ");
        for (int i = 0; i < banks.length; i++) {
            System.out.print(banks[i] + " ");
        }
    }
}
