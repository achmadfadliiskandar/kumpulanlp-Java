// Superclass
class Kendaraan {
    // Properti
    String merk;
    int tahun;

    // Konstruktor
    public Kendaraan(String merk, int tahun) {
        this.merk = merk;
        this.tahun = tahun;
    }

    // Metode
    public void melaju() {
        System.out.println("Kendaraan ini sedang melaju.");
    }
}

// Subkelas yang mewarisi dari kelas Kendaraan
class Mobil extends Kendaraan {
    // Konstruktor
    public Mobil(String merk, int tahun) {
        super(merk, tahun); // Memanggil konstruktor kelas induk (Kendaraan)
    }

    // Metode khusus untuk kelas Mobil
    @Override
    public void melaju() {
        System.out.println("Mobil ini sedang melaju dengan cepat.");
    }
}

// Kelas utama untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        // Membuat objek mobil
        Mobil mobil = new Mobil("Toyota", 2020);
        System.out.println("Mobil merk " + mobil.merk + " tahun " + mobil.tahun + ".");
        mobil.melaju(); // Memanggil metode dari subkelas Mobil
    }
}