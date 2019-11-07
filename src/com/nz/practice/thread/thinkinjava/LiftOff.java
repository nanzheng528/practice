package com.nz.practice.thread.thinkinjava;

public class LiftOff implements Runnable {

	private int counDown = 10;

	private static int count = 0;

	private final int id = count++;

	public String status() {
		return "#" + id + "(" + (counDown > 0? counDown : "LiftOff") + "), ";
	}
	@Override
	public void run() {
		while (counDown-- > 0) {
			System.out.print(status());
			Thread.yield();
		}
	}


}
