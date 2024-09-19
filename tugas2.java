import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class tugas2 {
    static Map<String, String> Map = new HashMap<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan;
        do {
            System.out.println("1. Create | 2. Read | 3. Update | 4. Delete | 5. Exit");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Clear buffer

            switch (pilihan) {
                case 1 -> create();
                case 2 -> read();
                case 3 -> update();
                case 4 -> delete();
                case 5 -> System.out.println("Keluar.");
                
            }
        } while (pilihan != 5);
    }

    static void create() {
        System.out.print("Masukkan NIM: ");
        String nim = scanner.nextLine();
        if (Map.containsKey(nim)) {
            
        } else {
            System.out.print("Masukkan Nama: ");
            Map.put(nim, scanner.nextLine());
            System.out.println("Berhasil Ditambahkan.");
        }
    }

    static void read() {
        if (Map.isEmpty()) {
            System.out.println("Kosong.");
        } else {
            Map.forEach((nim, nama) -> 
                System.out.println("NIM: " + nim + ", Nama: " + nama));
        }
    }

    static void update() {
        System.out.print("Masukkan NIM yang ingin diupdate: ");
        String nim = scanner.nextLine();

        if (Map.containsKey(nim)) {
            System.out.print("Masukkan Nama baru: ");
            Map.put(nim, scanner.nextLine());
            System.out.println("Berhasil diupdate.");
        } else {
            System.out.println("Tidak ada.");
        }
    }

    static void delete() {
        System.out.print("Masukkan NIM yang ingin dihapus: ");
        String nim = scanner.nextLine();
        if (Map.remove(nim) != null) {
            System.out.println("Berhasil dihapus.");
        } else {
            System.out.println("Tidak ada.");
        }
    }
}
