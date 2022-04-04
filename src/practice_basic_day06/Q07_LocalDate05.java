package practice_basic_day06;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Q07_LocalDate05 {
    public static void main(String[] args) {

       /*
         What is the output of the following code?
        Asagidaki code'un  ciktisi  nedir?
        */

        LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);// Zaman cetveli tanımlanmış

        Period p = Period.ofDays(1).ofYears(2);// Periyot class dan p objemiz var,
                                                // en son hangisi eklendiyse o geçerlidir,SADECE "YIL"
                                                // öncekileri geçersiz kılar.

        d = d.minus(p);// Zaman cetvelinde  mines geriye gider,yukardan aldığı 2 yılı geriye götürerek 2013 olarak atama yapar.

        DateTimeFormatter f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);// SANİYEYİ ALMAMIŞ

        System.out.println(d.format(f));//10.05.2013 11:22

 /*
            A. 5/9/13 11:22// yanlış !!DİKKAT!!
            B. 5/10/13 11:22
            C. 5/9/14
            D. 5/10/14
            E. The code does not compile.
            F. A runtime exception is thrown.
*/

    }
}
