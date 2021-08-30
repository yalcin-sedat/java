package JavaOperators;

public class OperatorPrecedence {

    public static void main(String[] args) {

        int number_1=20;
        int number_2=30;
        int result=0;
        int result_2=0;

        result=(number_1+number_2*2-number_2)+number_2-number_1*4+number_1;//20
        System.out.println("First Result: "+result);
        System.out.println("****************");
        result_2=(number_1*number_2+4/2)+number_1++ * number_2+number_1;//1223
        System.out.println("Second Result: "+result_2);

    }
}
