package interviewQuestions6;

import java.util.Scanner;

public class Q02_AtbashCode {
    /*
      AtbashCode ; bir metni şifrelemek veya şifresini çözmek için İbrani alfabesine temelli basit bir yöntemdir.
      Alfabenin ilk harfi son harfi yerine kullanilmaktadir..
      "abcdefghijklmnopqrstuvwxyz"; 26 harf
      "zyxwvutsrqponmlkjihgfedcba";
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("şifrelenecek ifadeyi giriniz:");
        String ifade= scan.nextLine().toLowerCase();

        for (int i = 0; i <ifade.length() ; i++) {

            int index='z'-ifade.charAt(i);// tersten bakacağı için sondan çıkardık,bir nevi kayma miktarını bulduk

            System.out.print((char)(('a')+index));

        }

        String str1="abcdefghijklmnopqrstuvwxyz";
        String str2= "zyxwvutsrqponmlkjihgfedcba";
        System.out.println("şifrelenecek ifadeyi giriniz:");
        String str3= scan.nextLine().toLowerCase();

        for (int i = 0; i < str3.length() ; i++) {// str3 için index

            for (int j = 0; j <26 ; j++) {// str1 ve str2 için index

                if(str3.charAt(i)==str1.charAt(j)) {
                    // kullanıcıdan aldığım str3 deki herhangi bir karakter str1 deki bir karaktere eşit ise
                    System.out.println(str2.charAt(j));// yani indexte str2 deki karşılığını yazdır.
                }

            }

        }

    }


}