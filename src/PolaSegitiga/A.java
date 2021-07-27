package PolaSegitiga;

/**
 *
 * @author Aizar
 */
public class A {

    public static void main(String[] main) {
        int a, b; // inisialisasi variabel a dan b dengan tipe data integer
        for (a = 0; a < 5; a++) { // sebagai perulangan luar
            System.out.println(""); // untuk membentuk baris sesuai pola perulangan
            for (b = 0; b < a; b++) { // sebagai perulangan dalam dari 1 hingga 4
                System.out.print("*"); // untuk menampilkan bintang dengan membentuk pola segitiga
            }
        }
    }
}
