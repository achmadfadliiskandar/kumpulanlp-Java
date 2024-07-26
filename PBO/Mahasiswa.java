import java.util.Scanner;

class PelajarAtas {
    String nama;
    String npm;
    String kelas;
    String jurusan;
    String Angkatan;

    public void datamahasiswa() {
        System.out.println("Nama Lengkap : " + "Achmad Fadli Iskandar");
        System.out.println("Nomor Pokok Mahasiswa : " + "50422069");
        System.out.println("Kelas : " + "2IA13");
        System.out.println("Jurusan : " + "INFORMATIKA");
        System.out.println("Angkatan : " + "2022");
    }


    protected void datadosen() {
        // ini adalah method dosen yang nanti kita akan overide ke subclass dosen
    }
}
abstract class MhsAktif{
    // abstract method yang berisikan indexprestasi(index prestasi kumulatif saya) abstract method tidak punya body didalam method/classnya
    public abstract void nilaisaya();
}

class Matkul extends PelajarAtas {
    public void infomatkul() {
        String[][] informasimatkul = {
            {"ABC12","PBO"},
            {"DEF34","BISFOR"},
            {"GHI56","ARKOM"},
            {"JKL78","MATFOR4"},
            {"MN090","MATLAN2"},
            {"PQR12","RO"},
            {"STU34","STATIS2"},
            {"VWX56","SB"},
            {"YZ123","SO"},
        };
        // Loop through the 2D array and print the kodematkul and matkul
        for (int i = 0; i < informasimatkul.length; i++) {
            System.out.println("Kode Matkul: " + informasimatkul[i][0] + ", Matkul: " + informasimatkul[i][1]);
        }
        //kode dibawah ini sederhana dan lebih cepat namanya foreach langsung loop terhadap iterasinya
        // for (String[] infmktkl : informasimatkul) {
        //     System.out.println("Kode Matkul: " + infmktkl[0] + ", Matkul: " + infmktkl[1]);
        // }
    }
}

class JadwalKuliah extends PelajarAtas {
    private String[] jadkul = {"Senin","Selasa","Rabu","Kamis","Jumat","Sabtu"};
    public void jadkuliah() {
        System.out.println("Jadwal Kuliah : " + jadkul[2] + "|" + jadkul[3] + "|"  + jadkul[4]);
    }
}
// sub class khusus yang saya jadikan untuk pemanggilan metode abstrak 
class Ipk extends MhsAktif{
   private String[] indexprestasikumulatif = {"3.10","3.50","3.48"};
    public void nilaisaya(){
        System.out.println("IPK : " + indexprestasikumulatif[indexprestasikumulatif.length-1]);
    }
}

class Dosen extends PelajarAtas {
    @Override
    public void datadosen() {
        String[][] dosenMatkul = {
            {"PBO", "Achmad Fadli"},
            {"BISFOR", "Budi Santoso"},
            {"MATFOR", "Cahaya Sari"},
            {"RO", "Gita Rahma"},
            {"STATIS", "Hadi Purwanto"},
            {"SB", "Dewi Lestari"},
            {"SO", "Indra Setiawan"}
        };

        // Loop through the 2D array and print the courses and lecturers
        for (int i = 0; i < dosenMatkul.length; i++) {
            System.out.println("Mata Kuliah: " + dosenMatkul[i][0] + ", Dosen: " + dosenMatkul[i][1]);
        }
    }
}

public class Mahasiswa {
    public static int chose() {
        // isi list khusus untuk inputan
        try {
            Scanner pilihan = new Scanner(System.in);
            System.out.print("Masukan Pilihan 1-5 : ");
            int chose = pilihan.nextInt();
            // end isi list khusus untuk inputan
            System.out.println("\033\143"); //kode ascii yang berfungsi membersihkan layar terminal di UNIX
            return chose;
        } catch (Exception e) {
            System.err.println("input angka aja ya hanya 1-5 : " + "karena tidak sesuai syarat");
        }
        return 0;
    }

    public static void main(String[] args) {
        // deklarasi judul
        System.out.println("Data Mahasiswa Gunadarma");
        // deklarasi judul

        boolean running = true;
        while (running) {
            // panggil fungsi chose dan input bedasarkan pilihan 1-5 dan dideklarasikan ke integer
            int chose = chose();

            switch (chose) {
                case 1:
                    System.out.println("Pilihan Ke 1 | Identitas Mahasiswa");
                    PelajarAtas pelajaratas = new PelajarAtas();
                    pelajaratas.datamahasiswa();
                    // manggil method abstrak dari MhsAktif dari pewarisan Ipk
                    Ipk ipk = new Ipk();
                    ipk.nilaisaya();
                    break;
                case 2:
                    System.out.println("Pilihan Ke 2 | Mata Kuliah Yang Dipelajari Mahasiswa");
                    Matkul matkul = new Matkul();
                    matkul.infomatkul();
                    break;
                case 3:
                    System.out.println("Pilihan Ke 3 | Jadwal Kuliah Mahasiswa");
                    JadwalKuliah jKuliah = new JadwalKuliah();
                    jKuliah.jadkuliah();
                    break;
                case 4:
                    System.out.println("Pilihan Ke 4 | Dosen Yang Mengampu Matkul Yang Diambil Mahasiswa");
                    Dosen dosen = new Dosen();
                    dosen.datadosen();
                    break;
                case 5:
                    System.out.println("Terima Kasih Sudah mencoba");
                    running = false;
                    break;
                default:
                    System.out.println("Pilihan tidak ada, lanjut lagi");
                    break;
            }
            System.out.println();
        }
    }
}
