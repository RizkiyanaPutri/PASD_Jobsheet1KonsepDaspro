import java.util.Scanner;

public class TugasNo2 {
     static Scanner input = new Scanner(System.in);

    // Input data jadwal
    public static void inputJadwal(String[][] jadwal, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("\nJadwal ke-" + (i + 1));

            System.out.print("Nama Mata Kuliah : ");
            jadwal[i][0] = input.nextLine();

            System.out.print("Ruang            : ");
            jadwal[i][1] = input.nextLine();

            System.out.print("Hari             : ");
            jadwal[i][2] = input.nextLine();

            System.out.print("Jam              : ");
            jadwal[i][3] = input.nextLine();
        }
    }

    // Tampilkan semua jadwal
    public static void tampilSemua(String[][] jadwal, int n) {
        System.out.println("\nDAFTAR JADWAL KULIAH");
        System.out.printf("%-30s %-15s %-15s %-15s\n",
                "Mata Kuliah", "Ruang", "Hari", "Jam");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-30s %-15s %-15s %-15s\n",
                    jadwal[i][0], jadwal[i][1],
                    jadwal[i][2], jadwal[i][3]);
        }
    }

    // Cari berdasarkan hari
    public static void cariHari(String[][] jadwal, int n) {
        System.out.print("\nMasukkan hari: ");
        String hari = input.nextLine();

        boolean ditemukan = false;

        for (int i = 0; i < n; i++) {
            if (jadwal[i][2].equalsIgnoreCase(hari)) {
                System.out.printf("%-30s %-15s %-15s %-15s\n",
                        jadwal[i][0], jadwal[i][1],
                        jadwal[i][2], jadwal[i][3]);
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Tidak ada jadwal pada hari tersebut.");
        }
    }

    // Cari berdasarkan nama matkul
    public static void cariMK(String[][] jadwal, int n) {
        System.out.print("\nMasukkan nama mata kuliah: ");
        String mk = input.nextLine();

        boolean ditemukan = false;

        for (int i = 0; i < n; i++) {
            if (jadwal[i][0].equalsIgnoreCase(mk)) {
                System.out.printf("%-30s %-15s %-15s %-15s\n",
                        jadwal[i][0], jadwal[i][1],
                        jadwal[i][2], jadwal[i][3]);
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Mata kuliah tidak ditemukan.");
        }
    }

    public static void main(String[] args) {

        System.out.print("Masukkan jumlah jadwal: ");
        int n = Integer.parseInt(input.nextLine());

        String[][] jadwal = new String[n][4];

        inputJadwal(jadwal, n);

        int pilihan;
        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Tampilkan semua jadwal");
            System.out.println("2. Cari berdasarkan hari");
            System.out.println("3. Cari berdasarkan mata kuliah");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = Integer.parseInt(input.nextLine());

            switch (pilihan) {
                case 1:
                    tampilSemua(jadwal, n);
                    break;
                case 2:
                    cariHari(jadwal, n);
                    break;
                case 3:
                    cariMK(jadwal, n);
                    break;
                case 4:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 4);
    }
}
