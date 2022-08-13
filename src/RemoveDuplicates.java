
//Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once.
// The relative order of the elements should be kept the same.

import java.util.List;
import java.util.Stack;

public class RemoveDuplicates {

    public int removeDuplicates(int[] nums) {

         int l=0;
         int w=nums[0];

         for (int i=1;i<nums.length;i++){
             Stack<Integer>st = new Stack<>();
             if (nums[i]!=w){
                 st.push(nums[i]);
                 w++;
             }else {
                 st.pop();
             }
         }
         return w;
    }

    public static void main(String[] args) {
        RemoveDuplicates rd = new RemoveDuplicates();
        int []nums = new int[]{0,0,1,1,1,2,2,3,3,4};
        System.out.println(rd.removeDuplicates(nums));
    }

}
