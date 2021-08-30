package JavaOperators;

public class Conditional {

    public static void main(String[] args) {

        int sayi1=10;
        int sayi2=11;

        System.out.println("sayi1 esit  mi Sayi2\n"+(sayi1==sayi2));
        System.out.println("sayi1 büyük mü Sayi2\n"+(sayi1>sayi2));
        System.out.println("sayi1 kücük mü Sayi2\n"+(sayi1<sayi2));
        System.out.println("sayi1 büyük esit  mi Sayi2\n"+(sayi1>=sayi2));
        System.out.println("sayi1 kücük esit  mi Sayi2\n"+(sayi1<=sayi2));
        System.out.println("sayi1 Sayi2'e esit  degil  mi \n"+(sayi1!=sayi2));

        if (sayi1<sayi2){
            System.out.println("Sayi1 sayi2'den kucuktur.");
        }else {
            System.out.println("Sayi1 sayi2'den ya buyuktur ya da esittir.");

        }

        boolean deger1=true;
        boolean deger2=false;

        System.out.println("deger1 ve deger2 'AND' durumu:  "+(deger1 && deger2));
        System.out.println("deger1 ve deger2 'OR'  durumu:  "+(deger1 || deger2));

        int yas1=40;
        int yas2=30;

        if (yas1<50 && yas2 >25){

            System.out.println(" birinci ifade calisir");
        }

        if (yas1<35 || yas2 >30){
            System.out.println(" Ikinci ifade calismaz");

        }else {
            System.out.println(" Ikinci ifadenin 'ELSE' kismi calisti.");


        }
    }
}
