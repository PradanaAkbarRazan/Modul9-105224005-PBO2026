public class RumahSakit {
    private String namaRS;
    private Ruangan[] daftarRuangan; 
    private Dokter[] daftarDokter;   
    private int jumlahDokter = 0;

    public RumahSakit(String namaRS) {
        this.namaRS = namaRS;
        this.daftarRuangan = new Ruangan[2];
        this.daftarRuangan[0] = new Ruangan("R-01", 10);
        this.daftarRuangan[1] = new Ruangan("R-02", 15);
        this.daftarDokter = new Dokter[5];
    }

    public void tambahDokter(Dokter dokter) {
        if (jumlahDokter < daftarDokter.length) {
            daftarDokter[jumlahDokter] = dokter;
            jumlahDokter++;
        } else {
            System.out.println("Maaf, kuota dokter di RS ini sudah penuh!");
        }
    }

    public void cetakDaftarRuangan() {
        System.out.println("Daftar Ruangan di " + namaRS + ":");
        for (Ruangan r : daftarRuangan) {
            if (r != null) r.infoRuangan();
        }
    }

    public void cetakDaftarDokter() {
        System.out.println("Daftar Dokter Bertugas di " + namaRS + ":");
        if (jumlahDokter == 0) {
            System.out.println("- Tidak ada dokter bertugas.");
        }
        for (int i = 0; i < jumlahDokter; i++) {
            System.out.println("- " + daftarDokter[i].getNama() + " (" + daftarDokter[i].getSpesialisasi() + ")");
        }
    }
}