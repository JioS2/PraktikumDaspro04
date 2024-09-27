import java.util.Scanner;
public class PemilihanBilangan09 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = sc.nextInt();

        String Jawaban;

        Jawaban = (angka % 2 == 0) ? "Bilangan Genap" : "Bilangan Ganjil";
        System.out.println(angka + " adalah " + Jawaban);

        sc.close();
  }
} 
