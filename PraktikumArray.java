import java.util.Scanner;
public class PraktikumArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Daftar mata kuliah
        String[] namaMK = {
            "Algoritma dan Struktur Data",
            "Praktikum Algoritma dan Struktur Data",
            "Basis Data",
            "Praktikum Basis Data",
            "Matematika Lanjut",
            "Kewarganegaraan",
            "Pengenalan Sistem Informasi",
            "Analisis Proses Bisnis",
            "Sistem Informasi"
        };

        int[] sks = {3, 1, 3, 1, 3, 2, 2, 3, 3};
        int jumlah = namaMK.length;

        double[] nilaiAngka = new double[jumlah];
        String[] nilaiHuruf = new String[jumlah];
        double[] nilaiSetara = new double[jumlah];

        double totalNilaiSetara = 0;
        int totalSks = 0;

        for (int i = 0; i <jumlah; i++) {
            System.out.print("Masukkan nilai angka untuk " + namaMK[i] + ": ");
            nilaiAngka[i] = input.nextDouble();


            //validasi nilai
            if (nilaiAngka[i] < 0 || nilaiAngka[i] > 100) {
                System.out.println("Nilai tidak valid. Masukkan nilai antara 0 dan 100.");
                return;
            }

            // Konversi nilai angka ke nilai huruf
            if (nilaiAngka[i] > 80) {
                nilaiHuruf[i] = "A";
                nilaiSetara[i] = 4.0;
            } else if (nilaiAngka[i] > 73) {
                nilaiHuruf[i] = "B+";
                nilaiSetara[i] = 3.5;
            } else if (nilaiAngka[i] > 65) {
                nilaiHuruf[i] = "B";
                nilaiSetara[i] = 3.0;
            } else if (nilaiAngka[i] > 60) {
                nilaiHuruf[i] = "C+";
                nilaiSetara[i] = 2.5;
            } else if (nilaiAngka[i] > 50) {
                nilaiHuruf[i] = "C";
                nilaiSetara[i] = 2.0;
            } else if (nilaiAngka[i] > 39) {
                nilaiHuruf[i] = "D";
                nilaiSetara[i] = 1.0;
            } else {
                nilaiHuruf[i] = "E";
                nilaiSetara[i] = 0.0;
            }

            totalNilaiSetara += (nilaiSetara[i]*sks[i]);
            totalSks += sks[i];
        }

        double ip = totalNilaiSetara / totalSks;

        //output hasil
        System.out.println("\nHASIL PERHITUNGAN IP SEMESTER");
        System.out.println("==============================================================================");
        System.out.printf("%-40s %-12s %-12s %-12s\n",
                "Mata Kuliah", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        System.out.println("==============================================================================");

        for (int i = 0; i < jumlah; i++) {
            System.out.printf("%-42s %-12.2f %-12s %-12.2f\n",
                    namaMK[i], nilaiAngka[i], nilaiHuruf[i], nilaiSetara[i]);
        }
        System.out.print("==============================================================================");
        System.out.println("\nTotal SKS : " + totalSks);
        System.out.printf("IP Semester : %.2f\n", ip);
        
        input.close();
    }
}