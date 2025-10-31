# Laporan Praktikum Minggu 2
Topik: ["Class dan Object (Produk Pertanian")]

## Identitas
- Nama  : [TSAQIF NURFATHAN ARYADI]
- NIM   : [240202886]
- Kelas : [3IKRB]

---

## Tujuan

- Mahasiswa mampu **menjelaskan konsep class, object, atribut, dan method** dalam OOP.  
- Mahasiswa mampu **menerapkan access modifier dan enkapsulasi** dalam pembuatan class.  
- Mahasiswa mampu **mengimplementasikan class Produk pertanian** dengan atribut dan method yang sesuai.  
- Mahasiswa mampu **mendemonstrasikan instansiasi object** serta menampilkan data produk pertanian di console.  
- Mahasiswa mampu **menyusun laporan praktikum** dengan bukti kode, hasil eksekusi, dan analisis sederhana.  


---

## Dasar Teori
Class adalah blueprint atau cetak biru dari sebuah objek. Objek merupakan instansiasi dari class yang berisi atribut (data) dan method (perilaku). Dalam OOP, enkapsulasi dilakukan dengan menyembunyikan data menggunakan access modifier (public, private, protected) serta menyediakan akses melalui getter dan setter.  

Dalam konteks Agri-POS, produk pertanian seperti benih, pupuk, dan alat pertanian dapat direpresentasikan sebagai objek yang memiliki atribut nama, harga, dan stok. Dengan menggunakan class, setiap produk dapat dibuat, dikelola, dan dimanipulasi secara lebih terstruktur

---

## Langkah Praktikum
1. **Membuat Class Produk**
   - Buat file `Produk.java` pada package `model`.
   - Tambahkan atribut: `kode`, `nama`, `harga`, dan `stok`.
   - Gunakan enkapsulasi dengan menjadikan atribut bersifat private dan membuat getter serta setter untuk masing-masing atribut.  

2. **Membuat Class CreditBy**
   - Buat file `CreditBy.java` pada package `util`.
   - Isi class dengan method statis untuk menampilkan identitas mahasiswa di akhir output: `credit by: <NIM> - <Nama>`.

3. **Membuat Objek Produk dan Menampilkan Credit**
   - Buat file `MainProduk.java`.
   - Instansiasi minimal tiga objek produk, misalnya "Benih Padi", "Pupuk Urea", dan satu produk alat pertanian.
   - Tampilkan informasi produk melalui method getter.  
   - Panggil `CreditBy.print("<NIM>", "<Nama>")` di akhir `main` untuk menampilkan identitas.

4. **Commit dan Push**
   - Commit dengan pesan: `week2-class-object`.
---

## Kode Program


public class MainProduk {
    public static void main(String[] args) {
        Produk p1 = new Produk("BNH-001", "Benih Padi IR64", 25000, 100);
        Produk p2 = new Produk("PPK-101", "Pupuk Urea 50kg", 350000, 40);
        Produk p3 = new Produk("ALT-501", "Cangkul Baja", 90000, 15);

        System.out.println("Kode: " + p1.getKode() + ", Nama: " + p1.getNama() + ", Harga: " + p1.getHarga() + ", Stok: " + p1.getStok());
        System.out.println("Kode: " + p2.getKode() + ", Nama: " + p2.getNama() + ", Harga: " + p2.getHarga() + ", Stok: " + p2.getStok());
        System.out.println("Kode: " + p3.getKode() + ", Nama: " + p3.getNama() + ", Harga: " + p3.getHarga() + ", Stok: " + p3.getStok());
 
        p1.tambahStok(13);
        p2.kurangiStok(2);
        p3.kurangiStok(10);

        System.out.println("\n=== update stok ===");
        System.out.println("Kode: " + p1.getKode() + ", Nama: " + p1.getNama() + ", Harga: " + p1.getHarga() + ", Stok: " + p1.getStok());
        System.out.println("Kode: " + p2.getKode() + ", Nama: " + p2.getNama() + ", Harga: " + p2.getHarga() + ", Stok: " + p2.getStok());
        System.out.println("Kode: " + p3.getKode() + ", Nama: " + p3.getNama() + ", Harga: " + p3.getHarga() + ", Stok: " + p3.getStok());
        
        // Tampilkan identitas mahasiswa
        CreditBy.print("240202886", "Tsaqif Nurfathan Aryadi");
    }
}

public class Produk {
    private String kode;
    private String nama;
    private double harga;
    private int stok;

    public Produk(String kode, String nama, double harga, int stok) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }
