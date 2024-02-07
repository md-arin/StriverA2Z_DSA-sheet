package Array_questions;

// https://www.codingninjas.com/studio/problems/reading_6845742?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM

public class Two_Sum {
    public static void main(String[] args) {
        int [] arr = {2,5,1,3,6};
        System.out.println(sollution(arr,5));
    }

    static String sollution(int []book, int target){
        for(int i =0; i<book.length; i++){

            for(int j = i+1; j<book.length; j++){
                if(book[i] + book[j] == target){
                    return "YES";
                }
            }
        }
        return "NO";
    }
}
