package JavaVariableTypes;

public class TypeCasting {

    public static void main(String[] args) {


        int sayi=4;
        double ondalikSayi=8.3;

        /*ondalikSayi=sayi;

        System.out.println("Ondalik sayi degeri: "+ondalikSayi);

        // sayi=ondalikSayi; hatta veriyor O yuzden Casting islemi yapilir.
        */
        sayi= (int) ondalikSayi;

        System.out.println("Sayi degeri :" +sayi);

        byte byteTip=5;
        byteTip= (byte) ondalikSayi;
        System.out.println("Byte sayinin degeri:"+byteTip);




    }
}
