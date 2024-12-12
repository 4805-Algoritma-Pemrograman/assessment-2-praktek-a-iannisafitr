import java.util.Scanner;

public class Nomor2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        /* Pekerjaan anda mulai dari sini */
         static ArrayList<Integer> keranjangBelanja = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLagi;

        do {
            System.out.print("Masukan nama menu [Burger/Steak/Spaghetti/Kentang]: ");
            String menu = scanner.next();
            int harga = getHargaMenu(menu);

            if (harga != -1) {
                keranjangBelanja.add(harga);
            } else {
                System.out.println("Menu tidak valid.");
            }

            System.out.print("Input lagi (Y/N)?: ");
            inputLagi = scanner.next();

        } while (inputLagi.equalsIgnoreCase("Y"));

        int totalBelanja = hitungTotalBelanja();
        double totalSetelahDiskon = hitungDiskon(totalBelanja);

        System.out.println("Total item pesanan = " + keranjangBelanja);
        System.out.println("Total yang harus dibayar = " + totalSetelahDiskon);

        scanner.close();
    }

    public static int getHargaMenu(String menu) {
        switch (menu.LowerCase()) {
            case "burger":
                return 35000;
            case "steak":
                return 45000;
            case "spaghetti":
                return 20000;
            case "kentang":
                return 15000;
            default:
                return -1;
        }
    }

    // Menghitung Total Belanja
    public static int hitungTotalBelanja() {
        int total = 0;
        for (int harga : keranjangBelanja) {
            total += harga;
        }
        return total;
    }

        return totalBelanja - (totalBelanja * diskon);
        /* Pekerjaan anda berakhir sini */

        System.out.println(Nomor2.class.getDeclaredMethods().length); 
    }
}
