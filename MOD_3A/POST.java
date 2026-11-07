public class POST {
  public static void main(String[] args) {
        String[][] data = {
            {"1", "Yuzkin", "85", "78", "80"},
            {"2", "Salsabila", "90", "88", "92"},
            {"3", "Eza", "75", "82", "79"}
        };

        double totalNilaiAkhir = 0;
        int jumlahMahasiswa = data.length;

        System.out.println("================================================================");
        System.out.printf("%-3s %-15s %-6s %-6s %-6s %-12s%n",
                "No", "Nama", "Tugas", "UTS", "UAS", "Nilai Akhir");
        System.out.println("================================================================");

        for (String[] mhs : data) {
            int no = Integer.parseInt(mhs[0]);
            String nama = mhs[1];
            int tugas = Integer.parseInt(mhs[2]);
            int uts = Integer.parseInt(mhs[3]);
            int uas = Integer.parseInt(mhs[4]);

            // Hitung pakai rumus
            double nilaiAkhir = (6 * tugas + 2 * uts + 2 * uas) / 10.0;
            totalNilaiAkhir += nilaiAkhir;

            System.out.printf("%-3d %-15s %-6d %-6d %-6d %-12.2f%n",
                    no, nama, tugas, uts, uas, nilaiAkhir);
        }

        System.out.println("================================================================");
        double rataRata = totalNilaiAkhir / jumlahMahasiswa;
        System.out.printf("Rata-rata Nilai Akhir: %.2f%n", rataRata);
    }
}
    
    

