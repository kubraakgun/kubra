package day14loops;

import day08stringmanipulationmemoryusageifstatement.StringManipulation01;

public class Loops01 {
    public static void main(String[] args) {
        //Verilen bir stringi ters ceviren kodu yaziniz
        //"Java" ==> "avaJ"

        //1.Yol:
        String t = "Java";
        String ters = "";

        for (int i = t.length() - 1; i >= 0; i--) {
            ters = ters + t.substring(i, i + 1);

        }
        System.out.println(ters);


        //2.Yol:
        String u = "Java";
        String ters2 = "";

        for (int i = u.length() - 1; i >= 0; i--) {
            ters2 = ters2 + u.charAt(i);
        }
        System.out.println(ters2);

        //Ornek 2: Size verilen bir stringin "Palindrome" olup olmadigini kontrol eden kodu yaziniz
        // nalan, ey edip adanada pide ye, 404
        //Logic : Stringi ters cevir sonrada duz hali ile ters halini karsilastir,ayni ise "Palindrome"

        String duz = "ey edip adanada pide ye";
        String ters3 ="";

        for (int i = duz.length()-1; i >=0 ; i--){
            ters3=ters3+duz.substring(i,i+1);
        }
       if (duz.equalsIgnoreCase(ters3)){
           System.out.println(duz+" : Palindrome dur ");
       }else{
           System.out.println(duz+" : Palindrome degildir");
       }













    }
}
