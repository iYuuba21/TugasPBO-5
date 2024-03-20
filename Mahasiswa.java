public class Mahasiswa extends ProdiTi {
    private String nama;
    private String nim;

    public Mahasiswa(String nama, String nim, String namaProdi) {
        super(namaProdi);
        this.nama = nama;
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    // Metode untuk menampilkan informasi Mahasiswa
    public void tampilkanInfo() {
        System.out.println("\nData Mahasiswa:");
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Program Studi: " + getNamaProdi());
    }
}
