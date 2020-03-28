import java.util.Scanner;
public class biodatainput {
    public static void main(String[] args) {
        // deklarasi variabel
        String nama, jurusan, fakultas, nim;

        // membuat scanner baru
        Scanner keyboard = new Scanner(System.in);

        // Tampilkan output ke user
        System.out.println("___ Biodata Mahasiswa ___");
        System.out.print("Nama : ");
        // menggunakan scanner dan menyimpan apa yang diketik di variabel nama
        nama = keyboard.nextLine();
        // Tampilkan output lagi
        System.out.print("Stambuk: ");
        // menggunakan scanner lagi
        nim = keyboard.nextLine();

        System.out.print("Jurusan: ");
        jurusan = keyboard.nextLine();

        System.out.print("Fakultas: ");
        fakultas = keyboard.nextLine();

        // Menampilkan apa yang sudah simpan di variabel
        System.out.println("--------------------");
        System.out.println("Nama		: " + nama);
        System.out.println("Stambuk		: " +nim);
        System.out.println("Jurusan		: " + jurusan);
        System.out.println("Fakultas	: " + fakultas);
    }
}