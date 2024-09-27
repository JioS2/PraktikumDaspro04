import java.util.Scanner;
    public class Parkir09 {
        public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("---------------------Menghitung Biaya Parkir---------------------");

        int biayaBayar = 5000;

        System.out.print("Masukkan jenis kendaraan (mobil/motor): ");
        String jenisKendaraan = sc.nextLine();
        
        if (jenisKendaraan.equals("mobil")) {
            biayaBayar = 5000;
            System.out.println("Harga parkir per jam untuk mobil Rp 5000");
        } else if (jenisKendaraan.equals("motor")) {
            biayaBayar = 3000;
            System.out.println("Harga parkir per jam untuk motor Rp 3000");
        } else {
            System.out.println("Jenis kendaraan tidak valid.");
            // Mengakhiri program jika input tidak valid
            sc.close();
            return;
        }
        
        
        System.out.print("Berapa jam parkir?: ");
        int jumlahJam = sc.nextInt();

        int totalBiaya = biayaBayar * jumlahJam;
        
        System.out.println("Total biaya parkir untuk " + jenisKendaraan + " adalah Rp" + totalBiaya);

        sc.close();



        }
    }
