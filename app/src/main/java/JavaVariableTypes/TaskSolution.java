package JavaVariableTypes;

public class TaskSolution {

    public static void main(String[] args) {

        //Odev 1 Cozumleri

        String stringDegiskeni="150";

        int intDegeri= Integer.parseInt(stringDegiskeni);

        System.out.println("StringDegiskeni integer degere donustu  "+intDegeri);


        stringDegiskeni= String.valueOf(intDegeri);
        System.out.println("intDegeri  string degere donustu  "+stringDegiskeni);

        System.out.println("*******Odev 2 *********************");
        //Odev 2
        int sayi=5/3;
        float sayi2=5f/3f;
        double sayi3=5d/3f;

        System.out.println("Int sayi         "+sayi);
        System.out.println("Float sayi2      "+sayi2);//Float virgulden sonra 7 karakter saklamis
        System.out.println("Double sayi3     "+sayi3);

        //Odev 3
        System.out.println("*******Odev 3 *********************");
        System.out.println(1.0-0.1-0.1-0.1-0.1-0.1);
        System.out.println(1.0-0.9);


        //Odev 4
        System.out.println("*******Odev 4 *********************");
        int number=1;
        int number2=2;
        double average=(number+number2)/2;
        System.out.println(average);

        int number3=1;
        int number4=2;
        double average1=(number+number2)/2.0;
        System.out.println(average);





    }
}
