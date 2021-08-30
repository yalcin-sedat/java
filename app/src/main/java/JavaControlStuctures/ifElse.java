package JavaControlStuctures;

public class ifElse {
    public static void main(String[] args) {

        int age_1 = 19;
        int age_2 = 20;

        if (age_1 > age_2) {
            System.out.println(" Age 1 > Age 2 ");
        } else if (age_1 < age_2) {

            System.out.println(" Age 2 > Age 1 ");

        } else {
            System.out.println("Age1=Age2");
        }

        System.out.println("Finish Program");

        int count=13;
        int number=6;
        if (count>number){
            System.out.println("Count > number");

        }

        int a=3;int b=4; int c=6;
        if (a>b){
            c=a+b;
        }else {
            c=a-b;
        }
        System.out.println(" C= "+c);


        //Ternary
        //Bunun yerine
        c=(a>b) ?  c=(a+b) : (a-b);
        System.out.println(" C= "+c);


    }
}
