import java.util.Scanner;
public class Sistemlogin09 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        String usernameyu = "Angga_";
        String passwordyu = "2006";

        System.out.println("Masukkan username anda: ");
        String username = sc.nextLine();

        System.out.println("Masukkan password anda: ");
        String password = sc.nextLine();

        if (username.equals(usernameyu) && password.equals(passwordyu)) {
            System.out.println("login berhasil, selamat datang di sistem!");
        }
        else {
            System.out.println("user / password anda salah, silahkan coba lagi!");
        }
    
        sc.close();

    }
}
