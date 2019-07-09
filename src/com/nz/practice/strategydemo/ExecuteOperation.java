package com.nz.practice.strategydemo;

/**
 * @ Author     ：nz.
 * @ Date       ：Created in 下午 7:43 19/7/9
 * @ Description：执行策略的操作类
 * @ Modified By：
 * @Version: 1.0$
 */
public class ExecuteOperation {
	public static void main(String[] args) {
		int num1 = 11;
		int num2 = 12;
		Context context = new Context();
		context.setStrategy(new OperationAdd());
		System.out.println(context.executeStrategy(num1, num2));
		context.setStrategy(new OperationSubstract());
		System.out.println(context.executeStrategy(num1, num2));
		context.setStrategy(new OperationMultiply());
		System.out.println(context.executeStrategy(num1, num2));
	}
}
