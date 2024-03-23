package ortalamahesapla;

import java.util.Scanner;

public class Ortalamahesapla  {
    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);
        System.out.println("sayı giriniz:");
        int j = info.nextInt();
        int  sonuc=0;
        int sayac =0; 
        System.out.println("3 ve 4'e tam bölen sayılar : ");
        for(int i = 1 ; i<= j ; i++ ){
            if (i%3==0 && i % 4 ==0 ) {
             sonuc = i + sonuc;
             sayac++;
                    
                System.out.println(i);
                
               
            }
            
        }
       
        System.out.println("Girdiğiniz sayıyı 3 ve 4'e tam bölen sayıların ortalaması : "+sonuc / sayac);
                
    }
}