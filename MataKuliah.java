public class MataKuliah extends ProdiTi {
    private String nama;
    private String sks;

    public MataKuliah(String nama, String sks, String namaProdi) {
        super(namaProdi);
        this.nama = nama;
        this.sks = sks;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getSks() {
        return sks;
    }

    public void setSks(String kode) {
        this.sks = kode;
    }

    // Metode untuk menampilkan informasi Mata Kuliah
    public void tampilkanInfo() {
        System.out.println("\nData Mata Kuliah:");
        System.out.println("Nama: " + nama);
        System.out.println("SKS: " + sks);
        System.out.println("Program Studi: " + getNamaProdi());
    }
}
