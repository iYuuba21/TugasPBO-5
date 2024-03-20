import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input data Program Studi
        System.out.println("Masukkan data Program Studi:");
        System.out.print("Nama Program Studi: ");
        String namaProdi = scanner.nextLine();

        // Input data Mahasiswa
        System.out.println("\nMasukkan data Mahasiswa:");
        System.out.print("Nama Mahasiswa: ");
        String namaMahasiswa = scanner.nextLine();
        System.out.print("NIM Mahasiswa: ");
        String nimMahasiswa = scanner.nextLine();
        Mahasiswa mahasiswa = new Mahasiswa(namaMahasiswa, nimMahasiswa, namaProdi);

        // Input data Dosen
        System.out.println("\nMasukkan data Dosen:");
        System.out.print("Nama Dosen: ");
        String namaDosen = scanner.nextLine();
        System.out.print("NIDN Dosen: ");
        String nidnDosen = scanner.nextLine();
        Dosen dosen = new Dosen(namaDosen, nidnDosen, namaProdi);

        // Input data Mata Kuliah
        System.out.println("\nMasukkan data Mata Kuliah:");
        System.out.print("Nama Mata Kuliah: ");
        String namaMataKuliah = scanner.nextLine();
        System.out.print(" Jumlah SKS: ");
        String sksMataKuliah = scanner.nextLine();
        MataKuliah mataKuliah = new MataKuliah(namaMataKuliah, sksMataKuliah, namaProdi);

        // Tampilkan hasil input
        mahasiswa.tampilkanInfo();
        dosen.tampilkanInfo();
        mataKuliah.tampilkanInfo();

        // Tutup scanner
        scanner.close();
    }
}
