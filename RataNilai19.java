import java.util.Scanner;

public class RataNilai19 {

    public static void main(String[] args) {

        //deklarasi inputan
        Scanner sc = new Scanner(System.in);

        // deklarasi variabel
        float nilai, rataNilai;

        // judul
        System.out.println("==============================");
        System.out.println("=========== Siakad ===========");
        System.out.println("==============================");

        // Logic
        // Perulangan untuk tiap mahasiswa 
        int i = 1;
        while (i <= 5) {
            int totalNilai = 0;

            System.out.println("Input nilai mahasiswa ke-" + i);

            // Perulangan untuk nilai tiap mahasiswa
            for (int j = 1; j <= 5; j++) {
                System.out.print("Nilai ke-" + j + " = ");
                int nilaiMhs = sc.nextInt();
                totalNilai += nilaiMhs;
        }
        // Menghitung rata - rata nilai untuk mahasiswa 
        rataNilai=totalNilai/5;

        // Output
        System.out.print("Rata-rata Nilai Mahasiswa ke-" + i + " adalah " + rataNilai);
        System.out.println();

        //tambah nilai i untuk mahasiswa ke-i
        i++;

        }
    }
          
}

