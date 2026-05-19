public class Dokter {
    private String nama;
    private String spesialisasi;

    public Dokter(String nama, String spesialisasi) {
        this.nama = nama;
        this.spesialisasi = spesialisasi;
    }

    public String getNama() {
        return nama;
    }

    public String getSpesialisasi() {
        return spesialisasi;
    }

    public void periksaPasien(Pasien pasien) {
        System.out.println("Rekam Jejak Pemeriksaan pasien");
        System.out.println("Dokter yang bertugas : " + this.nama + " (" + this.spesialisasi + ")");
        System.out.println("Nama Pasien          : " + pasien.getNama());
        System.out.println("Umur Pasien          : " + pasien.getUmur() + " tahun");
        System.out.println("-------------------------------");
    }

}
