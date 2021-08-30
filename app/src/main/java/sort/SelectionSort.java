package sort;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {

        int[] dizi={3,4,7,5,9,0,2,3};
        int gecici;
        for (int i=0;i< dizi.length-1;i++){
            for (int j=i+1;j<dizi.length;j++){

                if (dizi[j]<dizi[i]){
                    gecici=dizi[i];
                    dizi[i]=dizi[j];
                    dizi[j]=gecici;
                }
            }
        }

        for (int i=0;i<dizi.length;i++){

            System.out.println(dizi[i]);
        }
    }
}
