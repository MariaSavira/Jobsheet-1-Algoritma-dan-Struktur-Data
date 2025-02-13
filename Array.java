import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float[] nilai = new float[8];
        int total;

        System.out.println("Program Menghitung IP Semester");
        System.out.println("==============================\n");

        for (int i = 0; i < nilai.length ; i++){
            do {
                if (i == 0){
                    
                }
                System.out.print("Masukkan nilai MK Pancasila : ");
                nilai[i] = scan.nextFloat();
                if (nilai[i] < 0 || nilai[i] > 100){
                    System.out.println("Mohon isi dengan benar (0-100).");
                }
            } while (nilai[i] < 0 || nilai[i] > 100);
        }
        System.out.println("Masukkan nilai MK Pancasila : ");

    }
}
