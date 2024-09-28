import java.util.Scanner;
public class Kafe09 {
    public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
        //menginput variabel
    String menu;
    char ukuranCup;
    int jumlah;
    boolean keanggotaan;
        //menginput menu,ukurancup,jumlah,keanggotaan
    System.out.println("Masukkan menu pilihan anda: ");
    menu = sc.nextLine();
    System.out.println("Masukkan ukuran cup: ");
    ukuranCup = sc.next().charAt(0);
    System.out.println("Masukkan jumlah: ");
    jumlah = sc.nextInt();
    System.out.println("Masukkan keanggotaan anda (true/false)");
    keanggotaan = sc.nextBoolean();

    double hargaMenu = 0;
        // masukkan harga menu
    switch (menu.toLowerCase()) {
        case "kopi":
            hargaMenu = 12000;
            break;
        case "teh":
            hargaMenu = 7000;
            break;
        case "coklat":
            hargaMenu = 20000;
            break;
    }
        double totalHarga = hargaMenu * jumlah;
    // masukkan update harga dari tiap ukuran cup
    switch (ukuranCup) {
        case 'S':
            break;
        case 'M':
            totalHarga += 0.25 * totalHarga;
            break;
        case 'L':
            totalHarga += 0.4 * totalHarga;
            break;
    }
    //memasukkan status keanggotaan
        double diskon = keanggotaan ? 0.1 : 0;
        double nominalBayar = totalHarga - (diskon * totalHarga);
    // menghitung nominalBayar
        System.out.println("Item pembelian: " + jumlah + " " + menu + " dengan ukuran cup " + ukuranCup);
        System.out.println("Nominal Bayar: " + nominalBayar);

    }
}
