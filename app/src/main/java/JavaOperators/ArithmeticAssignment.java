package JavaOperators;

public class ArithmeticAssignment {

    public static void main(String[] args) {

        int number_1=30;
        int number_2=40;

        int result=0;

        result +=number_1;//sonuc=sonuc+sayi1  - sonuc=30
        System.out.println("sonuc: "+result);

        System.out.println("*****************");

        result -=number_2;//sonuc=sonuc-sayi2  -sonuc=-10
        System.out.println("sonuc: "+result);

        System.out.println("*****************");

        result *=number_1;//sonuc=sonuc*sayi1  -sonuc=-10*30=-300
        System.out.println("sonuc: "+result);

        System.out.println("*****************");

        result /=number_2;//sonuc=sonuc/sayi2  -sonuc=-300/40=7 (int)
        System.out.println("sonuc: "+result);

        System.out.println("*******  Odev  **********");

        //Odev
        double doubleNumber=-10.5;
        double result_2=3;

        result_2++; //result =1

        doubleNumber*=result_2;//doubleNum=doubleNum*result_2- doubleNum=-10.5*1

        System.out.println("sonuc: "+doubleNumber);

        //Task 2
        System.out.println("*******  Odev 2 /Task 2  **********");


        int s1=30;
        int s2=40;

        s1++;//s1=31
        --s2;//s2=39

        s1*=--s2;//s1=s1*38  s1=31*38

        System.out.println("Islemler sonucunda S1 = "+s1);//S1=1178
        System.out.println("Islemler sonucunda S2 = "+s2);//38


    }
}
