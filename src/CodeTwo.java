/**
 * This is to check if the given string is palindrome or not
 */
public class CodeTwo {
    public static void main(String[] args) {
        System.out.println(isPalindrome("aba"));
        System.out.println(isPalindrome("abca"));
    }

    static Boolean isPalindrome(String data){
        int left = 0;
        int right = data.length()-1;

        while(left<right){
            if(data.charAt(left)!=data.charAt(right)){
                return Boolean.FALSE;
            }
            left += 1;
            right -= 1;
        }
        return Boolean.TRUE;
    }
}
