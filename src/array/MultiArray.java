package array;

public class MultiArray {
    public static void main(String[] args) {


        double[][] nilaiMahasiswa = new double[5][30];
        double[] bobot = new double[4];
        nilaiMahasiswa[0][0] = 80;
        nilaiMahasiswa[1][0] = 90;
        nilaiMahasiswa[2][0] = 75;
        nilaiMahasiswa[3][0] = 70;

        bobot[0] = 4;
        bobot[1] = 3.75;
        bobot[2] = 3.5;
        bobot[3] = 3.25;

        nilaiMahasiswa[4][0] = nilaiMahasiswa[0][0] * bobot[0] +
                nilaiMahasiswa[1][0] * bobot[1] +
                nilaiMahasiswa[2][0] * bobot[2] +
                nilaiMahasiswa[3][0] * bobot[3];

        System.out.println("Nilai si mahasiswa 1 : " + nilaiMahasiswa[4][0]);
        nilaiMahasiswa[0][1] = 80;
        nilaiMahasiswa[1][1] = 90;
        nilaiMahasiswa[2][1] = 75;
        nilaiMahasiswa[3][1] = 70;

        nilaiMahasiswa[4][1] = 0;
        for(int i =0; i<=3; i++){
            nilaiMahasiswa[4][1] += nilaiMahasiswa[i][1] * bobot[i];
        }
        System.out.println("Nilai si mahasiswa 2 : " + nilaiMahasiswa[4][1]);

        double jumlahNilaiAkhir = 0;
        for(int i=0; i<=3; i++){
            jumlahNilaiAkhir += nilaiMahasiswa[4][i];
        }
        System.out.println(jumlahNilaiAkhir);
    }
}
