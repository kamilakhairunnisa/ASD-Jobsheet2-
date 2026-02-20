public class Mahasiswa08 {

    String nama;
    String nim;
    String kelas;
    double ipk;

    void tampilkanInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("Nim: " + nim);
        System.out.println("IPK: " + ipk);
        System.out.println("Kelas: " + kelas);

    }

    void ubahKelas(String KelasBaru) {
        kelas = KelasBaru;
    }

    void updateIpk(double ipkBaru) {
        if(ipkBaru>=0.0 && ipkBaru<4.0){
        ipk = ipkBaru;
    }   else{
        System.out.println("IPK Tidak valid. Harus antara 0.0 dan 4.0");
        }
    }

    String nilaiKerja() {
        if (ipk >= 3.5) {
            return"Kinerja sangat baik";
        } else if (ipk >= 3.0) {
            return"Kinerja Baik";
        } else if (ipk>= 2.0) {
            return "Kinerja Cukup";
        } else {
            return"Kinerja Kurang";
        }
    }
}
