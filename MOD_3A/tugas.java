public class tugas {
    public static void main(String[] args) {
       
        String[][] karyawan = {
            {"1", "RADIT", "DIREKTUR", "10000000", "5000000"},
            {"2", "JANI", "MANAGER", "8000000", "3500000"},
            {"3", "BUDI", "STAF", "5000000", "1500000"} 
        };

        System.out.println(" Tabel 3.1 Data Gaji Karyawan");
        System.out.println(" (sumber: dokumentasi penyusun, 2026)");
        System.out.println("================================================================");
        System.out.printf("%-3s %-12s %-12s %-12s %-12s%n",
                "NO", "NAMA", "JABATAN", "GAPOK", "TUNJANGAN");
        System.out.println("================================================================");

        for (String[] data : karyawan) {
            String no = data[0];
            String nama = data[1];
            String jabatan = data[2];
            String gapok = formatAngka(data[3]);
            String tunjangan = formatAngka(data[4]);

            System.out.printf("%-3s %-12s %-12s %-12s %-12s%n",
                    no, nama, jabatan, gapok, tunjangan);
        }
        System.out.println("================================================================");
    }

   
    private static String formatAngka(String angka) {
        return String.format("%,d", Long.parseLong(angka)).replace(',', '.');
    }
}

