package com.nz.practice.leetcode;

/**
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 *
 * 示例 1:
 *
 * 输入: 123
 * 输出: 321
 *  示例 2:
 *
 * 输入: -123
 * 输出: -321
 * 示例 3:
 *
 * 输入: 120
 * 输出: 21
 * 注意:
 *
 * 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231,  231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-integer
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class IntReverse {


	public static int solution(int x){
		long rev = 0;
		while (x != 0) {
			int pop = x % 10;
			rev = rev * 10 + pop;
			if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
				return 0;
			}
			x /= 10;
		}
		return (int) rev;
	}


	public static void main(String[] args) {
		int solution = solution(1534236469);
		System.out.println(solution);
	}
}
