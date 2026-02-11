import java.util.Scanner;
public class PraktikumPerulangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //input NIM
        System.out.print("Masukkan NIM: ");
        String nim = sc.nextLine();

        //ambil 2 digit terakhir NIM
        int panjang = nim.length();
        int n = Integer.parseInt(nim.substring(panjang-2));

        //validasi jika n < 10
        if (n < 10) {
            n += 10;
        }

        // Tampilkan nilai n
        System.out.println("n = " + n);
        System.out.print("Output: ");

        //perulangan dari 1 sampai n
        for (int i = 1; i <= n; i++) {
            // 10 dan 15 tidak ditampilkan
            if (i == 10 || i == 15) {
                continue;
            }
            // kelipatan 3 dicetak dengan simbol #
            if (i % 3 == 0) {
                System.out.print("# ");
            } 
            // bilangan genap dicetak i
            else if (i % 2 == 0) {
                System.out.print(i + " ");
            } 
            // bilangan ganjil dicetak dengan simbol *
            else {
                System.out.print("* ");
            }
        }
        sc.close();
    }
}
