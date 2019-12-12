package com.nz.practice.leetcode;


import java.util.Arrays;

/**
 *
 * 给定 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0)。找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 *
 * 说明：你不能倾斜容器，且 n 的值至少为 2。
 *
 *
 *
 * 图中垂直线代表输入数组 [1,8,6,2,5,4,8,3,7]。在此情况下，容器能够容纳水（表示为蓝色部分）的最大值为 49。
 *
 *  
 *
 * 示例:
 *
 * 输入: [1,8,6,2,5,4,8,3,7]
 * 输出: 49
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/container-with-most-water
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class MostWaterCollection {

	// 双向指针的办法，哪一边的线高度短，舍弃掉哪一边，向对边的方向移动，因为线段的会限制宽度，舍弃线段的，寻找线更长的反而有机会找到更大的面积
	public static int maxArea(int[] height) {
		int l = 0;// 左边的指针始端
		int r = height.length -1; //右边的指针始端
		int maxArea = 0; //最大的面积
		while(l<r) {
			maxArea = Math.max(maxArea, Math.min(height[l], height[r]) * (r-l));
			if (height[l] > height[r]){ //左边的比较高
				r--; //移动右边的
			} else {
				l++; //移动左边的
			}
		}
		return maxArea;
	}

	public static void main(String[] args) {
		int[] ba = new int[]{1,8,6,2,5,4,8,3,7};
//		int[] a = Arrays.asList().toArray(new int[10]);
		System.out.println(maxArea(ba));
	}
}
