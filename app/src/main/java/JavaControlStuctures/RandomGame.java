package JavaControlStuctures;


import java.util.Scanner;

public class RandomGame {

    public static void main(String[] args) {
        int randomCount = (int) (Math.random() * 99 + 1);
        System.out.println("Random sayi="+randomCount);
        int count;
        int live=10;
        boolean status=false;
        boolean ruleStatus=false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 ile 100 arasinda tahmini bir  sayiyi giriniz...");

        for (int i=0;i<10;i++){   //I=0
            live--;
            count = scanner.nextInt();
            if (count>=100 || count<=0){

                System.out.println("Lutfen ! 1 ile 100 arasinda tahmini bir  sayiyi giriniz.=> "+live+ "  Hakkiniz kaldi ..");

            }else {
                if (count==randomCount){
                    status=true;
                    break;
                }
                if (count > randomCount && live!=0) {
                    System.out.println("BILEMEDINIZ  ! => "+live+" Hakkiniz kaldi !  Daha kücük sayi giriniz..." );
                }else  if (count < randomCount && live!=0) {
                    System.out.println(" BILEMEDINIZ ! => "+live+" Hakiniz kaldi  !  Daha büyük sayi giriniz..." );
                }
            }

        }
        if (ruleStatus==true){
            System.out.println("Lutfen ! 1 ile 100 arasinda tahmini bir  sayiyi giriniz...");
        }

        if (status==true){
            System.out.println("Tebrikler Bildiniz...");

        }else {
            System.out.println(" Oyun Bitti ! Maalesef bilemediniz ! :( ");
        }
    }
}
