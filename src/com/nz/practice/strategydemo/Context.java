package com.nz.practice.strategydemo;

/**
 * @ Author     ：nz.
 * @ Date       ：Created in 下午 7:39 19/7/9
 * @ Description：策略生成类
 * @ Modified By：
 * @Version: 1.0$
 */
public class Context {

	private Strategy strategy;

	public Context(){

	}

	public void setStrategy(Strategy strategy){
		this.strategy = strategy;
	}

	public int executeStrategy(int num1, int num2){
		return this.strategy.doOperation(num1, num2);
	}
}
