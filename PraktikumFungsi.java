public class PraktikumFungsi {
   // Harga bunga
    static int[] harga = {75000, 50000, 60000, 10000};

    // menghitung pendapatan satu cabang
    public static int hitungPendapatan(int[] stockCabang) {
        int total = 0;
        for (int i = 0; i < stockCabang.length; i++) {
            total += stockCabang[i] * harga[i];
        }
        return total;
    }

    public static void main(String[] args) {

        int[][] stock = {
            {10, 5, 15, 7},   // RoyalGarden 1
            {6, 11, 9, 12},   // RoyalGarden 2
            {2, 10, 10, 5},   // RoyalGarden 3
            {5, 7, 12, 9}     // RoyalGarden 4
        };

        String[] namaCabang = {
            "RoyalGarden 1",
            "RoyalGarden 2",
            "RoyalGarden 3",
            "RoyalGarden 4"
        };

        System.out.println("HASIL PENJUALAN ROYALGARDEN");
        System.out.printf("%-18s %-15s %-15s\n", "Cabang", "Pendapatan", "Status");
        System.out.println("================================================================");

        for (int i = 0; i < stock.length; i++) {

            int pendapatan = hitungPendapatan(stock[i]);
            String status;

            if (pendapatan > 1500000) {
                status = "Sangat Baik";
            } else {
                status = "Perlu Evaluasi";
            }

            System.out.printf("%-18s Rp %-13d %-15s\n",
                    namaCabang[i], pendapatan, status);
        }
    }
}