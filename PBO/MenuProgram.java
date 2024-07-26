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
            System.out.println("=== MENU TOKO INFORMATIKA MODREN ===");
            System.out.println("1. Laptop");
            System.out.println("2. Pc");
            System.out.println("3. Ps");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");

            pilihan = scanner.nextInt();
            scanner.nextLine(); // Membersihkan karakter baru (\n) setelah membaca nomor

            prosesPilihanMenu(pilihan);
        }

        scanner.close();
        System.out.println("Terima kasih telah menggunakan program ini!");
    }

    private void prosesPilihanMenu(int pilihan) {
        switch (pilihan) {
            case 1:
                System.out.println("Menu Laptop");
                System.out.println("MacBook");
                System.out.println("Lenovo");
                System.out.println("Asus");
                break;
            case 2:
                System.out.println("Menu Pc");
                System.out.println("Samsung");
                System.out.println("Votre");
                System.out.println("Asus");
                break;
            case 3:
                System.out.println("Menu ps");
                System.out.println("ps3");
                System.out.println("ps4");
                System.out.println("ps5");
                break;
            case 0:
                System.out.println("Keluar dari program...");
                break;
            default:
                System.out.println("Pilihan tidak valid");
        }
    }
}
