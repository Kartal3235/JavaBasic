package interviewQuestions4;

import java.util.ArrayList;
import java.util.Arrays;

public class Q05_SpecialCharRemoveArray {
    /*
   Problem Tanımı :
   getSum isminde bir method oluşturun.
   Parametresi ArrayList'tir.
   Dizideki tüm $ ları kaldır ve tüm sayıları topla
   return yaptğımız veri tipi 'int' olmalıdır.
   sonuç 0'dan küçükse, -1 yazdırın.

   Örnek1:
   ArrayList = $13, $15, $20
   Cevap = 48 olmalı

   Örnek 2 :
   ArrayList= $-13, $0, $0
   Cevap = -1 olmalı.
    */
    public static void main(String[] args) {

        ArrayList<String>arrlist=new ArrayList<>(Arrays.asList("$13, $15, $20"));

        getsum(arrlist);

    }

    private static int getsum(ArrayList<String> arrlist) {

        int toplam=0;
        for (String each:arrlist) {
            String str=each.replace("$","");

            toplam+=Integer.parseInt(str);// string olan sayi değerlerini integer a cevirdik ve toplama ekledik

        }

        if(toplam<0){
           return-1;// toplam 0 dan kucuk olduğu için method -1 dondursun dediği için yaptık

        }else
            return toplam;
    }
}