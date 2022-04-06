import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        service data = new service();

        System.out.println("Berikut adalah data sebelum diurutkan");
        data.tampil();
        System.out.println();
        System.out.println("Setelah data disorting");
        data.bubbleSort();
        data.tampil();
        System.out.println();
        System.out.println("Masukkan data yang anda cari : ");
        int cari = sc.nextInt();
        System.out.println("Menggunakan binary search");
        int posisi = data.FindBinarySearch(cari, 0, data.array.length -1);
        data.tampilPosisi(cari, posisi);
    }
}
