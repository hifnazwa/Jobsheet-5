import java.util.Scanner;

public class PemilihanPercobaan314 {
    public static void main(String[] args) {
        Scanner input14 = new Scanner(System.in);
        double angka1, angka2, hasil;
        char operator;
    
        System.out.print ("masukkan angka pertama: ");
        angka1 = input14.nextDouble();
        System.out.print ("Masukkan angka kedua: ");
        angka2 = input14.nextDouble();
        System.out.print ("Masukkan operator (+ _ * /): ");
        operator = input14.next().charAt(0);

        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                System.out.print(angka1 + " + " + angka2 + "=" + hasil);
                break;
            case '-':
                hasil = angka1 - angka2;
                System.out.println(angka1 + " - " + angka2 + "=" + hasil);
                break;
            case '*':
            hasil = angka1 / angka2;
            System.out.println (angka1 + " * " + angka2 + "=" + hasil);
                break;
            case '/':
            hasil = angka1 / angka2;
            System.out.println (angka1 + " / " + angka2 + "=" + hasil);
            break;
        
        }
    }

}
