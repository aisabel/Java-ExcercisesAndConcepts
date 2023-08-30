package otherExcercises;

public class HcfOfTwoNumbers {
    //HCF = Highest common factor
    //GDC =  Greatest Common Div
    //without recursive

    public static void main(String [] args) {
        float num1 = 36;
        float num2 = 60;
        float hcf =0;

        for (int i=0; i<=num1 || i<=num2; i++){
            float temp1 = num1 % i;
            float temp2 = num2 % i;
            if(temp1 == 0 && temp2 ==0){
                hcf =i;
            }

        }
        System.out.println("The highest common factor is"+hcf);
    }
}
