package P6;
import java. util.Scanner;

public class perpustakaan {
    public static void main(String[] args) {
        
        boolean kartu_mahasiswa, registrasi_onliine;

        Scanner agung = new Scanner(System.in);

        System.out.print("Apakah anda punya kartu mahasiswa (True/false): ");
        kartu_mahasiswa = agung.nextBoolean();
        System.out.print("Apakah sudah registrasi online (True/false): ");
        registrasi_onliine = agung.nextBoolean();

        if (kartu_mahasiswa && registrasi_onliine) {
            System.out.println("Bisa masuk");
        } else {
            System.out.println("tidak bisa masuk");
        }
    }
}
