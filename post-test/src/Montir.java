class Montir {
    private String idMontir;
    private String nama;

    public Montir(String idMontir, String nama) {
        this.idMontir = idMontir;
        this.nama = nama;
    }

    public void lakukanQualityControl(Mobil m) {
        System.out.println("\n[QC] Montir " + nama + " (ID: " + idMontir + ") sedang memeriksa mobil...");
        m.tampilkanSpesifikasi();
        System.out.println("[QC] Hasil: Mobil GAGAL UJI KELAYAKAN! Mobil harus dilebur/dihancurkan.\n");
    }
}