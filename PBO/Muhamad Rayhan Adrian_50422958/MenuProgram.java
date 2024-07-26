import java.util.Scanner;

public class MenuProgram {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.tampilkanMenu();
    }
}

class Menu {
    private Scanner scanner;

    public Menu() {
        scanner = new Scanner(System.in);
    }

    public void tampilkanMenu() {
        int pilihan = -1;

        while (pilihan != 0) {
            System.out.println("=== MENU ===");
            System.out.println("1. Nasi Goreng");
            System.out.println("2. Mie Goreng");
            System.out.println("3. Ayam Goreng");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");

            pilihan = scanner.nextInt();
            scanner.nextLine(); // Membersihkan karakter baru (\n) setelah membaca nomor

            prosesPilihanMenu(pilihan);
        }

        scanner.close();
        System.out.println("Terima kasih telah memesan!");
    }

    private void prosesPilihanMenu(int pilihan) {
        switch (pilihan) {
            case 1:
                System.out.println("Anda memilih nasi goreng");
                // Tambahkan logika atau fungsi yang ingin dijalankan untuk pilihan 1
                break;
            case 2:
                System.out.println("Anda memilih mie goreng");
                // Tambahkan logika atau fungsi yang ingin dijalankan untuk pilihan 2
                break;
            case 3:
                System.out.println("Anda memilih ayam goreng");
                // Tambahkan logika atau fungsi yang ingin dijalankan untuk pilihan 3
                break;
            case 0:
                System.out.println("Keluar dari program...");
                break;
            default:
                System.out.println("Pilihan tidak valid");
        }
    }
}