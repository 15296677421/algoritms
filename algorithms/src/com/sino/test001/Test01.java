package com.sino.test001;

import java.io.InputStream;

/**
 * 利库上的答案赶紧不太对，数组的实际长度并没有变化，数组还多出来重复的数字
 * @author yll15
 *
 */
public class Test01 {
	
	public static void main(String[] args) {
		Test01 t = new Test01();
		int[] nums = {1,1,2};
		System.out.println(t.removeDuplicates(nums));
	}
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        for(int m : nums) {
        	System.out.print(m);
        }
        System.out.println();
        return i + 1;
    }
}
