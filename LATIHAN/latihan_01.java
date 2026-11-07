import java.util.Scanner;

public class latihan_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = input.nextInt();
        
        String[] nim = new String[jumlah];
        String[] nama = new String[jumlah];
        int[] uts = new int[jumlah];
        int[] uas = new int[jumlah];
        double[] nilaiAkhir = new double[jumlah];
        String[] index = new String[jumlah];
        
        for (int i = 0; i < jumlah; i++) {
            System.out.println("\n=== Data Mahasiswa ke-" + (i + 1) + " ===");
            System.out.print("NIM  : ");
            nim[i] = input.next();
            
            System.out.print("Nama : ");
            nama[i] = input.next();
            
            System.out.print("UTS  : ");
            uts[i] = input.nextInt();
            
            System.out.print("UAS  : ");
            uas[i] = input.nextInt();
            
            nilaiAkhir[i] = (uts[i] * 0.5) + (uas[i] * 0.5);
        
            if (nilaiAkhir[i] >= 80) {
                index[i] = "A";
            } else if (nilaiAkhir[i] >= 70) {
                index[i] = "B";
            } else if (nilaiAkhir[i] >= 60) {
                index[i] = "C";
            } else if (nilaiAkhir[i] >= 50) {
                index[i] = "D";
            } else {
                index[i] = "E";
            }
        }
        
        System.out.println("\n=============================================================");
        System.out.println("No\tNIM\tNama\tUTS\tUAS\tNilai Akhir\tIndex");
        System.out.println("=============================================================");
        
        for (int i = 0; i < jumlah; i++) {
            System.out.printf("%d\t%s\t%s\t%d\t%d\t%.1f\t\t%s\n",
                    (i + 1), nim[i], nama[i], uts[i], uas[i], nilaiAkhir[i], index[i]);
        }
        
        System.out.println("=============================================================");
        input.close();
    }
}

    

