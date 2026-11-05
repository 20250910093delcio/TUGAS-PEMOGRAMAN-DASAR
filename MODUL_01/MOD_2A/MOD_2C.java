import java.util.Scanner;

public class MOD_2C {
    public static void main(String[] args){
        try (Scanner input = new Scanner(System.in)) {
        String nama, mk, prodi;
        int nilai;
        System.out.print("siapa nama anda:");
        nama = input.nextLine();
        System.out.print("nama matkuliah:");
        mk = input.nextLine();
        System.out.print("Program studi:");
        prodi = input.nextLine();
        System.out.print("nilai anda:");
        nilai = input.nextInt();

        System.out.println("--HASIL INPUTAN--");
        System.out.println("nama\t : " + nama);
        System.out.println("matakulia\t : " + mk);
        System.out.println("program studi \t  : " + prodi);
        System.out.println("niali mk \t : " + nilai);
        input.close();
        }



        

    }
}
