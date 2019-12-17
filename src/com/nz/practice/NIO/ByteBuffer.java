package com.nz.practice.NIO;

public class ByteBuffer {


	public static void main(String[] args) {

		java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(3);

		allocate.put((byte) 3);
		System.out.println(allocate);

		//设置开始读取数据的头部位置索引
		allocate.position(0);

		//有效数据长度
		allocate.limit(1);

		byte b = allocate.get();

		System.out.println(b);
	}
}
