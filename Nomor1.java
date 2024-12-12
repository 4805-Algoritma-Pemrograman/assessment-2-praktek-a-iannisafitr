import java.util.Scanner;

public class Nomor1 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        /* Pekerjaan anda mulai dari sini */
        tampilkanAngkaGanjil(n);
        
        scanner.close();
    }

    // Menampilkan angka ganjil
    public static void tampilkanAngkaGanjil(int n) {
        System.out.println("Angka ganjil dari 0 hingga " + n + ":");
        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
        /* Pekerjaan anda berakhir sini */

        System.out.println(Nomor1.class.getDeclaredMethods().length); 
    }
    
}
