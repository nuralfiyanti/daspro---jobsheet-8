import java.util.Scanner;

public class AtletPorseni19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Deklarasi variabel
        int jmlAtlet = 5;
        String namaAtlet;

        // Judul 
        System.out.println("=================================");
        System.out.println("============ Porseni ============");
        System.out.println("=================================\n");
        
        // Input jumlah politeknik
        System.out.print("Masukkan jumlah politeknik yang mendaftar: ");
        int jmlPoliteknik = sc.nextInt();
        sc.nextLine(); 

        // Loop untuk setiap politeknik
        for (int i = 1; i <= jmlPoliteknik; i++) {
           
            System.out.println(" ");
            System.out.println("-----------------------------\n");

            System.out.println("Politeknik ke-" + i);

            // Loop untuk setiap cabang olahraga
            System.out.println("Cabor : Badminton");
            for (int j = 1; j <= jmlAtlet; j++) {
                System.out.print("Nama atlet " + j + "\t : ");
                namaAtlet = sc.nextLine();
            }

            System.out.println("Cabor : Tenis Meja");
            for (int j = 1; j <= jmlAtlet; j++) {
                System.out.print("Nama atlet " + j + "\t : ");
                namaAtlet = sc.nextLine();
            }

            System.out.println("Cabor : Basket");
            for (int j = 1; j <= jmlAtlet; j++) {
                System.out.print("Nama atlet " + j + "\t : ");
                namaAtlet = sc.nextLine();
            }

            System.out.println("Cabor : Bola Voly");
            for (int j = 1; j <= jmlAtlet; j++) {
                System.out.print("Nama atlet " + j + "\t : ");
                namaAtlet = sc.nextLine();
            }
        }
    }
}
