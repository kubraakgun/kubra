package day12nestedternaryswichloops;

import java.util.Scanner;

public class Switch04 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Ulke adi giriniz");
        String countryName = input.nextLine();

        switch (countryName.toLowerCase()){
            case "america","abd":
                System.out.println("US");
                break;
            case "england":
                System.out.println("UK");
                break;
            case "germany":
                System.out.println("DE");
                break;

            case "turkey":
                System.out.println("TR");
                break;

            case "india":
                System.out.println("IN");
                break;

            case "peru":
                System.out.println("PE");
                break;
            case "spain":
                System.out.println("ES");
                break;
            case "bulgaria":
                System.out.println("BG");
                break;
            case "albania":
                System.out.println("AL");
                break;
            case "france":
                System.out.println("FR");
                break;
            default:
                System.out.println("Bu ülke tanimli degildir");


        }
        /*
        1) Github ta bulunan projeyi kendi lokalimize almak icin;
          a) Clone lanmak istenen projenin url i kopyalanir.
          b) Intellij den file + new + project from version control

          bundan sonra codelari intellij uzerinden terminal acilarak -git pull denilerek kendi lokalimize cekebiliriz

        2) Kendi lokalimize almis oldugumuz projeyi Git hub ta saklamak icin;
          a) Git hub ta yeni bir repo olusturulacak, bunun icin repositories e tiklayin, sag ust kosede yesil new'e tiklayin
          b) Acilan sayfada bir isimlendirme yapilarak repo public mi olsun private mi olsun karar verilecek ve create tiklanacak.
          c) Acilan yeni bos repo sayfasindan url kopyalanacak
          d) Intellij den gondermek istedigimiz proje acik iken terminal kismi acilacak
          e) git push (=>url<=) copy + paste yapilarak enter yapacaksiniz

         */


    }
}
