package P6;
import java.util.Scanner;

public class Siakadfor02 {
    public static void main(String[] args) {
        
        double nilai02, terendah02 = 100, tertinggi02 = 0;

        Scanner agung = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke- " + i + " : ");
            nilai02 = agung.nextDouble();

            if (nilai02 > tertinggi02) {
                tertinggi02 = nilai02;
            }
            if (nilai02 < terendah02) {
                terendah02 = nilai02;
            }
        }

        System.out.println("Nilai Tertinggi : " + tertinggi02);
        System.out.println("Nilai Terendah : " + terendah02);
    }
}
