import java.util.Scanner;

public class tugas1 {

    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        System.out.print("Silahkan Masukkan Nama: ");
        String nama = scanner.nextLine();

        System.out.print("Silahkan Masukkan NIM: ");
        String nim = scanner.nextLine();

          System.out.println("Nama: " + nama);
          System.out.println("NIM: " + nim);

        scanner.close();
    }
}
