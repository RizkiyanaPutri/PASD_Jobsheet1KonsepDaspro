import java.util.Scanner;
public class PraktikumPemilihan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double tugas, kuis, uts, uas, nilaiAkhir;
        String nilaiHuruf, keterangan;

        // Input nilai
        System.out.print("Masukkan nilai Tugas: ");
        tugas = sc.nextDouble();
        System.out.print("Masukkan nilai Kuis: ");
        kuis = sc.nextDouble();
        System.out.print("Masukkan nilai UTS: ");
        uts = sc.nextDouble();
        System.out.print("Masukkan nilai UAS: ");
        uas = sc.nextDouble();

        //validasi nilai
        if (tugas < 0 || tugas > 100 || kuis < 0 || kuis > 100 ||uts < 0 || uts > 100 ||
            uas < 0 || uas > 100) 
{
            System.out.println("Nilai tidak valid!");
            return;
        }

        // hitung nilai akhir
        nilaiAkhir = (0.2 * tugas) + (0.2 * kuis) + (0.3 * uts) + (0.3 * uas);

        // konversi nilai huruf
        if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            nilaiHuruf = "A";
        }else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
            nilaiHuruf = "B+";
        } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
            nilaiHuruf = "B";
        } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
            nilaiHuruf = "C+";
        }  else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
            nilaiHuruf = "C";
        } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
            nilaiHuruf = "D";
        } else {
            nilaiHuruf = "E";
        }

        // LULUS atau TIDAK LULUS
        if (nilaiHuruf.equals("A") || nilaiHuruf.equals("B+") ||
            nilaiHuruf.equals("B") || nilaiHuruf.equals("C+") ||
            nilaiHuruf.equals("C")) {

            keterangan = "Selamat Anda LULUS";
        } else {
            keterangan = "TIDAK LULUS";
        }

        // Output hasil
        System.out.println("==============================");
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");
        System.out.println("Nilai Akhir: " + nilaiAkhir);
        System.out.println("Nilai Huruf: " + nilaiHuruf);
        System.out.println("==============================");
        System.out.println(keterangan);
        sc.close();
    }
}
