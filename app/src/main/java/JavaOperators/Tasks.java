package JavaOperators;

public class Tasks {

    public static void main(String[] args) {

        /*Ödev 1

         Bir integer değişken oluşturun ve bu değişkende saniye değerini tutun.
         Sonra bu saniye değerinin kaç dakika ve saniyeye denk geldiğini yazdırın
         Örnek 1200 değeri için 20 dakika 0 saniye yazmalıdır.*/

        int seconds=1250;
        int minute=1250/60;
        int plusSeconds=seconds%60;

        System.out.println("1250 saniye "+minute+"   dakika ve "+plusSeconds+"  saniyeye denk geliyor");

        /*Ödev 2
         Bir double değişken oluşturun ve bu değişkende fahrenheit cinsinden sıcaklığı
         saklayın.
         Sonrasında bu değerin kaç Celcius olduğunu hesaplayın.
         100 değeri için 37.777778 gibi bir değer elde etmelisiniz.

         Hesaplama formülü : celcius = 5/9 * (fahrenheit -32)

         */

        System.out.println("*****************ODEV 2************************");
        double temperatureFah=100;

        double temperatureCel=(5.0/9)*(temperatureFah-32);

        System.out.println("100 Fahrenheit="+temperatureCel+"  Celcius");



    }
}
