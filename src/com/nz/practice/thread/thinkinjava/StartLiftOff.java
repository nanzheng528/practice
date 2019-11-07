package com.nz.practice.thread.thinkinjava;

public class StartLiftOff {
	public static void main(String[] args) {
		System.out.println("countDown beginning....");
		startNumsThreads(5);
	}

	public static void startOneThread(){
		Thread thread = new Thread(new LiftOff());
		thread.start();
	}

	public static void startNumsThreads(int threadNums){
		while (threadNums-- > 0){
			new Thread(new LiftOff()).start();
		}
	}
}
