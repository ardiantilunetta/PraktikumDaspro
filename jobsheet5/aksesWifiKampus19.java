package jobsheet5;

import java.util.Scanner;

public class aksesWifiKampus19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--Login Layanan WiFi--");
        System.out.print("1. Dosen\n2. Mahasiswa\nPilih pengguna (1/2) : ");
        int pengguna = sc.nextInt();
        switch (pengguna) {
            case 1:
                System.out.println("Akses WiFi diberikan (Dosen)");
                break;
            case 2:
                System.out.print("Masukkan jumlah SKS : ");
                int sks = sc.nextInt();
                if (sks >= 12) {
                    System.out.println("Akses WiFi diberikan (Mahasiswa aktif)");
                } else if (sks < 12) {
                    System.out.println("Akses ditolak, SKS kurang dari 12");
                } break;
            default:
                System.out.println("Akses ditolak");
                break;
        }
    }
}