getKode() { return kode; }
    public void setKode(String kode) { this.kode = kode; }

    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }

    public double getHarga() { return harga; }
    public void setHarga(double harga) { this.harga = harga; }

    public int getStok() { return stok; }
    public void setStok(int stok) { this.stok = stok; }

    public void tambahStok(int jumlah) {
        this.stok += jumlah;
    }

    public void kurangiStok(int jumlah) {
        if (this.stok >= jumlah) {
            this.stok -= jumlah;
        } else {
            System.out.println("Stok tidak mencukupi!");
        }
    }
}
    public String 


public class Credit {
    public static void print(String nim, String nama) {
        System.out.println("\ncredit by: " + nim + " - " + nama);
    }
}


---

## Hasil Eksekusi
(Sertakan screenshot hasil eksekusi program.  
![Screenshot hasil](CLASS OBJECT/.PNG)
)
---

## Analisis

Kode di atas terdiri dari dua kelas, yaitu Produk dan Credit. Kelas Produk digunakan untuk merepresentasikan data produk dengan atribut kode, nama, harga, dan stok. Melalui method tambahStok() dan kurangiStok(), program dapat menambah atau mengurangi jumlah stok dengan pengecekan agar stok tidak menjadi negatif. Sementara itu, kelas Credit hanya berfungsi menampilkan identitas pembuat program melalui method statis print(String nim, String nama).

Pendekatan minggu ini berbeda dengan minggu sebelumnya karena sudah menerapkan konsep OOP (Object-Oriented Programming). Jika sebelumnya fungsi dan data masih terpisah, kini logika dan data disatukan dalam satu kelas sehingga program menjadi lebih terstruktur dan mudah dikembangkan.

Kendala yang dihadapi antara lain kesalahan kecil seperti lupa menulis public pada method, kurung kurawal yang tidak seimbang, dan kesulitan memanggil method dari kelas lain. Semua masalah tersebut dapat diatasi dengan memperhatikan struktur kode, penggunaan akses modifier yang benar, serta memahami cara kerja method statis dan objek dalam Java.
---

## Kesimpulan

Kesimpulannya, program ini menerapkan konsep OOP untuk mengelola data produk secara terstruktur dan aman melalui kelas Produk dan Credit. Pendekatan ini membuat kode lebih rapi, mudah dikembangkan, dan efisien. Kendala kecil seperti kesalahan sintaks dapat diatasi dengan memahami dasar-dasar penulisan dan struktur Java.

---

## Quiz
(1. [Mengapa atribut sebaiknya dideklarasikan sebagai private dalam class?]  

   Jawaban: Atribut sebaiknya dideklarasikan sebagai private agar tidak bisa diakses atau diubah secara langsung dari luar kelas. Hal ini merupakan bagian dari konsep enkapsulasi dalam OOP, yang bertujuan untuk melindungi data dan mengontrol akses terhadapnya. Dengan membuat atribut private, perubahan data hanya dapat dilakukan melalui method getter dan setter, sehingga nilai atribut bisa divalidasi atau dibatasi sesuai aturan yang ditentukan. Cara ini mencegah kesalahan dan menjaga konsistensi data dalam program.

2. [Apa fungsi getter dan setter dalam enkapsulasi?]  

   Jawaban: Fungsi getter dan setter dalam enkapsulasi adalah untuk mengatur akses terhadap atribut yang bersifat private. Getter digunakan untuk mengambil atau membaca nilai atribut tanpa mengizinkan perubahan langsung dari luar kelas, sedangkan setter digunakan untuk mengubah atau menulis nilai atribut dengan cara yang terkontrol. Melalui getter dan setter, data dalam objek tetap aman dan konsisten karena setiap akses atau perubahan nilai atribut harus melalui mekanisme yang telah diatur di dalam kelas.

3. [Bagaimana cara class `Produk` mendukung pengembangan aplikasi POS yang lebih kompleks?] 

   Jawaban: Kelas Produk mendukung pengembangan aplikasi POS (Point of Sale) yang lebih kompleks karena berfungsi sebagai struktur dasar untuk menyimpan dan mengelola data produk secara terorganisir. Dengan adanya atribut seperti kode, nama, harga, dan stok, serta method untuk menambah dan mengurangi stok, kelas ini dapat dengan mudah diintegrasikan dengan fitur lain seperti transaksi penjualan, laporan inventori, atau manajemen diskon. Selain itu, penggunaan enkapsulasi melalui getter dan setter memastikan data produk tetap aman dan konsisten saat digunakan oleh berbagai modul dalam aplikasi. Dengan desain berbasis OOP, kelas Produk juga mudah dikembangkan — misalnya, bisa diturunkan menjadi kelas lain seperti ProdukMakanan atau ProdukElektronik tanpa mengubah struktur utama program. )
