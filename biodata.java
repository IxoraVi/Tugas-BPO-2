public class biodata{
    public String nama, nim, jurusan, fakultas;

  biodata(){
	nama = "Amnah Kurnia";
	nim = "13020180122";
	jurusan = "Teknik Informatika";
	fakultas = "Fakultas Ilmu Komputer";
    }

    public static void main(String[] args) {
        biodata mahasiswa = new biodata();
        System.out.println("Nama 		: " + mahasiswa.nama);
        System.out.println("Stambuk 	: " + mahasiswa.nim);
	System.out.println("Jurusan 	: " + mahasiswa.jurusan);
	System.out.println("Fakultas 	: " + mahasiswa.fakultas);
    }
}
