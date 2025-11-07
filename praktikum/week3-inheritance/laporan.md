# Laporan Praktikum Minggu 1 (sesuaikan minggu ke berapa?)
Topik: [Tuliskan judul topik, misalnya "Class dan Object"]

## Identitas
- Nama  : [Tsaqif Nurfathan Aryadi]
- NIM   : [240202886]
- Kelas : [3IKRB]

---

## Tujuan
- Mahasiswa mampu **menjelaskan konsep inheritance (pewarisan class)** dalam OOP.  
- Mahasiswa mampu **membuat superclass dan subclass** untuk produk pertanian.  
- Mahasiswa mampu **mendemonstrasikan hierarki class** melalui contoh kode.  
- Mahasiswa mampu **menggunakan `super` untuk memanggil konstruktor dan method parent class**.  
- Mahasiswa mampu **membuat laporan praktikum** yang menjelaskan perbedaan penggunaan inheritance dibanding class tunggal.  


---

## Dasar Teori
Inheritance adalah mekanisme dalam OOP yang memungkinkan suatu class mewarisi atribut dan method dari class lain.  
- **Superclass**: class induk yang mendefinisikan atribut umum.  
- **Subclass**: class turunan yang mewarisi atribut/method superclass, dan dapat menambahkan atribut/method baru.  
- `super` digunakan untuk memanggil konstruktor atau method superclass.  

Dalam konteks Agri-POS, kita dapat membuat class `Produk` sebagai superclass, kemudian `Benih`, `Pupuk`, dan `AlatPertanian` sebagai subclass. Hal ini membuat kode lebih reusable dan terstruktur.




---

## Langkah Praktikum
1. **Membuat Superclass Produk**  
   - Gunakan class `Produk` dari Bab 2 sebagai superclass.  

2. **Membuat Subclass**  
   - `Benih.java` → atribut tambahan: varietas.  
   - `Pupuk.java` → atribut tambahan: jenis pupuk (Urea, NPK, dll).  
   - `AlatPertanian.java` → atribut tambahan: material (baja, kayu, plastik).  

3. **Membuat Main Class**  
   - Instansiasi minimal satu objek dari tiap subclass.  
   - Tampilkan data produk dengan memanfaatkan inheritance.  

4. **Menambahkan CreditBy**  
   - Panggil class `CreditBy` untuk menampilkan identitas mahasiswa.  

5. **Commit dan Push**  
   - Commit dengan pesan: `week3-inheritance`.  


---

## Kode Program
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

    public String getKode() { return kode; }
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
        } 
        else {
            System.out.println("Stok tidak mencukupi!");
        }
    }
}

public class Pupuk extends Produk {
    private String jenis;

    public Pupuk(String kode, String nama, double harga, int stok, String jenis) {
        super(kode, nama, harga, stok);
        this.jenis = jenis;
    }

    public String getJenis() { return jenis; }
    public void setJenis(String jenis) { this.jenis = jenis; }

     public void deskripsi(){
        System.err.println("Nama Barang : "+ getNama() + "\n Jenis pupuk : " + getJenis() + "\n harga pupuk/kg :" + getHarga() + "\n");
    }
}

public class Benih extends Produk {
    private String varietas;

    public Benih(String kode, String nama, double harga, int stok, String varietas) {
        super(kode, nama, harga, stok);
        this.varietas = varietas;
    }

    public String getVarietas() { return varietas; }
    public void setVarietas(String varietas) { this.varietas = varietas; }

     public void deskripsi(){
        System.err.println("Nama Barang : "+ getNama() + "\n Varietas benih : " + getVarietas() + "\n harga benih/kg :" + getHarga() + "\n");
    }
}

public class AlatPertanian extends Produk {
    private String material;

    public AlatPertanian(String kode, String nama, double harga, int stok, String material) {
        super(kode, nama, harga, stok);
        this.material = material;
    }

    public String getMaterial() { return material; }
    public void setMaterial(String material) { this.material = material; }
    
