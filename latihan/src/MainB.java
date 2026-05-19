public class MainB {
    public static void main(String[] args) {

        Dokter dok1 = new Dokter("Dr. Ucup", "Spesialis Hati");
        Dokter dok2 = new Dokter("Dr. Gio", "Spesialis Otak");
        Pasien pas1 = new Pasien("Riqzi", 26);
        Pasien pas2 = new Pasien("Razqa", 30);
        System.out.println("Dokter & Pasien berhasil didaftarkan di sistem pusat.\n");
        dok1.periksaPasien(pas2);
        System.out.println();

        System.out.println("PENDIRIAN RUMAH SAKIT");
        RumahSakit rs = new RumahSakit("RS Sehat Selalu");
        
        rs.tambahDokter(dok1);
        rs.tambahDokter(dok2);
        System.out.println("Dokter berhasil ditugaskan ke RS Sehat Selalu.\n");

        System.out.println("STATUS INTERNAL RUMAH SAKIT");
        rs.cetakDaftarRuangan();
        rs.cetakDaftarDokter();
        System.out.println();

        System.out.println("PENGUJIAN AKHIR");
        rs = null; 
        System.out.println("Objek RS Sehat Selalu telah dihancurkan dari memori sistem.\n");

        System.out.println(" Membuktikan entitas yang masih eksis");
        System.out.println("Nama Dokter 1: " + dok1.getNama() + " (" + dok1.getSpesialisasi() + ")");
        System.out.println("Nama Dokter 2: " + dok2.getNama() + " (" + dok2.getSpesialisasi() + ")");
        System.out.println("Nama Pasien 1: " + pas1.getNama());
    } 

    /*1. Entitas yang hilang:
    - Objek RumahSakit dan Ruangan. Karena hubungannya komposisi. Ruangan dibuat di dalam 
      RumahSakit tanpa variabel mandiri di Main. Jadi, saat RS dihancurkan, seluruh 
      ruangan di dalamnya ikut musnah.

    2. Entitas yang tetap ada:
    - Objek Dokter dan Pasien. Hubungan RumahSakit dan Dokter adalah agregasi, sedangkan Dokter 
      dan Pasien adalah asosiasi. Karena objek dokter dan pasien dibuat di sistem pusat (Main Class)
      maka tetap hidup di memori walau RS hancur. */ 
}