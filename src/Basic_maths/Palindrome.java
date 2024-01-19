package Basic_maths;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(pal(-525));
    }

    static boolean pal(int x){
        int revNum = rev(x);
        if(revNum<0){
            return false;
        }
        else if(revNum==x) {
            return true;
        }
        else {
            return false;
        }
    }

    static int rev(int x){
        int revNum = 0;
        while(x!=0){
            int lastDigit = x%10;
            if(revNum>Integer.MAX_VALUE/10 || revNum< Integer.MIN_VALUE/10){
                return 0;
            }
            revNum = revNum*10 + lastDigit;
            x=x/10;
        }
        return revNum;
    }
}
