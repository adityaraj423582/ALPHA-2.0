package Functions;

public class binomial_coeffcient {

    public static int bincoeff(int n, int r){

        if(r==0 || r==n){
            return 1;
        }
        else{
            return bincoeff(n-1, r-1) + bincoeff(n-1, r);
        }


    }
}
