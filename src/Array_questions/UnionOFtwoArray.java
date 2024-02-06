package Array_questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class UnionOFtwoArray {
    public static void main(String[] args) {
        int []a = {1,2,3,4,6};
        int []b = {2,3,5};
        System.out.println(sollution(a,b));
    }

    static ArrayList<Integer> sollution(int []a, int [] b) {
        ArrayList <Integer> Union = new ArrayList<>();
        HashSet <Integer> set = new HashSet<>();

        for(int i =0; i < a.length; i++){
            set.add(a[i]);
        }

        for(int i =0; i<b.length; i++){
            set.add(b[i]);
        }

       for( int i : set) Union.add(i);

       return Union;
    }
}
