public class MataKuliahMain08 {
    public static void main(String[] args) {

        MataKuliah08 mk1 = new MataKuliah08();
        mk1.kodeMK = "ASD08";
        mk1.nama = "Algoritma dan Struktur Data";
        mk1.sks = 3;
        mk1.jumlahJam = 6;

        mk1.tampilInformasi();
        mk1.ubahSKS(4);
        mk1.tambahJam(2);
        mk1.kurangiJam(3);
        
        MataKuliah08 mk2 = new MataKuliah08("BSD08", "Basis Data", 2, 4);

        mk2.tampilInformasi();
        mk2.tambahJam(1);
        mk2.kurangiJam(10); 
    }
}
