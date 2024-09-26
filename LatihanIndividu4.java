import java.util.Scanner;
public class LatihanIndividu4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int usia; 

        System.out.print("Masukkan usia : ");
        usia = sc.nextInt();

        if (usia >= 65) {
            System.out.println("Kategori usia lansia");
        }else if (usia >= 20 && usia <= 64) {
            System.out.println("Kategori usia Dewasa");
        }else if (usia >= 13 && usia <= 19) {
            System.out.println("Kategori usia Remaja");
        }else if (usia >= 0 && usia <= 12){
            System.out.println("Kategori usia Anak-anak");
        } else {
            System.out.println("Input tidak valid");
        }
    }
}
