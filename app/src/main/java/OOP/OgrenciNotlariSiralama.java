package OOP;

public class OgrenciNotlariSiralama {


    public static void main(String[] args) {

        Ogrenci tumOgrenciler[]=new Ogrenci[100];

        for (int i=0;i<100;i++){
            int ogrenciID=(int)(Math.random()*100);
            int ogrenciNote=(int)(Math.random()*100);

            System.out.println("Rastgele Notlar ="+ogrenciNote);
            Ogrenci yeniOgrenci = new Ogrenci(ogrenciID, ogrenciNote);

            tumOgrenciler[i]=yeniOgrenci;


        }

        ogrencileriNotlarinaGoreSirala(tumOgrenciler);

        for (int i=0;i<100;i++){
            tumOgrenciler[i].ogrenciBilgileriniYazdir();
        }

    }

    private static void ogrencileriNotlarinaGoreSirala(Ogrenci[] tumOgrenciler) {

        for (int i=0;i<tumOgrenciler.length;i++){
            //En kücük elemanin ve indexin bulunmasi
            int enBüyükSayi=tumOgrenciler[i].getOgrenciNote();
            int enBüyükSayininIndex=i;

            for (int j=i+1;j<tumOgrenciler.length;j++){

                if (enBüyükSayi<tumOgrenciler[j].getOgrenciNote()){
                    enBüyükSayi=tumOgrenciler[j].getOgrenciNote();
                    enBüyükSayininIndex=j;
                }
            }
            //eger gerekli ise degerler yer degistirir.
            if (enBüyükSayininIndex != i){
                tumOgrenciler[enBüyükSayi]=tumOgrenciler[i];
                tumOgrenciler[i].setOgrenciNote(enBüyükSayi);
            }
        }

    }


}

class Ogrenci{

    private int ogrenciID;
    private int ogrenciNote;

    public Ogrenci(int ogrenciID, int ogrenciNote) {
        this.ogrenciID = ogrenciID;
        this.ogrenciNote = ogrenciNote;
    }

    public int getOgrenciID() {
        return ogrenciID;
    }

    public int getOgrenciNote() {
        return ogrenciNote;
    }

    public void setOgrenciID(int ogrenciID) {
        this.ogrenciID = ogrenciID;
    }

    public void setOgrenciNote(int ogrenciNote) {
        this.ogrenciNote = ogrenciNote;
    }

    public void ogrenciBilgileriniYazdir() {
        System.out.println("id :"+ogrenciID + " not:"+ogrenciNote);
    }
}
