package MOD_3A;

import java.util.Scanner;

public class MOD_3D {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        String mahasiswa[] [];
        int jumlah;

        System.out.println("DATA MAHASISWA\nSISTEM INFORMASI\nFKOM-UNIKU  ");
        System.out.print("Jumlah orang : ");
        jumlah = Integer.parseInt(input.nextLine());
        mahasiswa = new String[jumlah][6];
        for (int i = 0; i < jumlah; i++){
            System.out.println("Data mahasiswa ke-" + (i + 1));
            System.out.print("NIK : ");
            mahasiswa[i][0] = input.nextLine();
            System.out.print("Nama : ");
            mahasiswa[i][1] = input.nextLine();
            System.out.print("Nilai : ");
            mahasiswa[i][2] = input.nextLine();
        }


               System.out.print("\nNo. \tNIK\tNAMA\tNILAI\n");
                 for(int i = 0; i < jumlah; i++){
                System.out.print((i + 1) + "\t" + mahasiswa[i] [0] + "\t" + mahasiswa[i] [1] + "\t" + mahasiswa[i] [2] + "\n");
            }




    }
}
