package com.nz.practice.leetcode;

public class LengthOfLongestSubStr {

	{
		int x = 1;
	}
	public static int  LengthOfLongestSubStr(String s){
		// index, 遍历的当前的位置
		int i = 0;

		// 记录重复的字符的下个位置
		int flag = 0;

		int length = 0;
		int result = 0;
		while (i < s.length()) {
			int pos = s.indexOf(s.charAt(i), flag);
			if (pos < i) {
				if (length > result) {
					result = length;
				}
				if (result >= s.length() - pos - 1) {
					return result;
				}
				length = i - pos - 1;
				flag = pos + 1;
			}
			length++;
			i++;
		}
		return length;
	}


	public static void main(String[] args) {
		int length = LengthOfLongestSubStr("abade");
		System.out.println(length);
	}
}
