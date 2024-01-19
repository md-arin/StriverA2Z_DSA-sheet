package Basic_maths;

public class CountDigits {
    public static void main(String[] args) {
        System.out.println(count(660));
    }
    static int count(int n ){
        int cnt = 0;
        int real = n;
     while (n>0){
         int rem = n%10;
         if(rem==0) {
             n = n / 10;
         } else  {

         if(real%rem==0){
             cnt++;
             n = n / 10;
             }

         }
     }
     return cnt;
    }
}
