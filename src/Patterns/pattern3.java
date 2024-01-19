package Patterns;

public class pattern3 {
    public static void main(String[] args) {
        ptn3(4);
    }

    static void ptn3(int n){
        for(int r = 0; r<=n; r++){
            for(int c = 1;c<=r;c++){
                System.out.print(c+ " ");
            }
            System.out.println();
        }
    }
}
