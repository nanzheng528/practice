package com.nz.practice.thread.thinkinjava;

public class Feibonaqi {
	public static void main(String[] args) {
		int a = 20;
//		System.out.println("递归方式实现：");
//		for (int i=1; i<a; i++) {
//			System.out.printf(FeibonaqiInstance.fibonaciRecurse(i) + ", ");
//		}
		System.out.println();
		FeibonaqiInstance.outPutFibonaci(20);
	}
}

class FeibonaqiInstance{
	/**
	 * 递归方式实现
	 */
	public static int fibonaciRecurse(int n) {
		if (n <= 2){
			return 1;
		} else {
			return fibonaciRecurse(n-1) + fibonaciRecurse(n-2);
		}
	}

	/**
	 * 递推方式实现
	 */
	public static int fibonaciNormal(int n){
		if (n <= 2){
			return 1;
		} else {
			int a = 1;
			int b = 1;
			int sum = 0;
			for (int i= 0; i<n-2; i++){
				sum = a + b;
				a = b;
				b = sum;
			}
			return sum;
		}
	}

	public static synchronized void outPutFibonaci(int n){
		System.out.println("递推方式实现：");
		for (int i=1; i<=n; i++){
			System.out.printf(FeibonaqiInstance.fibonaciNormal(i) + ", ");
		}
	}

}
