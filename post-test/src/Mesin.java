class Mesin {
    private String nomorSeri;
    private int kapasitasCC;

    public Mesin(String nomorSeri, int kapasitasCC) {
        this.nomorSeri = nomorSeri;
        this.kapasitasCC = kapasitasCC;
    }

    public void tampilkanDetail() {
        System.out.println("   - Mesin No Seri: " + nomorSeri + ", Kapasitas: " + kapasitasCC + " CC");
    }
}