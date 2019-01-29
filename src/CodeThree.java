/**
 * This is to get the longest palindromic substring from a given string
 */
public class CodeThree {
    public static void main(String[] args) {
        System.out.println(longestPalindromicSubstring("zzzzxxyyxx"));
    }

    public static String longestPalindromicSubstring(String str){
        int[] currentLongest = {0,1};
        for(int i=1;i<str.length();i++){
            int[] odd = getLongestPalindromeFrom(str, i-1, i+1);
            int[] even = getLongestPalindromeFrom(str, i-1,i);
            int[] longest = odd[1] - odd[0] > even[1] - even[0] ? odd : even;
            currentLongest = currentLongest[1] - currentLongest[0] > longest[1] - longest[0] ? currentLongest : longest;
        }
        return str.substring(currentLongest[0], currentLongest[1]);
    }

    public static int[] getLongestPalindromeFrom(String str, int leftIndex, int rightIndex){
        while(leftIndex >= 0 && rightIndex < str.length()){
            if(str.charAt(leftIndex) != str.charAt(rightIndex)){
                break;
            }
            leftIndex--;
            rightIndex++;
        }
        return new int[] {leftIndex+1, rightIndex};
    }
}
