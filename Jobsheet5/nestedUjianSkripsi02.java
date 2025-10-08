package Jobsheet5;
import java.util.Scanner;

public class nestedUjianSkripsi02 {
    public static void main(String[] args) {
        
        Scanner agung = new Scanner(System.in);

        String pesan02, bebasKompen02;
        int bimbinganP102, bimbinganP202;

        System.out.print("Apakah Mahasiswa sudah bebas kompen? (YA/TIDAK) : ");
        bebasKompen02 = agung.nextLine().trim();

        System.out.print("Masukkan jumlag log bimbingan Pembimbing 1 : ");
        bimbinganP102 = agung.nextInt();
        System.out.print("Masukkan jumlag log bimbingan Pembimbing 2 : ");
        bimbinganP202 = agung.nextInt();

        if (bebasKompen02.equalsIgnoreCase("Ya")) {
            if (bimbinganP102 >= 8 && bimbinganP202 >= 4) {
            pesan02 = "Semua syarat terpenuhi. Mahasiswa boleh mendaftar ujian skripsi";
            } else if (bimbinganP102<8 && bimbinganP202<4) {
            pesan02 = "Gagal! Log bimbingan P1 kurang dari 8 kali dan P2 kurang dari 4 kali";
            } else if (bimbinganP102<8) {
            pesan02 = "Gagal! Log bimbingan P1 belum mencapai 8 kali";
            } else {
            pesan02 = "Gagal! Log bimbingan P1 belum mencapai 4 kali";
            }   
        } else {
            pesan02 = "Gagal! Mahasiswa masih memiliki tanggungan kompen";
        }

        System.out.println(pesan02);
    } 

}