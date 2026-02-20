public class MataKuliah08 {

    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    MataKuliah08() { }

    MataKuliah08(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    void tampilInformasi() {
        System.out.println("Kode MK     : " + kodeMK);
        System.out.println("Nama MK     : " + nama);
        System.out.println("SKS         : " + sks);
        System.out.println("Jumlah Jam  : " + jumlahJam);
    }

    void ubahSKS(int sksBaru) {
        sks = sksBaru;
    }

    void tambahJam(int jam) {
        jumlahJam += jam;
    }

    void kurangiJam(int jam) {
        if (jumlahJam >= jam) {
            jumlahJam -= jam;
            System.out.println("Jumlah jam setelah dikurangi: " + jumlahJam);
        } else {
            System.out.println("Pengurangan tidak dapat dilakukan. Jam tidak mencukupi.");
        }
    }
}
