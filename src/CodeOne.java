import java.util.HashMap;

/**
 * A simple problem from AlgoExpert (can also be found on LeetCode)
 * In this problem we have two find two numbers that sums up to a target number;
 */

public class CodeOne {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        int[] data = twoSum(new int[]{3, 5, -4, 8, 11, 1, -1, 6}, 10);
        for(int i: data){
            System.out.println(i);
        }
    }

    private static int[] twoSum(int[] arr, int target){
        HashMap<Integer, Boolean> data = new HashMap<>();
        for(int i : arr){
            if(data.containsKey(target-i)){
                return target-i > i ? new int[]{i, target-i}:new int[]{target-i,i};
            }else{
                data.put(i, Boolean.TRUE);
            }
        }
        return new int[]{};
    }
}
