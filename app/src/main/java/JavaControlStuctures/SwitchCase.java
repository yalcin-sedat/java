package JavaControlStuctures;

public class SwitchCase {

    public static void main(String[] args) {

        int whichDay = 3;

        if (whichDay== 1) {

            System.out.println(" Monday");
        } else if (whichDay == 2) {
            System.out.println("Tuesday");
        } else if (whichDay == 3) {
            System.out.println("Wednesday");

        } else if (whichDay == 4) {

            System.out.println("Thursday");

        } else if (whichDay == 5) {

            System.out.println("Friday");

        }
        //Switch

        switch (whichDay){
            case 1:
                System.out.println(" Monday");break;

            case 2:
                System.out.println(" Tuesday");break;

            case 3:
                System.out.println(" Wednesday");break;

            case 4:
                System.out.println(" Thursday");break;

            case 5:
                System.out.println(" Friday");break;

            default:
                System.out.println("Something Wrong");

        }
        System.out.println(" Exit from Switch");
    }



}
