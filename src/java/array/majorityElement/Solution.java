package java.array.majorityElement;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	public int majorityElement(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		int major = 0;
		for (int i : nums) {
			if (map.containsKey(i)) {
				map.put(i, map.get(i) + 1);
			} else {
				map.put(i, 1);
			}
			if (map.get(i) > nums.length / 2) {
				major = i;
				break;
			}
		}
		return major;

	}
}
