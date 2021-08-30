package JavaControlStuctures;

public class BreakContinue {


    public static void main(String[] args) {

        for (int i =0; i<10; i++){

           // System.out.println("i =" +i);

            if (i==4){
                break;
            }

            System.out.println("i =" +i);

        }

        for (int a=0;a<5;a++){
            for (int b=0; b<3;b++){
                System.out.println("a :"+a+" b: "+b);
                if (a==1 && b==2){
                    break;
                }
            }
        }

        //Etiket

        for_1:
        for (int a=0;a<5;a++){

            for_2:
            for (int b=0; b<3;b++){
                System.out.println("a :"+a+" b: "+b);
                if (a==1 && b==2){
                    break for_1;
                }
            }
        }


        //Continue
        for (int i=0;i<5; i++){
            if (i==3){
                continue;
            }

            System.out.println("i = "+i);
        }

        //Return,(Ilgili methodan cikaririr...)
        for (int i=0;i<5; i++){
            if (i==3){
                return;
            }

            System.out.println("i = "+i);
        }
    }
}
