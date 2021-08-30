package JavaControlStuctures;

public class WhileControl {

    public static void main(String[] args) {

        int count = 0;
        int i=0;

        System.out.println("************While Control ************** ");

        while (count <= 10) {
            System.out.println("While Count= " + count);

            count++;

        }

        System.out.println("************For Control ************** ");
        for ( i = 0; i <= 10; i++) {
            System.out.println("For Count= " + i);

        }

        System.out.println("Result...");
        System.out.println(" While Count= " + count);
        System.out.println(" For   Count= " + i);


        //Kod önce bir calistirlir ,sonra sarta bakilir.
        int s1=0;
        do{

            System.out.println("Do While "+s1);
            s1++;
        }while(s1<5);

    }


}
