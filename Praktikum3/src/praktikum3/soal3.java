package praktikum3;

import java.util.Scanner;

public class soal3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int barang,tambahan,cashback,jumlah = 0;
        
        System.out.println("======== Selamat Datang di Toko Charlie ========");
        
        System.out.print("Banyak pembelian barang : ");
        barang=sc.nextInt();
        
        System.out.println("==========================================");
        
        if (barang < 0){
            System.out.println("ERROR - Inputan harus lebih dari 0");
        }
        
        if (barang % 7==0 && barang > 0){
            cashback=(barang/7)*5500;
            System.out.println("Cashback : Rp"+cashback);
        }
        else if (barang > 0){
            System.out.println("Cashback : -");
        }
        
        if (barang > 0){
            if (barang % 3==0 || barang >= 3);
            tambahan=barang/3;
            jumlah=barang+tambahan;
            System.out.println("Tambahan barang : "+tambahan);
            System.out.println("Jumlah barang : "+jumlah);
        }
        
        else if (barang > 0){
            System.out.println("Tambahan barang : -");
        }       
    }
}