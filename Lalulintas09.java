import java.util.Scanner;
public class Lalulintas09 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        String saran;

        System.out.println("Lalu lintas apa yang anda lalui?: ");
        String laluLintas = sc.nextLine();

        if (laluLintas.equalsIgnoreCase("Lampu merah")) {
            saran = "anda berhenti, dan tunggu lampu hijau";
        } 
        else if (laluLintas.equalsIgnoreCase("Lampu kuning")) {
            saran = "anda siap-siap untuk berhenti";
        } 
        else if (laluLintas.equalsIgnoreCase("Lampu hijau")) {
            saran = "anda melanjutkan perjalanan anda";
        } 
        else {
            saran = "masukkan Lampu merah, kuning, atau hijau";
        }

        System.out.println("silahkan " + saran);

        sc.close();
    }
}
