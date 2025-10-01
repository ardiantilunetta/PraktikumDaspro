package jobsheet5;
import java.util.Scanner;

public class aksesPerpustakaan19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---Selamat Datang di Perpustakaan Polinema--");
        System.out.print("Apakah membawa kartu mahasiswa? (Ya/Tidak) : ");
        String kartu = sc.nextLine();
        System.out.print("Apakah sudah registrasi? (Ya/Tidak) : ");
        String registrasi = sc.nextLine();
        if (kartu.equalsIgnoreCase("Ya")||registrasi.equalsIgnoreCase("Ya")) {
            System.out.println("Berhasil, silahkan masuk!");
        } else {
            System.out.println("Tidak memenuhi syarat, dilarak masuk");
        }
    }
}
