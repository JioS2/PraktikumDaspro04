import java.util.Scanner;

public class KategoriUsia09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Variabel untuk menyimpan usia
        int usia = -1;

            System.out.print("Masukkan usia Anda: ");
            
            // Cek apakah input adalah angka
            if (sc.hasNextInt()) {
                usia = sc.nextInt();
                
                // Validasi usia positif
                if (usia < 0) {
                    System.out.println("Usia harus berupa angka positif. Coba lagi.");
                }
            } else {
                // Jika input bukan angka
                System.out.println("Input tidak valid. Tolong masukkan angka.");
                sc.next();  // Membersihkan input yang salah
        }

        // Menentukan kategori usia
        if (usia >= 0 && usia <= 12) {
            System.out.println("Anda termasuk kategori: Anak");
        } else if (usia >= 13 && usia <= 19) {
            System.out.println("Anda termasuk kategori: Remaja");
        } else if (usia >= 20 && usia <= 64) {
            System.out.println("Anda termasuk kategori: Dewasa");
        } else if (usia >= 65) {
            System.out.println("Anda termasuk kategori: Lansia");
        }

        sc.close();

    }
}        