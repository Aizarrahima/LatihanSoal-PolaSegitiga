package PolaSegitiga;

/**
 *
 * @author Aizar
 */
public class B {

    public static void main(String[] main) {
        int a, b; // inisialisasi variabel a dan b dengan tipe data integer
        for (a = 1; a <= 5; a++) { // sebagai perulangan luar
            System.out.println(""); // untuk membentuk baris sesuai pola perulangan
            for (b = a; b <= 5; b++) { // sebagai perulangan dalam mulai dari 5 hingga 1
                System.out.print("*"); // untuk menampilkan bintang dengan membentuk pola segitiga
            }
        }
    }
}
