package practice_basic_day06;

import java.util.Scanner;

public class Q10_Varargs01 {

    // istedigimiz kadar sayi girdigiimizde
    // toplamlari bize veren bir method yazalim...
    public static void main(String[] args) {
        // Not ; Var-args ---> Arguman cesitliligi
        // Var --->variety args--->arguments

        Scanner scan = new Scanner(System.in);

        int sayi=1;
        while(sayi>0){

            System.out.println("istediğiniz kadar sayı girin:"+"\nSayıların toplamı için 0 a basın");
            sayi=scan.nextInt();
        }

    }


}
