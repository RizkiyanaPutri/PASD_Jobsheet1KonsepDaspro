import java.util.Scanner;

public class TugasNo1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Array 1 dimensi kode plat
        char[] KODE = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};

        // Array 2 dimensi nama kota (maks 12 karakter)
        char[][] KOTA = {
            {'B','A','N','T','E','N','\0','\0','\0','\0','\0','\0'},
            {'J','A','K','A','R','T','A','\0','\0','\0','\0','\0'},
            {'B','A','N','D','U','N','G','\0','\0','\0','\0','\0'},
            {'C','I','R','E','B','O','N','\0','\0','\0','\0','\0'},
            {'B','O','G','O','R','\0','\0','\0','\0','\0','\0','\0'},
            {'P','E','K','A','L','O','N','G','A','N','\0','\0'},
            {'S','E','M','A','R','A','N','G','\0','\0','\0','\0'},
            {'S','U','R','A','B','A','Y','A','\0','\0','\0','\0'},
            {'M','A','L','A','N','G','\0','\0','\0','\0','\0','\0'},
            {'T','E','G','A','L','\0','\0','\0','\0','\0','\0','\0'}
        };

        System.out.print("Masukkan kode plat nomor: ");
        char inputKode = input.next().toUpperCase().charAt(0);

        boolean ditemukan = false;

        // Pencarian kode plat
        for (int i = 0; i < KODE.length; i++) {
            if (inputKode == KODE[i]) {

                System.out.print("Nama Kota: ");
                for (int j = 0; j < KOTA[i].length; j++) {
                    if (KOTA[i][j] != '\0') {
                        System.out.print(KOTA[i][j]);
                    }
                }
                System.out.println();

                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Kode plat tidak ditemukan!");
        }

        input.close();
    }
}

