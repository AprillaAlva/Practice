package praktikum3;

import java.util.Scanner;

public class soal1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a;
        
        System.out.print("Masukkan Bilangan : ");
        a = sc.nextInt();
        
        if (a % 5 == 0 && a % 2 != 0){
            System.out.println("Program Started");
        }
        else {
            System.out.println("Program Halted");
        }
    }
}