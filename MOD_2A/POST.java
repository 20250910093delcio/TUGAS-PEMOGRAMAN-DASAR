
import java.util.Scanner;

public class POST {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("    FORM IDENTITAS MAHASISWA");

        System.out.print("Nama Lengkap       : ");
        String nama = input.nextLine();

        System.out.print("NIM                : ");
        String nim = input.nextLine();

        System.out.print("Fakultas           : ");
        String fakultas = input.nextLine();

        System.out.print("Program Studi      : ");
        String prodi = input.nextLine();

        System.out.print("Tempat Lahir       : ");
        String tempatLahir = input.nextLine();

        System.out.print("Tanggal Lahir      : ");
        String tanggalLahir = input.nextLine();

        System.out.print("Jenis Kelamin      : ");
        String jenisKelamin = input.nextLine();

        System.out.print("Alamat              : ");
        String alamat = input.nextLine();


        System.out.println("       KARTU IDENTITAS MAHASISWA");
    
        System.out.println("Nama Lengkap  : " + nama);
        System.out.println("NIM           : " + nim);
        System.out.println("Fakultas      : " + fakultas);
        System.out.println("Program Studi : " + prodi);
        System.out.println("Tempat Lahir  : " + tempatLahir);
        System.out.println("Tanggal Lahir : " + tanggalLahir);
        System.out.println("Jenis Kelamin : " + jenisKelamin);
        System.out.println("Alamat        : " + alamat);

        System.out.println("  DATA BERHASIL DISIMPAN");
      

        input.close();
    }
}
