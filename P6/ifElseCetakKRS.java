package P6;
import java.util.Scanner;

public class ifElseCetakKRS {
    public static void main(String[] args) {
        
        String semester02;

        Scanner agung = new Scanner(System.in);

        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.print("Masukkan Semester saat ini: ");
        semester02 = agung.nextLine();

        if (semester02.equalsIgnoreCase("1")) {
            System.out.println("KRS Semester 1 ditampilkan");
        } else if (semester02.equalsIgnoreCase("2")) {
            System.out.println("KRS Semester 2 ditampilkan");
        } else if (semester02.equalsIgnoreCase("3")) {
            System.out.println("KRS Semester 3 ditampilkan");
        } else if (semester02.equalsIgnoreCase("4")) {
            System.out.println("KRS Semester 4 ditampilkan");
        } else if (semester02.equalsIgnoreCase("5")) {
            System.out.println("KRS Semester 5 ditampilkan");
        } else if (semester02.equalsIgnoreCase("6")) {
            System.out.println("KRS Semester 6 ditampilkan");
        } else if (semester02.equalsIgnoreCase("7")) {
            System.out.println("KRS Semester 7 ditampilkan");
        } else if (semester02.equalsIgnoreCase("8")) {
            System.out.println("KRS Semester 8 ditampilkan");
        } else {
            System.out.println("Semester tidak valid");
        }
    }
}
