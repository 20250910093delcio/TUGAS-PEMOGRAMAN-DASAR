import java.util.Scanner;

public class POST03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("=== PROGRAM NILAI AKHIR MAHASISWA ===");
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = Integer.parseInt(input.nextLine());
   
        String[][] data = new String[jumlah][5]; 
        double totalNilai = 0;
        
        for (int i = 0; i < jumlah; i++) {
            System.out.println("\n Data Mahasiswa ke-" + (i+1) + " ");
            
            System.out.print("Nama: ");
            data[i][0] = input.nextLine();
            
            System.out.print("Nilai Tugas: ");
            double tugas = Double.parseDouble(input.nextLine());
            data[i][1] = String.valueOf(tugas);
            
            System.out.print("Nilai UTS: ");
            double uts = Double.parseDouble(input.nextLine());
            data[i][2] = String.valueOf(uts);
            
            System.out.print("Nilai UAS: ");
            double uas = Double.parseDouble(input.nextLine());
            data[i][3] = String.valueOf(uas);
            
            double nilaiAkhir = (6 * tugas + 2 * uts + 2 * uas) / 10;
            data[i][4] = String.format("%.2f", nilaiAkhir);
            totalNilai += nilaiAkhir;
        }
        
       
        System.out.println("  DAFTAR NILAI MAHASISWA ");
        System.out.printf("%-4s | %-15s | %-5s | %-5s | %-5s | %-10s%n",
                "No", "Nama", "Tugas", "UTS", "UAS", "Nilai Akhir");
        System.out.println("------------------------------------------------");
        
        for (int i = 0; i < jumlah; i++) {
            System.out.printf("%-4d | %-15s | %-5s | %-5s | %-5s | %-10s%n",
                    (i+1), data[i][0], data[i][1], data[i][2], data[i][3], data[i][4]);
        }
        
        double rataRata = totalNilai / jumlah;
        System.out.println("------------------------------------------------");
        System.out.printf("Nilai Rata-rata Kelas: %.2f%n", rataRata);
        input.close();
    }
}
