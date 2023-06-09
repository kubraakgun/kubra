package day17arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays02 {
    public static void main(String[] args) {
        //Ornek 1: Kullanicinin coklu datayi bir arraye yerlestirebilmesi, istedigi zaman durdurabilmesi icin gereken kodu yaziniz

        /*
        1) Kullanicidan data akmal icin Scanner objesi olustur
        2) Coklu datayi yerlestirmek icin bir array olusturmaliyiz
        3) Array olusturabilmek icin kullanicidan array e kac tane eleman koyacagini almaliyiz
        4) Loop olusturup eleman ekleme islemini tekrar tekrar yapabilmeliyiz
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen eklemek istediginiz ogrenci sayisini giriniz..");
        int numOfElements = input.nextInt();

        String stdNames[] = new String[numOfElements];

        System.out.println("İslemi durdurmak icin 'q' ya basiniz");

        for (int i = 0; i < stdNames.length; i++) {

            System.out.println((i+1)+ "  ogrencinin ismini giriniz...");
            String name = input.next();
            if (name.equalsIgnoreCase("q")){
                break;
            }else{
                stdNames[i]=name;
            }
        }
        System.out.println(Arrays.toString(stdNames));

    }
}
