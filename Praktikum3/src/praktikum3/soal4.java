package praktikum3;

import java.util.Scanner;

public class soal4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int beli,hasil,menit,stok,diskon,potongan = (100000*5/100),buah = 150,harga = 100000;
        
        System.out.println("======== TOKO BUAH A ========");
        
        System.out.print("Enter jumlah pembelian : ");
        beli=sc.nextInt();
        System.out.print("Enter menit : ");
        menit=sc.nextInt();
        
        System.out.println("=============================");
        stok=buah-beli;
        
        if (beli < 0 || menit < 0) {
            System.out.println("ERROR - Inputan invalid");
        }
        
        if (beli > 150) {
            System.out.println("Stok tidak mencukupi");
        }
        
        else if (beli > 0 && menit > 0 && menit <= 420) {
            System.out.println("Jumlah pembelian : "+beli);
            System.out.println("Stok tersisa : "+stok);
        }
        
        if (menit >= 40 && beli > 0 && menit > 0 && menit <= 420){
            diskon=(menit/40)*potongan;
            
            System.out.println("Hasil Pembelian : " + (beli*harga-diskon));
        }
        
        else if (menit < 40 && menit > 0 && beli > 0 && beli <= 150) {
            System.out.println("Hasil Pembelian : " + harga);
        }
        
        else if (menit > 420) {
            System.out.println("Toko telah tutup");
        }
    }
}