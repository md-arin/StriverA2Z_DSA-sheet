package Patterns;

public class pattern4 {
    public static void main(String[] args) {
        ptn4(4);
    }

    static void ptn4(int n) {
        for (int r = 1; r <= n; r++) {
            for (int c = 1; c <= r; c++) {
                System.out.print(r + " ");
            }
            System.out.println();
        }
    }
}
