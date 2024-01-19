package Basic_recursion;

import java.util.Locale;

public class Palindrome {
    public static void main(String[] args) {
        int i = 0;
        System.out.println(isPalindrome("Able, was I ere I saw Elba!",i));
//        String str = "A man, a plan, a canal: Panama";
//        System.out.println(removeAlphanumerics(str));
    }

    static boolean isPalindrome(String str, int i){
        str = removeAlphanumerics(str);
        if(str.charAt(i) != str.charAt(str.length()-i-1)){
            return false;
        }
        if(i>=str.length()-i-1){
            return true;
        }
        return isPalindrome(str,i+1);
    }

    static String removeAlphanumerics(String str){
        return str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    }
}
