import java.util.Scanner;

public class tugas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("---HITUNG NILAI AKHIR MATA KULIAH---");
        System.out.println("Mata Kuliah: Pemrograman Dasar");
        System.out.print("Masukkan Nilai MP    : ");
        double mp = input.nextDouble();
        
        System.out.print("Masukkan Nilai UTS   : ");
        double uts = input.nextDouble();
        
        System.out.print("Masukkan Nilai UAS   : ");
        double uas = input.nextDouble();
      
        double nilaiAkhir = (6 * mp + 2 * uts + 2 * uas) / 10;
        
        System.out.println("\n ---HASIL PERHITUNGAN ---");
        System.out.println("Nilai MP     : " + mp);
        System.out.println("Nilai UTS    : " + uts);
        System.out.println("Nilai UAS    : " + uas);
        System.out.println("Nilai Akhir  : " + nilaiAkhir);

        String keterangan;
        if (nilaiAkhir >= 85) keterangan = "A";
        else if (nilaiAkhir >= 75) keterangan = "B";
        else if (nilaiAkhir >= 65) keterangan = "C";
        else if (nilaiAkhir >= 55) keterangan = "D";
        else keterangan = "E";
        
        System.out.println("Nilai Huruf  : " + keterangan);
        System.out.println("=============================");
        
        input.close();
    }
}
