package Array_questions;

public class borignFactorials {
    public static void main(String[] args) {
        System.out.println(sollution(18,19));
    }

    static int sollution(int n, int p){
        for(int i = n-1; i > 0; i--){
            n = (n * i) %p;
        }
        return n % p;
    }
}
