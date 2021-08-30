package Arrays;

import java.util.Random;

public class HomeWork {
    public static void main(String[] args) {


        //Cevap 1
        /*int [] arrays=new int[10];
        int summ = 0;

        System.out.println("******Dizideki Rastgele Sayilar******** ");
        for (int i=0;i<arrays.length;i++){
            int randomCount = (int) (Math.random() * 10 );
           // System.out.println("Rastgele üretilen sayilar"+randomCount);
            arrays[i]=randomCount;
            System.out.println(+i+" sayi = "+arrays[i]);
            summ=(summ+arrays[i]);

        }

        System.out.println("Sayilarin Toplami= "+summ);
        System.out.println("Sayilarin ortalmasi= "+summ/arrays.length);

         */

        //Cozum 2
        /*
        int[][] matris = new int[3][2];

        int bigCount = 0;
        int smallCount = 100;

        for (int i = 0; i < matris.length; i++) {

            for (int j = 0; j < matris[j].length; j++) {

                int counts = (int) (Math.random() * 100);

                matris[i][j] = counts;
                if (matris[i][j] > bigCount) {
                    bigCount = matris[i][j];
                }
                if (matris[i][j] < smallCount){
                    smallCount=matris[i][j];
                }

                System.out.println(+i + ". Satirindaki " + j + ". Stundaki deger = " + matris[i][j]);
            }
        }

        System.out.println("En buyuk sayi : " + bigCount);
        System.out.println("En kucuk sayi : " + smallCount);

         */

        //Cozum 3

        /*
        String cartType[] = {"Kupa","Maça","Karo","Sinek"};
        String cartNumber[] = {"As" , "2", "3", "4", "5", "6", "7", "8","9" ,"10", "J","Q","K"};

        int deck[]=new int[52];

        System.out.println("Kart tipleri :    "+cartType);
        System.out.println("Kart Numaralari : "+cartNumber);
       // desteyiOlustur(deste);
        desteyiKaristir(deck);
       // desteyiGoster(deste, kartTurleri, kartNumaralari);



    }

    private static void desteyiKaristir(int[] deck) {

        for (int i=0; i<deck.length;i++){
            int randomIndex = (int)(Math.random() * deck.length);
            int temporary = deck[i];
            deck[i]=deck[randomIndex];
            deck[randomIndex]=temporary;

            System.out.println("destenin karistirlimis hali :" +deck[i]);
        }



         */

        int zaman = 378678314;
        int dakika;
        int saniye;
        dakika = zaman/60;
        int saat = dakika/60;
        saniye = zaman%60;
        dakika = saat%60;
        System.out.println("Saat = " + saat);
        System.out.println("Dakika = "+ dakika);
        System.out.println("Saniye = "+ saniye);

    }
}
