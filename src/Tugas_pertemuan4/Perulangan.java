package Tugas_pertemuan4;

public class Perulangan {
    public static void main(String[] args) {
        int bilangan = 100;
        System.out.println("Daftar bilangan genap dari 1 sampai " + 100 + ": ");
        for (int i = 1; i <= bilangan; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " ");
            }
        }
    }
}
