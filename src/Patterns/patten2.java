package Patterns;
// https://www.codingninjas.com/studio/problems/n-2-forest_6570178?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems
public class patten2 {
    public static void main(String[] args) {
        ptn2(3);
    }
    static void ptn2(int n){
        for (int r = 1; r <= n ; r++) {
            for(int c= 0;c<r;c++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
