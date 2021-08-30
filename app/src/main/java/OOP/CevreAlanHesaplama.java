package OOP;

import java.util.Scanner;

public class CevreAlanHesaplama {

    public static void main(String[] args) {


        //Cozum 1
        int sayi=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen sifirdan buyuk bir tam sayi giriniz:");
        sayi= scanner.nextInt();

        while (sayi<0) {
            System.out.println("Lutfen sifirdan Buyuk sayi giriniz");
            sayi = scanner.nextInt();
        }

        Circle circle=new Circle(sayi);
        circle.alanHesapla(sayi);
        circle.cevreHesapla(sayi);


    }

      static class Circle {

        private int cap;
        private double alan;
        private double cevre;

        public final static double PI=3.14;


        public Circle(){

        }
        public Circle(int R){

            this.cap=R;

        }

        public double alanHesapla(int cap){

            alan=Math.pow(cap/2,2)*PI;
            System.out.println("Alan = "+alan);
            return alan;
        }
        public double cevreHesapla(int cap){

            cevre=2*PI*cap/2;
            System.out.println("Cevre = "+cevre);
            return cevre;


        }

    }

}
