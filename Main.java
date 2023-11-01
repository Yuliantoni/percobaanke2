
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan kecepatan awal
        System.out.print("Masukkan kecepatan awal (m/s): ");
        double initialVelocity = input.nextDouble();

        // Meminta pengguna untuk memasukkan kecepatan akhir
        System.out.print("Masukkan kecepatan akhir (m/s): ");
        double finalVelocity = input.nextDouble();

        // Meminta pengguna untuk memasukkan waktu
        System.out.print("Masukkan waktu (s): ");
        double time = input.nextDouble();

        // Menghitung percepatan
        double acceleration = (finalVelocity - initialVelocity) / time;

        // Menampilkan hasil
        System.out.println("Percepatan adalah: " + acceleration + " m/s²");

        input.close();
    }
}
