package Hesap;
import java.util.Scanner;
public class HesapMakinesi {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int sayi1,sayi2;
        System.out.println("1.sayıyı girin");
        sayi1=input.nextInt();
        System.out.println("2.sayıyı girin");
        sayi2=input.nextInt();
         int secim;
         double sonuc;
         System.out.println("İşlem seçiminizi girin(1-toplama 2- çıkarma 3-çarpma 4-bölme)");
         secim=input.nextInt();
         switch (secim){
             case 1:
                 sonuc=sayi1+sayi2;
                 System.out.println("sonuç"+sonuc);
                 break;
             case 2:
                 sonuc=sayi1-sayi2;
                 System.out.println("sonuç"+sonuc);
                 break;
             case 3:
                 sonuc=sayi1*sayi2;
                 System.out.println("sonuç"+sonuc);
                 break;
             case 4:
                 sonuc=sayi1/sayi2;
                 System.out.println("sonuç"+sonuc);
                 break;
         }
    }
}
