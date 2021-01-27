package proyek2klinik;

import java.util.Scanner;
public class Proyek2Klinik {
    
    public static void main(String[] args) {
        //1. Klinik Buka
        System.out.println("Selamat Datang Di Klinik Kelompok 9");
        
        System.out.println("------------------------------------");
        boolean buka;
        Scanner sc = new Scanner(System.in);
        Klinik obj1 = new Klinik();
        
        System.out.print("Apakah Klinik Buka[true/false]? ");
        buka = sc.nextBoolean();
        obj1.bukaa(buka);
        
        
        //2. Pasien Nama, Umur dan Bpjs
        System.out.println("------------------------------------");
        String nama;
        int umur;
        boolean bpjs;
        Pasien obj2 = new Pasien();
        Scanner sc2 = new Scanner(System.in);
        
        System.out.print("Input Nama Anda: ");
        nama = sc2.nextLine();
        
        System.out.print("Input Umur Anda: ");
        umur = sc2.nextInt();
        
        System.out.print("Apakah Anda Menggunakan BPJS[true/false]: ");
        bpjs = sc2.nextBoolean();
        
        
        //3. Dokter doctor dan absen
        System.out.println("------------------------------------");
        int doctor;
        boolean absen;
        Dokter obj3 = new Dokter();
        Scanner sc3 = new Scanner(System.in);
        
        System.out.print("Dokter Anda[1,2,3]: ");
        doctor = sc3.nextInt();
        
        System.out.print("Absen Dokter[true/false]? ");
        absen = sc3.nextBoolean();
        
        
        //DATA PASIEN
        System.out.println("------------------------------------");
        System.out.println("\nDATA PASIEN: ");
        System.out.println("Nama        : "+nama);
        System.out.print("Usia        : ");
        obj2.umurr(umur);
        System.out.print("Bpjs        : ");
        obj2.bpjss(bpjs);
        System.out.print("Dokter      : ");
        obj3.doctorr(doctor);
        System.out.print("Absen Dokter: ");
        obj3.absenn(absen);
        System.out.println("Note! Usia Berdasarkan Kategori Umur WHO");
        System.out.println("Hello World");
        
        
    }
    
}