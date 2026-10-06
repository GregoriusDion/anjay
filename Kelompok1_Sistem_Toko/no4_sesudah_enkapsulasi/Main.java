public class Main {
    public static void main(String[] args) {
        // Object 1 pakai constructor 1, object 2 pakai constructor 2
        Produk p1 = new Produk("P001", "Beras 5kg", 65000);
        Produk p2 = new Produk("P002", "Minyak Goreng 2L", 38000, 20);

        // Akses dari luar class WAJIB lewat setter & getter
        p1.setStok(50);
        System.out.println("Stok " + p1.getNama() + " : " + p1.getStok());
        System.out.println("Harga " + p2.getNama() + " : Rp" + p2.getHarga());
        System.out.println();

        // Coba isi data ngawur -> ditolak oleh validasi setter
        System.out.println("Coba isi data tidak valid:");
        p2.setHarga(-1000);
        p2.setStok(-99);
        System.out.println();
        p2.tampilkanInfo();
        System.out.println();

        // Transaksi 1 (constructor 2)
        Transaksi t1 = new Transaksi("T001", "Budi", p1, 3);
        p1.kurangiStok(t1.getJumlah());
        t1.tampilkanStruk();
        System.out.println("Sisa stok " + p1.getNama() + " : " + p1.getStok());
        System.out.println();

        // Transaksi 2 (constructor 1, diisi pakai setter)
        Transaksi t2 = new Transaksi("T002", "Siti");
        t2.setProduk(p2);
        t2.setJumlah(0);   // ditolak
        t2.setJumlah(2);   // diterima
        t2.tampilkanStruk();
    }
}
