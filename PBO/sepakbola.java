/**
 * sepakbola
 * kasusnya penalti2 an
 * pemerannya ada 3 yaitu kiper dan penendang dan bola
 * sebagai contoh jika anda menendang ke kanan dan kiper mengarah ke kiri maka anda berhasil mencetak goal
 * sebaliknya jika anda menendang ke kiri dan kiper berhasil menangkap/menepis maka pinalti anda gagal
 * objeknya ada bola itu sendiri
 * targetnya itu ada 9 : pojok kanan atas | pojok kiri atas | tengah atas | tengah kanan | tengah kiri | bawah pojok kiri 
 *                       bawah pojok kanan | tengah bawah | pas tengah
 * kata kunci untuk kiper : kanan | tengah | kiri
 * kata kunci untuk penendang : samaseperti yang ada di atas yaitu targetnya ada 9
 * equals java : membandingkan refrensi kedua objek yang sama di memori
 */
public interface sepakbola {
    public String GerakanKiper();
    public String KakiPenendang();
    public String ArahBola();
}

/**
 * sepakbola
 */
class Football {
    private static String gerakanKiper;
    private static String arahBola;

    public static void main(String[] args) {
        Penendang pemainBola = new Penendang();
        arahBola = pemainBola.ArahBola();
        gerakanKiper = pemainBola.GerakanKiper();

        switch (arahBola) {
            case "pojok kanan atas":
            case "pojok kanan bawah":
            case "tengah kanan":
                if (gerakanKiper.equals("kanan atas") || gerakanKiper.equals("kanan bawah") || gerakanKiper.equals("kanan")) {
                    System.out.println("penalti berhasil ditepis");
                } else {
                    System.out.println("Anda Berhasil Mencetak Goal");
                }
                break;
            case "pojok kiri atas":
            case "pojok kiri bawah":
            case "tengah kiri":
                if (gerakanKiper.equals("kiri atas") || gerakanKiper.equals("kiri bawah") || gerakanKiper.equals("kiri")) {
                    System.out.println("penalti berhasil ditepis");
                } else {
                    System.out.println("Anda Berhasil Mencetak Goal");
                }
                break;
            case "tengah atas":
            case "tengah bawah":
            case "tengah":
                if (gerakanKiper.equals("tengah atas") || gerakanKiper.equals("tengah bawah") || gerakanKiper.equals("tengah")) {
                    System.out.println("penalti berhasil ditepis");
                } else {
                    System.out.println("Anda Berhasil Mencetak Goal");
                }
                break;
            default:
                System.out.println("Tendanganya tidak valid");
        }
    }
}

class Penendang implements sepakbola {
    public String GerakanKiper() {
        return "kanan";
    }

    public String ArahBola() {
        return "pojok kiri bawah";
    }

    public String KakiPenendang() {
        return "kanan";
    }
}
