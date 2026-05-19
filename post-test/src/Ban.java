class Ban {
    private String merk;
    private int ukuranRing;

    public Ban(String merk, int ukuranRing) {
        this.merk = merk;
        this.ukuranRing = ukuranRing;
    }

    public void tampilkanDetail() {
        System.out.println("   - Ban Merk: " + merk + ", Ring: " + ukuranRing);
    }
}