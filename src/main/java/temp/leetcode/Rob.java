package temp.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Rob {
    HashMap hashMap = new HashMap<Integer,Integer>();
    public int solve(int idx , int[] nums){

        Integer smax = (Integer)hashMap.get(idx);
        if(smax!=null){
            return smax.intValue();
        }
        if(idx < 0){
            return 0;
        }

        int max = Math.max(nums[idx] + solve(idx-2,nums),solve(idx-1,nums));
        hashMap.put(idx,max);

        return max;
    }

    public int rob(int[] nums) {
        return solve(nums.length-1,nums);
    }


    public static void main(String[] args) {
    int[] nums = new int[]{1,2,3,4,5,6,7,8,9,0};
        Rob rob = new Rob();
        System.out.println(rob.rob(nums));


    }
}
