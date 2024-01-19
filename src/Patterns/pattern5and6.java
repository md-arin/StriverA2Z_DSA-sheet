package Patterns;

public class pattern5and6 {
    public static void main(String[] args) {
        ptn6(4);
    }

    static void ptn5(int n){
        for (int r = 1; r <= n ; r++) {
            for(int c= 0; c<n-r+1; c++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void ptn6(int n){
        for (int r = 1; r <= n ; r++) {
            for(int c= 1; c<=n-r+1; c++){
                System.out.print(c);
            }
            System.out.println();
        }
    }

}
