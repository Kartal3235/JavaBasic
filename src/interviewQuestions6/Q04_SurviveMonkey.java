package interviewQuestions6;

public class Q04_SurviveMonkey {
    	/*
		There is a lonely monkey in the island
		He needs to eat 4 bananas every day
		there are just 165 bananas in that island
		Create following variables and find how many days
		monkey can survive.
		Use do while loop, increment and decrement and if statements
		int numberOfBananas =165, survivalDays = 1;
		boolean monkeyAlive = true;
		*/

    public static void main(String[] args) {

        int numberOfBananas =165;
        int survivalDays = 1;
        boolean monkeyAlive = true;

        do{

            System.out.println("maymunlar gunde 4 muz yer");
            numberOfBananas-=4;// toplam muz sayısından her seferinde 4 muz eksiltir.
            survivalDays++;// yasadığı gün sayısını 1 arttır.
            if(numberOfBananas<4){// 4 den az muz kalırsa

                monkeyAlive=false;// bu durumda maymun hayatta değil
                System.out.println("bugün"+survivalDays+" . gun muz kalmadı,Maymun nalları dikti");

            }else System.out.println("bugun "+survivalDays+". gun maymun halen yasıyor");

        }while(monkeyAlive);
        System.out.println("toplam Maymunun yasadığı gün sayısı : "+survivalDays);
    }
}

