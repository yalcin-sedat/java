package JavaVariableTypes;


public class PrimitiveDataTypes {

    public static void main(String[] args) {

        int integerDegiskeninDegeri=28;
        double doubleDegiskeninDegeri=9.50;
        short shortVeritipi=32767;// 32768 yapamiyorum cunku short veri tipinin kapasitesini asiyor.

        //Primitive  Veri Tipleri
        //TAM SAYI VERI TURLERININ OZELIKLERI
        System.out.println("------------------------------------------------------------------------");
        System.out.println("BYTE DEGISKENIN ");
        System.out.println("  -->EN KUCUK DEGERI:" +Byte.MIN_VALUE+    "\n  -->EN BUYUK DEGERI: " +Byte.MAX_VALUE +   "\n  -->KAC BYTE : " +Byte.SIZE);
        System.out.println("------------------------------------------------------------------------");
        System.out.println("SHORT DEGISKENIN ");
        System.out.println("  -->EN KUCUK DEGERI:" +Short.MIN_VALUE+   "\n  -->EN BUYUK DEGERI: " +Short.MAX_VALUE +  "\n   -->KAC BYTE : " +Short.SIZE);
        System.out.println("------------------------------------------------------------------------");
        System.out.println("INTEGER DEGISKENIN");
        System.out.println("  -->EN KUCUK DEGERI:" +Integer.MIN_VALUE+ "\n  -->EN BUYUK DEGERI: " +Integer.MAX_VALUE + "\n  -->KAC BYTE : " +Integer.SIZE);
        System.out.println("------------------------------------------------------------------------");
        System.out.println("FLOAT DEGISKENIN");
        System.out.println("  -->EN KUCUK DEGERI:" +Long.MIN_VALUE+    "\n  -->EN BUYUK DEGERI: " +Long.MAX_VALUE +    "\n  -->KAC BYTE : " +Long.SIZE);
        System.out.println("------------------------------------------------------------------------");

        //ONDALIKLI VERI TÜRLERININ OZELIKLERI
        System.out.println("FLOAT DEGISKENIN ");
        System.out.println("  -->EN KUCUK DEGERI:" +Float.MIN_VALUE +" \n  -->EN BUYUK DEGERI: " +Float.MAX_VALUE +    "\n  -->KAC BYTE : " +Float.SIZE);
        System.out.println("------------------------------------------------------------------------");
        System.out.println("DOUBLE DEGISKENIN ");
        System.out.println("  -->EN KUCUK DEGERI:" +Double.MIN_VALUE +"\n  -->EN BUYUK DEGERI: " +Double.MAX_VALUE +    "\n  -->KAC BYTE : " +Double.SIZE);
        System.out.println("------------------------------------------------------------------------");


        //KARAKTER VERILERI TUTAN CHAR
        char harf='s';
        System.out.println("CHAR DEGISKENIN ");
        System.out.println("  -->EN KUCUK DEGERI:" +Character.MIN_VALUE +"\n  -->EN BUYUK DEGERI: " +Character.MAX_VALUE + "\n  -->KAC BYTE : " +Character.SIZE);
        System.out.println("Bas harfim :"+harf);
        System.out.println("------------------------------------------------------------------------");

        int integerDeger='A';//Consola A harfini yazmaz,harfin karsilik geldigi Uniqe karsiligini yazar.
        System.out.println("Integer Deger: "+integerDeger);
        System.out.println("------------------------------------------------------------------------");

        //Boolean
        boolean sonuc=true;
        System.out.println("Boolean sonucunun degiskenin degeri: "+sonuc);
        sonuc=false;
        System.out.println("Boolean sonucunun degiskenin degeri: "+sonuc);

        System.out.println("------------------------------------------------------------------------");






    }
}
