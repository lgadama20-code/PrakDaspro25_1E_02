package P6;
import java.util.Scanner;

public class CM_SIAKAD_02 {
    public static void main(String[] args) {
        
        int pancasila02, daspro02;
        int nilai_pancasila02, nilai_daspro02;
        double setara_pancasila02= 0.0, setara_daspro02 = 0.0, setara_bing02 = 0.0;
        double ip02;
        double bobot02;
        String grade02 = "", grade_daspro02 = "";

        Scanner agung = new Scanner(System.in);

        System.out.println("=".repeat(20) + "INPUT DATA MAHASISWA" + "=".repeat(20));
        System.out.println("Nama : Agung Satrio Gusti");
        System.out.println("NIM  : 254107020228");
        System.out.println(); //00
        System.out.println("Masukkan Nilai Angka (0-100)");
        System.out.print("1. Pancasila : " );
        pancasila02 = agung.nextInt();
        System.out.print("2. Dasar Pemograman : ");
        daspro02 = agung.nextInt();
        // System.out.println("Bahasa Inggris 1 : ");
        // bing02 = agung.nextInt();

        System.out.println(); //o
        System.out.println("=================================================== HASIL KONVERSI NILAI MAHASISWA ==================================================");
        System.out.println("Nama : Agung Satrio Gusti");
        System.out.println("NIM  : 254107020228");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
        System.out.print("Mata Kuliah");
        System.out.print("\t\tSKS");
        System.out.print("\tNilai");
        System.out.print("\t\thuruf");
        System.out.println("\t\t  Setara");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
        System.out.print("Pancasila");
        System.out.print("\t\t 2");
        System.out.print("       " + pancasila02);

        if (daspro02 < 0 || daspro02 > 100 || pancasila02 < 0 || pancasila02 > 100) {
            System.out.println("\t[ERROR] Nilai tidak valid! Semua nilai harus berada di antara 0 - 100.");
        } else if (pancasila02 > 80 ) {
            grade02 = "A";
            setara_pancasila02 = 4;
        } else if (pancasila02 > 73) {
            grade02 = "B+";
            setara_pancasila02 = 3.5;
        } else if (pancasila02 > 65) {
            grade02 = "B";
            setara_pancasila02 = 3;
        } else if (pancasila02 > 60) {
            grade02 = "C+";
            setara_pancasila02 = 2.5;
        } else if (pancasila02 > 50) {
            grade02 = "C";
            setara_pancasila02 = 2;
        } else if (pancasila02> 39) {
            grade02 = "D";
            setara_pancasila02 = 1;
        } else {
            grade02 = "E";
            setara_pancasila02 = 0;
        }

        System.out.print("\t\t  " + grade02);
        System.out.println("\t\t   " + setara_pancasila02);

        System.out.print("Dasar Pemograman");
        System.out.print("\t 3");
        System.out.print("       " + daspro02);

        if (daspro02 < 0 || daspro02 > 100 || pancasila02 < 0 || pancasila02 > 100) {
            System.out.println("\t[ERROR] Nilai tidak valid! Semua nilai harus berada di antara 0 - 100.");
        } else if (daspro02 > 80 ) {
            grade_daspro02 = "A";
            setara_daspro02 = 4;
        } else if (daspro02 > 73) {
            grade_daspro02 = "B+";
            setara_daspro02 = 3.5;
        } else if (daspro02 > 65) {
            grade_daspro02 = "B";
            setara_daspro02 = 3;
        } else if (daspro02 > 60) {
            grade_daspro02 = "C+";
            setara_daspro02 = 2.5;
        } else if (daspro02 > 50) {
           grade_daspro02 = "C";
            setara_daspro02 = 2;
        } else if (daspro02> 39) {
            grade_daspro02 = "D";
            setara_daspro02 = 1;
        } else {
            grade_daspro02 = "E";
            setara_daspro02 = 0;
        }

        System.out.print("\t\t  " + grade_daspro02);
        System.out.println("\t\t   " + setara_daspro02);

        // System.out.print("Bahasa Inggris 1");
        // System.out.print("\t2");
        // System.out.print("    " + bing02);
        // // System.out.print("\t" + grade02);
        // // System.out.print("\t\t\t  " + bing02 );

        // if (bing02 > 80 ) {
        //     grade02 = "A";
        //     System.out.print(grade02);
        //     System.out.println("\t\t  Lulus");
        //     setara_bing02 = 4;
        //     System.out.println(setara_bing02);
        // } else if (bing02 > 73) {
        //     grade02 = "B+";
        //     System.out.print(grade02);
        //     System.out.println("\t\t  Lulus");
        //     setara_bing02 = 3.5;
        //     System.out.println(setara_bing02);
        // } else if (bing02 > 65) {
        //     grade02 = "B";
        //     System.out.print(grade02);
        //     System.out.println("\t\t  Lulus");
        //     setara_bing02 = 3;
        //     System.out.println(setara_bing02);
        // } else if (bing02 > 60) {
        //     grade02 = "C+";
        //     System.out.print(grade02);
        //     System.out.println("\t\t  Lulus");
        //     setara_bing02 = 2.5;
        //     System.out.println(setara_bing02);
        // } else if (bing02 > 50) {
        //     grade02 = "C";
        //     System.out.print(grade02);
        //     System.out.println("\t\t  Tidak Lulus");
        //     setara_bing02 = 2;
        //     System.out.println(setara_bing02);
        // } else if (bing02 > 39) {
        //     grade02 = "D";
        //     System.out.print(grade02);
        //     System.out.println("\t\t  Tidak Lulus");
        //     setara_bing02 = 1;
        //     System.out.println(setara_bing02);
        // } else if (bing02 > 0) {
        //     grade02 = "E";
        //     System.out.print(grade02);
        //     System.out.println("\t\t  Tidak Lulus");
        //     setara_bing02 = 0;
        //     System.out.println(setara_bing02);
        // } else {
        //     System.out.println("[ERROR] Nilai Tidak valid! Semua nilai harus berada di antara 0 - 100");
        // }

        bobot02 = (setara_pancasila02*2) + (setara_daspro02*3);
        ip02 = bobot02 / (7);

        System.out.println("-".repeat(133));
        System.out.println("Total SKS  : " + 7);
        System.out.println("Total Bobot: " + bobot02);
        System.out.println("Indeks Prestasi (IP) : " + ip02);

        if (pancasila02 <= 39 || daspro02 <= 39) {
            System.out.println("Tidak lolos karena terdapat nilai E");
        } else if (pancasila02 <= 60 || daspro02 <= 60) {
            System.out.println("Tidak lolos karena terdapat nilai C/D");
        } else if (ip02 < 2.00) {
            System.out.println("Tidak lolos karena IP kurang dari 2.00");
        } else {
            System.out.println("Lolos");
        }
       


    }
}
