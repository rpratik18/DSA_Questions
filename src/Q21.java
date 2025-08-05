public class Q21 {

    public static void main(String[] args) {
        int Numerator_frac1=1;
        int Denominator_frac1=3;
        int Numerator_frac2=3;
        int Denominator_frac2=9;
        int result_Numerator=0 ,result_Denominator=0;

        if(Denominator_frac1==Denominator_frac2){
            result_Numerator=Numerator_frac1+Numerator_frac2;
            result_Denominator=Denominator_frac1;

        }else{
            result_Numerator=(Numerator_frac1*Denominator_frac2)+(Numerator_frac2*Denominator_frac1);
            result_Denominator=  Denominator_frac2*Denominator_frac1;
        }
        int r=gcd(result_Numerator,result_Denominator);
        result_Numerator /= r;
        result_Denominator /= r;
        System.out.println(result_Numerator+"/"+result_Denominator);
    }

    public static int gcd(int n1,int n2){
        if (n1 == 0)
            return n2;
        return gcd(n2 % n1, n1);
    }
}
