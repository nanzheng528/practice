package com.nz.practice.leetcode;

public class StrToInt {

		public static int myAtoi(String str) {
			if(str == null || str.length() == 0){
				return 0;
			}
			str = str.replace(" ", "");
			if(str.length() == 0){
				return 0;
			}
			int res = 0;
			char[] strs = str.toCharArray();
			boolean negative = false;
			for (int i = 0; i < str.length(); i++){
				char s = strs[i];
				if (i == 0){
					if(!Character.isDigit(s) && !"-".equals(String.valueOf(s))){
						return 0;
					}
				}
				if(!Character.isDigit(s)){
					if("-".equals(String.valueOf(s))){
						negative = true;
						continue;
					} else {
						break;
					}
				}
				if(Character.isDigit(s)){
					res = res*10 + Integer.parseInt(String.valueOf(s));
					if ((res * 10) / 10 != res){
						res = Integer.MAX_VALUE;
						return res;
					}
					continue;
				}
			}
			if (negative){
				res = res * -1;
			}
			if (res > Integer.MAX_VALUE){
				return Integer.MAX_VALUE;
			} else if (res < Integer.MIN_VALUE){
				return Integer.MIN_VALUE;
			}
			return res;
		}

	public static void main(String[] args) {
		System.out.println(myAtoi("    -42"));
	}
}
