package CodingInterviews.Q35;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

/*
 * 第一个只出现一次的字符
 */
public class Solution {
	public int FirstNotRepeatingChar(String str) {
		if (str == null || str.length() == 0)
			return -1;
		// 用一个有序的TreeMap辅助
		HashMap<Character, Integer> hashMap = new LinkedHashMap<>();
		for (int i = 0; i < str.length(); i++) {
			if (!hashMap.containsKey(str.charAt(i))) {
				hashMap.put(str.charAt(i), 1);
			} else {
				hashMap.put(str.charAt(i), hashMap.get(str.charAt(i)) + 1);
			}
		}
		// 找到第一次出现的字符
		Character result = null;
		Set<Character> set = hashMap.keySet();
		for (Character key : set) {
			if (hashMap.get(key) == 1) {
				result = key;
				break;
			}
		}
		// 确定位置
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == result) {
				return i;
			}
		}
		return -1;
	}
}