    publiSystem.err.println("Nama Barang : "+ getNama() + "\n Material yang dipakai : " + getMaterial() + "\n harga cangkul :" + getHarga() + "\n");
    }
}c void deskripsi(){
        
---

## Hasil Eksekusi
(Sertakan screenshot hasil eksekusi program.  
![Screenshot hasil](screenshots/Mainheritance.png)
)
---

## Analisis
Program di atas menerapkan konsep pewarisan (inheritance) dalam pemrograman berorientasi objek (OOP) menggunakan Java. Kelas Produk berperan sebagai kelas induk yang menyimpan atribut umum seperti kode, nama, harga, dan stok, serta memiliki metode untuk menambah dan mengurangi stok. Dari kelas ini diturunkan tiga kelas, yaitu Pupuk, Benih, dan AlatPertanian, yang masing-masing menambahkan atribut khusus seperti jenis, varietas, dan material. Setiap subclass juga memiliki metode deskripsi() untuk menampilkan informasi produk dengan memanfaatkan data dari kelas induk.

Berbeda dengan minggu sebelumnya yang mungkin masih menggunakan satu kelas tanpa pewarisan, pendekatan minggu ini membuat kode lebih terstruktur, efisien, dan mudah dikembangkan karena memanfaatkan konsep inheritance dan polimorfisme. Kendala yang sempat muncul antara lain kesalahan sintaks pada kelas AlatPertanian dan belum adanya kelas Main untuk menjalankan program. Masalah tersebut dapat diatasi dengan memperbaiki penulisan kode dan menambahkan kelas Main agar program dapat dieksekusi dengan benar.
---

## Kesimpulan
Kesimpulannya, program ini berhasil menerapkan konsep pewarisan (inheritance) dan polimorfisme dalam OOP untuk membuat struktur kode yang lebih efisien dan mudah dikembangkan. Dengan menjadikan kelas Produk sebagai induk dan menurunkan kelas Pupuk, Benih, serta AlatPertanian, program mampu memisahkan atribut dan fungsi umum dari yang spesifik. Pendekatan ini mengurangi pengulangan kode dan memudahkan pengelolaan data berbagai jenis produk. Setelah perbaikan sintaks dan penambahan kelas Main, program dapat berjalan dengan baik serta menampilkan informasi produk secara terorganisir dan fleksibel.
---

## Quiz
1.Apa keuntungan menggunakan inheritance dibanding membuat class terpisah tanpa hubungan?
Keuntungan menggunakan inheritance dibanding membuat class terpisah tanpa hubungan adalah kode menjadi lebih efisien, terstruktur, dan mudah dikelola. Dengan pewarisan, atribut serta metode yang sama tidak perlu ditulis berulang di setiap kelas karena subclass dapat mewarisi dan memanfaatkan fitur dari superclass. Hal ini membuat pengembangan program lebih cepat serta memudahkan pemeliharaan jika terjadi perubahan pada atribut atau perilaku umum suatu produk.


2.Bagaimana cara subclass memanggil konstruktor superclass? 
Cara subclass memanggil konstruktor superclass adalah dengan menggunakan keyword super() yang diletakkan pada baris pertama di dalam konstruktor subclass. Contohnya, pada kelas Pupuk, pemanggilan super(kode, nama, harga, stok) digunakan untuk mengakses konstruktor dari kelas Produk, sehingga atribut umum dapat diinisialisasi tanpa perlu ditulis ulang di subclass.


3.Berikan contoh kasus di POS pertanian selain Benih, Pupuk, dan Alat Pertanian yang bisa dijadikan subclass.
Contoh kasus lain di POS pertanian yang bisa dijadikan subclass adalah Pestisida, yang memiliki atribut tambahan seperti bahanAktif dan jenisHama. Kelas ini dapat digunakan untuk menyimpan informasi tentang pestisida yang dijual di toko pertanian, seperti kandungan bahan aktif dan jenis hama yang dapat dikendalikan, sehingga sistem menjadi lebih lengkap dan realistis.

