import java.util.Scanner;

public class Latihan14 {
    public static void main(String[] args) {
        Scanner sc14 = new Scanner(System.in);

        System.out.print("Masukkan Suhu : ");
        int suhu = sc14.nextInt();

        if (suhu<16) {
            System.out.println("silahkan menggunakan jaket");
        }
        if (suhu<20) {
            System.out.println("silahkan pakai baju tebal");
        }
        else {
            System.out.println("silahkan pakai topi");
        }
    }
}
