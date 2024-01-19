package Basic_maths;

public class GCD {
    public static void main(String[] args) {
        System.out.println(calculate(6,15));
    }

    static int calculate(int n, int m){
        int ans=1;
        while(n>0 && m>0){
            if(n>m){
               n = (n%m);
            }
            else {
                m=m%n;
            }
        }
        if(n==0){
            return ans=m;
        }
        else {
            return ans =n;
        }
    }
}
