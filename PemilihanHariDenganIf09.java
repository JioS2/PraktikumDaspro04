import java.util.Scanner;
public class PemilihanHariDenganIf09 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("input dayName 1-7: ");
        int dayName = sc.nextInt();

        if (dayName >= 1 && dayName <= 5) {
            System.out.println("weekday");    
        }
        else if (dayName >= 6 && dayName <= 7){
            System.out.println("weekend");
        }
        else {
            System.out.println("invalid number, try!!");
        }

        sc.close();
    }
}
