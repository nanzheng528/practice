package com.nz.practice.leetcode;

/**
 * Definition for singly-linked list. */


class TowSumSolution {
	static class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode pre = new ListNode(0);
		ListNode cur = pre;
		int carry = 0;
		while (l1 != null || l2 != null){
			int sum = (l1 != null?l1.val:0) + (l2 != null?l2.val:0) + carry;
			carry = sum/10;
			sum = sum%10;
			cur.next = new ListNode(sum);
			cur = cur.next;
			if(l1 !=null){
				l1 = l1.next;
			}
			if(l2 != null){
				l2 = l2.next;
			}
		}

		if(carry == 1){
			cur.next = new ListNode(carry);
		}
		return pre.next;
	}

	public static void main(String[] args) {
		TowSumSolution towSumSolution = new TowSumSolution();
		ListNode listNode1 = new ListNode(1);
		listNode1.next = null;
		ListNode listNode2 = new ListNode(2);
		listNode2.next = null;
		ListNode listNode = towSumSolution.addTwoNumbers(listNode1, listNode2);
		System.out.printf("111");
		}
}
