package praktikum3;

import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double l,b,k,s,e,f,g,h;
        l=850.26;
        b=250.11;
        k=25.31;
        s=200.0;
        
        int index;
        
        System.out.print("Banyak laptop : ");
        e=sc.nextInt()*l;
        
        System.out.print("Banyak buku tulis : ");
        f=sc.nextInt()*b;
        
        System.out.print("Banyak kotak pensil : ");
        g=sc.nextInt()*k;
        
        System.out.print("Banyak smartphone : ");
        h=sc.nextInt()*s;
        
        if (e < 0 || f < 0 || g < 0 || h < 0 ){
            System.out.println("ERROR - Tidak dipearkenankan bilangan Negatif");
        }
        else if ((e+f+g+h==0)){
            index=0;
            System.out.println("Index barang baawaan : "+index);
        }
        else if ((e+f+g+h) > 0 && (e+f+g+h) < 500){
            index=1;
            System.out.println("Index barang bawaan : "+index);
        }
        else if ((e+f+g+h) >= 500 && (e+f+g+h) < 1000){
            index=2;
            System.out.println("Index barang bawaan : "+index);
        }
        else if ((e+f+g+h) >= 1000 && (e+f+g+h) < 1500){
            index=3;
            System.out.println("Index barang bawaan : "+index);
        }
        else if ((e+f+g+h) >= 1500 && (e+f+g+h) < 2000){
            index=4;
            System.out.println("Index barang bawaan : "+index);
        }
        else {
            index=5;
            System.out.println("Index barang bawaan : "+index);
        }
        
        if ((e+f+g+h < 2000)&& e > 0 && f > 0 && g > 0 && h > 0) {
            System.out.println("Barang bawaan tidak melebihi kapasitas");
        }
        if ((e+f+g+h) > 2000 && e > 0 && f > 0 && g > 0 && h > 0 ) {
            System.out.println("Barang bawaan melebihi kapasitas");
        }
    }
}
