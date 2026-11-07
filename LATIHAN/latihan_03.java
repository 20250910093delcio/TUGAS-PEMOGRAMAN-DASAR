public class latihan_03 {
    public static void main(String[] args) {
       String[][] daftarBarang = {
            {"A01", "Hardisk", "700000"},
            {"B02", "Monitor", "800000"},
            {"C02", "Mouse", "50000"}
        };

  
        String[][] dataTransaksi = {
            {"1", "Yuzkin", "A01", "2"},
            {"2", "Salsabila", "B02", "1"},
            {"3", "Eza", "C02", "3"} 
        };

        String garis = "================================================================";

        
        System.out.println(garis);
        System.out.printf("%-3s %-15s %-10s %-12s %-8s %-8s %-10s%n",
                "No", "Nama Pembeli", "KodeBarang", "NamaBarang", "Jumlah", "Harga", "Bayar");
        System.out.println(garis);

        for (String[] transaksi : dataTransaksi) {
            int nomor = Integer.parseInt(transaksi[0]);
            String namaPembeli = transaksi[1];
            String kodeCari = transaksi[2];
            int jumlah = Integer.parseInt(transaksi[3]);

            String namaBarang = "Tidak Ditemukan";
            int hargaSatuan = 0;
            for (String[] barang : daftarBarang) {
            if (barang[0].equals(kodeCari)) {
            namaBarang = barang[1];
            hargaSatuan = Integer.parseInt(barang[2]);
             break;
                }
            }

            int totalBayar = hargaSatuan * jumlah;

           
            System.out.printf("%-3d %-15s %-10s %-12s %-8d %-8d %-10d%n",
            nomor, namaPembeli, kodeCari, namaBarang, jumlah, hargaSatuan, totalBayar);
        }

        System.out.println(garis); 

    }
}
