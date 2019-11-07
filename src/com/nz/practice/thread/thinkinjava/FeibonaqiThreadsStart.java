package com.nz.practice.thread.thinkinjava;

public class FeibonaqiThreadsStart {

	public  int threadsNum1 = 0;

	public  int n1 = 0;

	public void genericFeibonaqi(){
		for (int i=0; i<threadsNum1; i++){
			new Thread(new Runnable() {
				@Override
				public void run() {
					FeibonaqiInstance.outPutFibonaci(n1);
				}
			}).start();
		}
	}

	public static void main(String[] args) {
		FeibonaqiThreadsStart feibonaqiThreadsStart = new FeibonaqiThreadsStart(5, 20);
		feibonaqiThreadsStart.genericFeibonaqi();
	}

	public FeibonaqiThreadsStart(int threadsNum, int n) {
		this.threadsNum1 = threadsNum;
		this.n1 = n;
	}
}
