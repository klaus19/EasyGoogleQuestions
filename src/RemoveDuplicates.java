
//Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once.
// The relative order of the elements should be kept the same.

import java.util.List;
import java.util.Stack;

public class RemoveDuplicates {

    public int removeDuplicates(int[] nums) {
        Stack<Integer>st = new Stack<>();
        int first = st.push(nums[0]);

      //  while (!st.isEmpty())
        for (int i=1;i<nums.length;i++){
            if (st.peek()==nums[i] && nums[i]==first){
                st.remove(nums[i]);
            }
        }
        return st.size();
    }

    public static void main(String[] args) {
        RemoveDuplicates rd = new RemoveDuplicates();
        int []nums = new int[]{0,0,1,1,1,2,2,3,3,4};
        System.out.println(rd.removeDuplicates(nums));
    }

}
