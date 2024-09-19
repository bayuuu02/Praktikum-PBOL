
import java.util.Scanner;

public class tes3 {

    public static void main(String[] args) {
        // Membuat scanner untuk menerima input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Menerima input nama
        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();

        // Menerima input NIM
        System.out.print("Masukkan NIM: ");
        String nim = scanner.nextLine();

        // Menampilkan output nama dan NIM
        System.out.println("\n=== Output ===");
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        
        // Menutup scanner
        scanner.close();
    }
}
