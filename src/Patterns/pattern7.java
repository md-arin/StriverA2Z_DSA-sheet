package Patterns;

public class pattern7 {
    public static void main(String[] args) {
        ptn7(3);
    }

    static void ptn7(int n){

        for (int r = 0; r<n ; r++) {

            //printing space
            for(int c= 0; c<n-r+1; c++){
                System.out.print(" ");
            }

           // Printing star
            for(int c=0; c<2*r+1; c++){
                System.out.print("*");
            }

            //Printig space again
            for (int c = 0; c<n-r+1; c++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
