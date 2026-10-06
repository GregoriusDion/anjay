public class Produk {
    // Semua atribut PUBLIC (sesuai soal 3a)
    public String kode;
    public String nama;
    public double harga;
    public int stok;

    // Constructor 1: tanpa stok (stok otomatis 0)
    public Produk(String kode, String nama, double harga) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.stok = 0;
    }

    // Constructor 2: lengkap dengan stok
    public Produk(String kode, String nama, double harga, int stok) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public void tampilkanInfo() {
        System.out.println("Kode  : " + kode);
        System.out.println("Nama  : " + nama);
        System.out.println("Harga : Rp" + harga);
        System.out.println("Stok  : " + stok);
    }

    public void tambahStok(int jumlah) {
        stok = stok + jumlah;
    }

    public void kurangiStok(int jumlah) {
        stok = stok - jumlah;
    }
}
