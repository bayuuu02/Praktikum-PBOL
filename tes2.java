import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class tes2 {
   
    static Map<String, String> mahasiswaMap = new HashMap<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan;

        // Menu utama menggunakan control flow do-while loop
        do {
            System.out.println("\n==== Menu CRUD Mahasiswa ====");
            System.out.println("1. Create Mahasiswa");
            System.out.println("2. Read Mahasiswa");
            System.out.println("3. Update Mahasiswa");
            System.out.println("4. Delete Mahasiswa");
            System.out.println("5. Exit");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Clear buffer

            switch (pilihan) {
                case 1:
                    createMahasiswa();
                    break;
                case 2:
                    readMahasiswa();
                    break;
                case 3:
                    updateMahasiswa();
                    break;
                case 4:
                    deleteMahasiswa();
                    break;
                case 5:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 5);
    }

    // Fungsi untuk Create Mahasiswa
    static void createMahasiswa() {
        System.out.println("\n=== Tambah Mahasiswa ===");
        System.out.print("Masukkan NIM: ");
        String nim = scanner.nextLine();
        if (mahasiswaMap.containsKey(nim)) {
            System.out.println("NIM sudah terdaftar. Tidak bisa menambah mahasiswa dengan NIM yang sama.");
        } else {
            System.out.print("Masukkan Nama: ");
            String nama = scanner.nextLine();
            mahasiswaMap.put(nim, nama);
            System.out.println("Mahasiswa berhasil ditambahkan.");
        }
    }

    // Fungsi untuk Read Mahasiswa
    static void readMahasiswa() {
        System.out.println("\n=== Daftar Mahasiswa ===");
        if (mahasiswaMap.isEmpty()) {
            System.out.println("Belum ada data mahasiswa.");
        } else {
            for (Map.Entry<String, String> entry : mahasiswaMap.entrySet()) {
                System.out.println("NIM: " + entry.getKey() + ", Nama: " + entry.getValue());
            }
        }
    }

    // Fungsi untuk Update Mahasiswa
    static void updateMahasiswa() {
        System.out.println("\n=== Update Mahasiswa ===");
        System.out.print("Masukkan NIM mahasiswa yang ingin di-update: ");
        String nim = scanner.nextLine();
        if (mahasiswaMap.containsKey(nim)) {
            System.out.print("Masukkan Nama baru: ");
            String namaBaru = scanner.nextLine();
            mahasiswaMap.put(nim, namaBaru);
            System.out.println("Data mahasiswa berhasil di-update.");
        } else {
            System.out.println("Mahasiswa dengan NIM tersebut tidak ditemukan.");
        }
    }

    // Fungsi untuk Delete Mahasiswa
    static void deleteMahasiswa() {
        System.out.println("\n=== Hapus Mahasiswa ===");
        System.out.print("Masukkan NIM mahasiswa yang ingin dihapus: ");
        String nim = scanner.nextLine();
        if (mahasiswaMap.containsKey(nim)) {
            mahasiswaMap.remove(nim);
            System.out.println("Mahasiswa berhasil dihapus.");
        } else {
            System.out.println("Mahasiswa dengan NIM tersebut tidak ditemukan.");
        }
    }
}
