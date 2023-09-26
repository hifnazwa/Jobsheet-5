import java.util.Scanner;

public class PemilihanPercobaan114_1 {
    public static void main(String[] args) {
        Scanner input14 = new Scanner(System.in);
        String x;
        System.out.print ("Masukan nilai anda: ");
        int Angka = input14.nextInt();
        x = (Angka % 2 == 0) ? "Genap" : "Ganjil";

        System.out.println("Maka " + Angka + " Adalah " + x + "\n");
        }
    }

