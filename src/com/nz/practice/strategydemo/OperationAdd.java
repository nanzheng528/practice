package com.nz.practice.strategydemo;

/**
 * @ Author     ：nz.
 * @ Date       ：Created in 下午 7:36 19/7/9
 * @ Description：
 * @ Modified By：
 * @Version: $
 */
public class OperationAdd implements Strategy {
	@Override
	public int doOperation(int num1, int num2) {
		return num1 + num2;
	}
}
