import java.util.Scanner;

public class latihan_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       



        int[][] harga ={
            {20000,40000},
            {40000,60000}
        };


        System.out.println("=============================================================");
        System.out.printf("%-3s %-15s %-10s %-8s %-8s %-8s %-10s%n", "No", "Nama Pembeli", "Jurusan", "Kelas", "JumTiket", "Harga", "Bayar");
        System.out.println("=============================================================");

        String[][] dataContoh = {
            {"1", "Yuzkin", "Bandung", "Ekonomi", "2"},
            {"2", "Salsabila", "Jakarta", "Bisnis", "1"},
            {"3", "Eza", "Bandung", "Bisnis", "3"}
        };

            for (String[] data : dataContoh) {
            int nomor = Integer.parseInt(data[0]);
            String nama = data[1];
            String jurusan = data[2];
            String kelas = data[3];
            int jumlah = Integer.parseInt(data[4]);
            
            int idxJurusan = jurusan.equals("Bandung") ? 0 : 1;
        
            int idxKelas = kelas.equals("Ekonomi") ? 0 : 1;
            
     
            int hargaSatuan = harga[idxJurusan][idxKelas];
            int totalBayar = hargaSatuan * jumlah;
            
       
            System.out.printf("%-3d %-15s %-10s %-8s %-8d %-8d %-10d%n",
                    nomor, nama, jurusan, kelas, jumlah, hargaSatuan, totalBayar);
        }
        
        System.out.println("================================================================");
        input.close();
    }
}
