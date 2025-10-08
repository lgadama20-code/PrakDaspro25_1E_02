package P6;
import  java.util.Scanner;

public class TugasDua02 {
    public static void main(String[] args) {
        
        int angka02, hasil02;

        Scanner agung = new Scanner(System.in);

        System.out.print("Masukkan angka : ");
        angka02 = agung.nextInt();
        hasil02 = angka02 %2;

    if (hasil02 == 0) {
        System.out.println("genap");
    } else {
        System.out.println("ganjil");
    }

    }
}
