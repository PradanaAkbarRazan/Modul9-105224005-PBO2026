public class MainC {
    public static void main(String[] args) {
        // 4 ban mandiri
        Ban[] kumpulanBan = new Ban[4];
        kumpulanBan[0] = new Ban("Bridgestone", 17);
        kumpulanBan[1] = new Ban("Bridgestone", 17);
        kumpulanBan[2] = new Ban("Bridgestone", 17);
        kumpulanBan[3] = new Ban("Bridgestone", 17);

        // Pembentukan 1 unit mobil (Mesin otomatis di dalam)
        Mobil mobilKu = new Mobil("Toyota Corolla", "Merah Putih", "TRD-2026X", 2500);

        // Pemasangan ban oleh montir
        Montir montirUsup = new Montir("MTR-01", "Usup");
        mobilKu.pasangSetBan(kumpulanBan);

        // Proses inspeksi kelayakan oleh montir
        montirUsup.lakukanQualityControl(mobilKu);

        // Simulasi mobil gagal uji dan dihancurkan
        System.out.println("PROSES PENGHANCURAN MOBIL YANG GAGAL...");
        
        mobilKu = null; // Objek mobil diset null (dihancurkan)

        // PROSES PEMBUKTIAN MEMORI:
        System.out.println("\nBukti Status Objek di Memori:");

        // 1. Ban masih tetap aman dan bisa diakses
        System.out.println("Memeriksa Ban di gudang penyimpanan:");
        for (int i = 0; i < kumpulanBan.length; i++) {
            System.out.print("Ban ke-" + (i+1) + " masih ada -> ");
            kumpulanBan[i].tampilkanDetail();
        }

        // 2. Mobil dan Mesin telah musnah
        System.out.println("\nMemeriksa Mobil dan Mesin:");
        if (mobilKu == null) {
            // Karena variabel mobilKu sudah null, kita tidak bisa lagi memanggil mobilKu.mesin.
            // Otomatis hapus Mesin dari memori karena Mesin tidak direferensikan oleh variabel independen di luar Mobil.
            System.out.println("Objek 'mobilKu' bernilai null (hancur).");
            System.out.println("Entitas 'Mesin' otomatis musnah tanpa jejak karena ikut hancur bersama siklus hidup Mobil (Komposisi).");
        }
    }
}