class Animal{
    String nama;

    public void makanan(){
        System.out.println("Aku Memakan Ikan dan ayam");
    }
    public void suara(){
        System.out.println("meow meow");
    }
}

class Kucing extends Animal{
    public void namanya(){
        System.out.println("Namanya Adalah : " + nama);
    }
}

class binatang{
    public static void main(String[] args) {
        Kucing kucing = new Kucing();
        kucing.nama = "test";
        kucing.namanya();

        kucing.makanan();
        kucing.suara();
    }
}