package JavaControlStuctures;

import java.util.Scanner;
import java.util.Random;

public class HomeWork {

    public static void main(String[] args) {


        //Soru 1:
       /* int lenght=0;
        double weight=0;

        System.out.println("Welcome...");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please write your lenght (cm)"+lenght);

        lenght = scanner.nextInt();
        System.out.println("Please write your weight (gr)."+weight);
        weight = scanner.nextDouble();


        double bodyIndex=weight/Math.pow(((double) lenght/100.0),2);

        System.out.println("Body Index= "+bodyIndex);

       if (bodyIndex<=15){

           System.out.println("Cok derecede zayifsin..");
       }else if (bodyIndex<=15 & bodyIndex<=16){
           System.out.println("Cok zayifsin....");

       }else if (bodyIndex>=16 & bodyIndex <= 18.5){
           System.out.println("Düsük Kilo...");
       }else if (bodyIndex>=18.5 & bodyIndex<= 25){
           System.out.println("Normal kilolu");
       }else if( bodyIndex>=25 & bodyIndex <= 30){
           System.out.println("Fazla kilolu....");
       }else if( bodyIndex>=30 & bodyIndex <= 35){
           System.out.println("1. Derceden Obez...");
       }else if( bodyIndex>=35 & bodyIndex <= 40){
           System.out.println("2. Dereceden Obez..");
       }else if(bodyIndex>40){
           System.out.println("3. Dereceden Obez..");
       }

        */

        //Lösung 2
/*     //Soru 2:
        System.out.println("---------------------------------------Cevap 2 --------------------------------------------------------------");
        int chancheNummer=(int) (Math.random()*99+1);
        //Random random=new Random(100);
        System.out.println("Tahmin giriniz...");
        Scanner s=new Scanner(System.in);

        int tahmin=s.nextInt();

        int chancheNum1=chancheNummer/10;
        int chancheNum2=chancheNummer %10;

        int tahmin2=tahmin %10;
        int tahmin1=tahmin/10;

        int chancheNum1_2=chancheNum1+chancheNum2;
        int tahmin1_2=tahmin2+tahmin1;

        if (tahmin==chancheNummer){
            System.out.println("1000 Tl Kazandiniz  Tahmin ettiginiz sayi ="+tahmin+"  Sans numarasi= "+chancheNummer);
        }

        if (chancheNum1_2==tahmin1_2){
            System.out.println("500 Tl Kazandiniz Tahmin ettiginiz sayi   ="+tahmin+"  ,Sans numarasi= "+chancheNummer);
        }else  {
            System.out.println("Tekrar deneyiz..");
        }

 */

        //Soru:3  Klavyeden girilen 3 sayının ortalamasını alan bir uygulama yazınız...
/*

        int nummber1;
        int nummber2;
        int nummber3;
        int sum;
        Scanner scanner=new Scanner(System.in);

        System.out.println("Birinci Sayiyi giriniz....");
        nummber1=scanner.nextInt();

        System.out.println("Ikinci  Sayiyi giriniz....");
        nummber2=scanner.nextInt();

        System.out.println("Ücüncü  Sayiyi giriniz....");
        nummber3=scanner.nextInt();

        sum=(nummber1+nummber2+nummber3)/3;
        System.out.println("Üc sayinin ortalamasi=  "+sum);


 */
        //Soru 3: Klavyeden kenarları girilen bir üçgenin çeşidini veren uygulamayı yazınız.

     /*   int edge1;
        int edge2;
        int edge3;

        Scanner scanner=new Scanner(System.in);
        System.out.println("Birinci kenari giriniz...");
        edge1=scanner.nextInt();

        System.out.println("ikinci  kenari giriniz...");
        edge2=scanner.nextInt();

        System.out.println("Ücüncü kenari giriniz...");
        edge3=scanner.nextInt();

        if (edge1==edge2 && edge2==edge3){
            System.out.println("Eskenar ücgen");
        }else if (edge1==edge2 || edge1==edge3 && edge2!=edge3){
            System.out.println("Ikizkenar ücgen");
        }else if (edge1!=edge2 && edge2 !=edge3 && edge3!=edge1){
            System.out.println("Cesit kenar ücgen");
        }


      */


        //Soru 4: Klavyeden girilen vize ve final notlarınına göre öğrencinin dersi geçip geçmediğini söyleyen
        //bir uygulama yazınız.(Geçme notu : 50, vizenin %40ı, finalin %60ı geçerlidir.)


       /* int vizeExam;
        int finalExam;
        int successNote;

        Scanner scanner=new Scanner(System.in);
        System.out.println("Vize notunu gir...");
        vizeExam=scanner.nextInt();

        System.out.println("Final notunu gir...");
        finalExam=scanner.nextInt();

        successNote=((vizeExam*40)+(finalExam*60))/100;

        if (successNote>=50){
            System.out.println("Dersi gectiniz .  Notunuz= "+successNote);
        }

        if (successNote<=50){
            System.out.println("Dersi gecemediniz. Notunuz= "+successNote);
        }

        */


        //SORU 5:
        //Kendi adınızı ekrana 5 kere yazdıran uygulamayı tüm döngülerle yapınız.

      /*  System.out.println("_____FOR_____________");
        String name= "SEDAT";

        for (int i=0;i<5;i++){
            System.out.println(""+name);
        }

        System.out.println("_____WHILE_____________");
        int count=0;
        while (count<5){
            count++;
            System.out.println(""+name);
        }


        System.out.println("_____DO  WHILE_____________");

        int count2=0;
        do {
            System.out.println(""+name);
            count2++;
        }while (count2<5);

       */


        //SORU 6:
        //1’den 100’e kadar olan sayıların toplamını bulan uygulamayı yazınız.

        /*
        int count=0;
        for (int i=1;i<=100;i++){

            System.out.println("Birden yüze kadar olan sayilar.."+i);
            count=count+i;

        }
        System.out.println("Birden Yüze kadar olan sayilarin Toplmai.=  "+count);


         */


        //SORU 7:
        //1’den 10a kadar olan sayıları sıra ile ve aralarında virgül olacak şekilde yazan bir
        //uygulamayı for döngüsü ile yazınız. 1,2,3,........ 10

       /* for (int i=1;i<=10;i++){

            System.out.print(+i+",");
        }

        */

        //SORU 8:
        //Aşağıda tanımı verilen f(x,y)
        //hesaplayınız.
        //x>0, y<0 ise f(x,y) = 4x+2y+4

       /* double x;
        double y;
        Scanner scanner=new Scanner(System.in);
        System.out.println("X sayisini sifirdan büyük giriniz");
        x=scanner.nextDouble();

        System.out.println("Y sayisini sifirdan kücük giriniz");
        y=scanner.nextDouble();

        double results = 0;

        if (x>0 && y<0){

            results=4*x+2*y+4;
            
        }
        System.out.println("Sonuc: "+results);

        */

        //SORU 9:
        //Klavyeden girilen bir sayının faktöriyelini alan bir uygulama yazınız.
       /* Scanner scanner=new Scanner(System.in);
        System.out.println("Bir sayi giriniz...");
        int count=scanner.nextInt();
        int result=1;


            for (int i = 1; i<=count; i++) {

               result=result*i;


            }

        System.out.println("Girdiginiz sayinin faktörü :"+result);

        */

        //SORU 10:
        //100lük sistemde verilen notları harfli sistemde gösteren bir uygulama yazınız.

        /*Scanner scanner=new Scanner(System.in);
        System.out.println("Sinav notunzu giriniz...");
        double note=scanner.nextDouble();


        if (note>=80){
            System.out.println("AA");
        }else if (note>= 70 && note<=80){
            System.out.println("BA");
        }else if (note>=60 && note<=70){
            System.out.println("BB");
        }else if (note>=55 && note<=60){
            System.out.println("CB");
        }else if (note==55){
            System.out.println("CC");
        }else if (note<55){
            System.out.println("FF");
        }

         */

        //SORU: 11
        //Çarpım tablosunu oluşturan bir uygulama yazınız.

        /*
        int result=0;
        for (int i=1; i<=10;i++){
            System.out.println("---------------------");
            for (int j=0;j<=10;j++){
               result=i*j;
                   System.out.println(""+i+"*"+j+"="+result+"      ");

            }
        }

         */

        //SORU: 12
        //Sıcak soguk oyunu yapalım. Sistem 100e kadar bir sayı üretsin. Kullanıcı bu sayıyı tahmin
        //etmeye çalışsın. Kullanıcının girdiği değere göre kullanıcıyı arttır azalt diyerek uyaralım.
        //Kullanıcı sayıyı bulana kadar tahmin istemeye devam edelim ve sayıyı buldugunda kaç denemeden
        //sonra bulduğunu belirtelim.




    }



}
