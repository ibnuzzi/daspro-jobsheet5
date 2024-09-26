import java.util.Scanner;

public class Siakad19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama, nim, kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir;

        System.out.print("Masukkan nama : ");
        nama = sc.nextLine();
        System.out.print("Masukkan NIM : ");
        nim = sc.nextLine();
        System.out.print("Masukkan kelas : ");
        kelas = sc.nextLine();
        System.out.print("Masukkan nomor absen : ");
        absen = sc.nextByte();
        System.out.print("Masukkan nilai kuis : ");
        nilaiKuis = sc.nextDouble();
        nilaiKuis *= 0.2;
        System.out.print("Masukkan nilai tugas : ");
        nilaiTugas = sc.nextDouble();
        nilaiTugas *= 0.15;
        System.out.print("Masukkan nilai ujian UTS : ");
        nilaiUTS = sc.nextDouble();
        nilaiUTS *= 0.3;
        System.out.print("Masukkan nilai ujian UAS : ");
        nilaiUAS = sc.nextDouble();
        nilaiUAS *= 0.35;

        System.out.print("\n");
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Kelas : " + kelas);
        System.out.println("Absen : " + absen);
        System.out.println("Nilai kuis : " + nilaiKuis);
        System.out.println("Nilai tugas : " + nilaiTugas);
        System.out.println("Nilai ujian UTS : " + nilaiUTS);
        System.out.println("Nilai ujian UAS : " + nilaiUAS);
        System.out.println("Mahasiswa dengan nama " + nama + " (NIM " + nim + ")" + " Kelas " + kelas + " nomor absen " + absen);
        nilaiAkhir = nilaiKuis + nilaiTugas + nilaiUTS + nilaiUAS;
        System.out.println("Nilai akhir : " + nilaiAkhir);
        if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            System.out.println("Nilai akhir huruf : A");
            System.out.println("Kualifikasi : Sangat Baik");
        } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
            System.out.println("Nilai akhir huruf : B+");
            System.out.println("Kualifikasi : Lebih dari Baik");
        } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
            System.out.println("Nilai akhir huruf : B");
            System.out.println("Kualifikasi : Baik");
        } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
            System.out.println("Nilai akhir huruf : C+");
            System.out.println("Kualifikasi : Lebih dari Cukup");
        } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
            System.out.println("Nilai akhir huruf : C");
            System.out.println("Kualifikasi : Cukup");
        } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
            System.out.println("Nilai akhir huruf : D");
            System.out.println("Kualifikasi : Kurang");
        } else {
            System.out.println("Nilai akhir huruf : E");
            System.out.println("Kualifikasi : Gagal");
        }

    }
}