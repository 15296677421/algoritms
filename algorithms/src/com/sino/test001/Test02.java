package com.sino.test001;

import java.util.HashSet;
import java.util.Set;

public class Test02 {
	 public int removeDuplicates(Integer[] nums) {
	        Set<Integer> set = new HashSet<Integer>();
	        for(int i = 0; i < nums.length; i++){
	        	set.add(i);
	        }
	        Integer[] num = new Integer[set.size()];
	        set.toArray(num);
	        nums = num;
	        return nums.length;
	 }
}
