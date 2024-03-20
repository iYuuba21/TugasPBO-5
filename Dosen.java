public class Dosen extends ProdiTi {
    private String nama;
    private String nidn;

    public Dosen(String nama, String nidn, String namaProdi) {
        super(namaProdi);
        this.nama = nama;
        this.nidn = nidn;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNidn() {
        return nidn;
    }

    public void setNidn(String nidn) {
        this.nidn = nidn;
    }

    // Metode untuk menampilkan informasi Dosen
    public void tampilkanInfo() {
        System.out.println("\nData Dosen:");
        System.out.println("Nama: " + nama);
        System.out.println("NIDN: " + nidn);
        System.out.println("Program Studi: " + getNamaProdi());
    }
}
