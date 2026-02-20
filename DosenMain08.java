public class DosenMain08 {
    public static void main(String[] args) {

        Dosen08 d1 = new Dosen08();
        d1.idDosen = "D001";
        d1.nama = "Pak Yoga";
        d1.statusAktif = true;
        d1.tahunBergabung = 2018;
        d1.bidangKeahlian = "Algoritma";

        d1.tampilInformasi();
        System.out.println("Masa Kerja: " + d1.hitungMasaKerja(2026) + " tahun");
        d1.setStatusAktif(false);
        d1.ubahKeahlian("Struktur Data");

        Dosen08 d2 = new Dosen08("D002", "Bu Devi", true, 2020, "Matematika Lanjutan");

        d2.tampilInformasi();
        System.out.println("Masa Kerja: " + d2.hitungMasaKerja(2024) + " tahun");
        d2.setStatusAktif(false);
        d2.ubahKeahlian("Data Science");
    }
}
