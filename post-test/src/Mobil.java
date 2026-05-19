class Mobil {
    private String merkMobil;
    private String warna;
    private Mesin mesin; // Komposisi
    private Ban[] daftarBan; // Agregasi

    // Mesin langsung diinstansiasi di dalam constructor (Komposisi)
    public Mobil(String merkMobil, String warna, String noSeriMesin, int ccMesin) {
        this.merkMobil = merkMobil;
        this.warna = warna;
        this.mesin = new Mesin(noSeriMesin, ccMesin); 
        this.daftarBan = new Ban[4]; 
    }

    // Method memasang array ban ke mobil
    public void pasangSetBan(Ban[] setBan) {
        if (setBan.length <= 4) {
            for (int i = 0; i < setBan.length; i++) {
                this.daftarBan[i] = setBan[i];
            }
            System.out.println(">> 4 Ban berhasil dipasang ke mobil.");
        } else {
            System.out.println(">> Gagal: Maksimal ban yang bisa dipasang adalah 4!");
        }
    }

    public void tampilkanSpesifikasi() {
        System.out.println("=== Spesifikasi Mobil ===");
        System.out.println("Merk Mobil: " + merkMobil);
        System.out.println("Warna: " + warna);
        
        if (this.mesin != null) {
            mesin.tampilkanDetail();
        } else {
            System.out.println("   - Mesin: [Telah Musnah]");
        }

        System.out.println("Daftar Ban:");
        for (Ban b : daftarBan) {
            if (b != null) {
                b.tampilkanDetail();
            } else {
                System.out.println("   - Ban: [Kosong]");
            }
        }
    }
}