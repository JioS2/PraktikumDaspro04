import java.util.Scanner;
public class Siakad09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, nim;
        char kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir;
        String nilaiAkhirHuruf, kualifikasi;
        
        System.out.print("Masukkan nama: ");
        nama = sc.nextLine();
        System.out.print("Masukkan NIM: ");
        nim = sc.nextLine();
        System.out.print("Masukkan kelas: ");
        kelas = sc.nextLine().charAt(0);
        System.out.print("Masukkan nomor absen: ");
        absen = sc.nextByte();
        System.out.print("Masukkan nilai kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan nilai tugas: ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan nilai ujian: ");
        nilaiUjian = sc.nextDouble();

        
        nilaiAkhir = (nilaiKuis * 0.25) + (nilaiTugas * 0.25) + (nilaiUjian * 0.5);
        
        if (nilaiAkhir >= 80 && nilaiAkhir <= 100) {
            nilaiAkhirHuruf = "A";
        } 
        else if (nilaiAkhir >= 73 && nilaiAkhir <= 80) {
            nilaiAkhirHuruf = "B+";
        }
        else if (nilaiAkhir >= 65 && nilaiAkhir <= 73) {
            nilaiAkhirHuruf = "B";  
        }
        else if (nilaiAkhir >= 60 && nilaiAkhir <= 65) {
            nilaiAkhirHuruf = "C+";
        }
        else if (nilaiAkhir >= 50 && nilaiAkhir <= 60) {
            nilaiAkhirHuruf = "C";
        }
        else if (nilaiAkhir >= 39 && nilaiAkhir <= 50) {
            nilaiAkhirHuruf = "D";
        }
        else { //else terakhir harus kosong
            nilaiAkhirHuruf = "E";
        }

        switch (nilaiAkhirHuruf) {
            case "A":
            kualifikasi = "sangat baik";
            break;
            case "B+":
            kualifikasi = "lebih dari baik";
            break;
            case "B":
            kualifikasi = "baik";
            break;
            case "C+":
            kualifikasi = "lebih dari cukup";
            break;
            case "C":
            kualifikasi = "cukup";
            break;
            case "D":
            kualifikasi = "kurang";
            break;
            case "E":
            kualifikasi = "gagal";
            default:
            kualifikasi = "nilai tidak ada";
        }

        System.out.println("Mahasiswa dengan Nama " + nama + " dengan Nim " + nim + " Kelas " + kelas + " Nomor absen " + absen);
        
        System.out.println("Nilai Akhir: " + nilaiAkhir);
        System.out.println("Nilai Akhir Huruf: " + nilaiAkhirHuruf);
        System.out.println("Kualifikasi: " + kualifikasi);

        sc.close();
    }
}