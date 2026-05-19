public class Ruangan {
    private String noRegistrasi;
    private int kapasitasMaksimal;

    public Ruangan(String noRegistrasi, int kapasitasMaksimal) {
        this.noRegistrasi = noRegistrasi;
        this.kapasitasMaksimal = kapasitasMaksimal;
    }

    public void infoRuangan() {
        System.out.println("- Ruangan: " + noRegistrasi + " (Kapasitas Maksimal: " + kapasitasMaksimal + " orang)");
    }
}