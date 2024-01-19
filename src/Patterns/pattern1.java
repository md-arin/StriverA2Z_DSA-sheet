package Patterns;
// https://www.codingninjas.com/studio/problems/n-forest_6570177?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems

public class pattern1 {
    public static void main(String[] args) {
    ptn(3);
    }

    static void ptn(int n){
        for (int i = 0; i <n; i++) {
            for(int j = 0; j<n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
