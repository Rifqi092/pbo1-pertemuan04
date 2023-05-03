package Tugas_pertemuan4;

public class tugasarray {
    public static void main(String[] args) {
        System.out.println("Mie Goreng = Rp.10000");
        System.out.println("Mie Kuah = Rp.12000");
        System.out.println("Ayam Goreng = Rp.15000");
        System.out.println("Ikan Goreng = Rp.20000");


    int harga[];
    harga = new int[10];

    harga[0] =10000 ;
    harga[1] =12000;
    harga[2] = 15000;
    harga[3] = 20000;

        System.out.println("Pembelian Ayam Goreng dengan harga "+harga[2]+" dan ikan goreng dengan harga "+ harga[3]+ " maka totalnya " + (harga[2]+harga[3]));

    }
}
