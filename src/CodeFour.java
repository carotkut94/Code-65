/**
 * Implementation of Binary Search algorithm
 */
public class CodeFour {
    public static void main(String... args)
    {
        int[] array = new int[]{1,2,3,4,5,6,7,8,9};
        int target = 5;
        System.out.print(doSearch(array, target, 0, array.length-1));
    }

    private static int doSearch(int[] array, int target,int start, int end) {
        while(start<end){
            int mid = (start+end)/2;
            int match = array[mid];
            if(target==match){
                return mid;
            }else if (target<match){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
