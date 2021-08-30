package JavaOperators;

public class ArithmeticOperators {

    public static void main(String[] args) {


        int number_1=150;
        int number_2=40;

        System.out.println(" number_1:  "+number_1+ "\n number_2:  "+number_2+" \nPLUS:  "+(number_1 + number_2));

        System.out.println("*******************************************************");
        System.out.println(" number_1:  "+number_1+ "\n snumber_2:  "+number_2+" \nMINUS:  "+(number_1 - number_2));

        System.out.println("*******************************************************");
        System.out.println(" number_1  "+number_1+ "\n number_2:  "+number_2+" \nMULTIPLICATION:  "+(number_1 * number_2));

        System.out.println("*******************************************************");
        System.out.println(" number_1:  "+number_1+ "\n number_2:  "+number_2+" \nnumber_1 / number_2  DIVISION:  "+(number_1 / number_2));
        System.out.println(" Double olmasini bekliyorum ama olmuyor");
        System.out.println(" number_1:  "+number_1+ "\n number_2:  "+number_2+" \nnumber_1 / number_2 DIVISION:  "+(double)(number_1 / number_2));
        System.out.println(" Double olmasini istiyorum ve  oluyor ");
        System.out.println(" number_1  "+number_1+ "\n number_2:  "+number_2+" \nnumber_1 / number_2 DIVISION:  "+((double)number_1 / (double) number_2));

        System.out.println("*******************************************************");
        System.out.println(" number_1:  "+number_1+ "\n number_2:  "+number_2+" \nMOD:  "+(number_1 % number_2));



    }
}
