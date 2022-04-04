package practice_basic_day06;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Q09_ZoneDateTime {
    // Baska ülke veya bolgelerin saat dilimine gore zamani alma
    // Newyork un saat dilimine gore saat ?
    public static void main(String[] args) {

        ZonedDateTime zdt= ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        // String ifade önemli,hatasız yazılması gerekiyor.

        ZonedDateTime ztdLocal=ZonedDateTime.now();

        DateTimeFormatter format= DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.println("ztd= "+zdt.format(format));
        System.out.println("ztdLocal= "+ztdLocal.format(format));

    }
}
