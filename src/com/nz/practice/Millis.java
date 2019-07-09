package com.nz.practice;

import java.time.Clock;
import java.util.Calendar;

/**
 * @ Author     ：nz.
 * @ Date       ：Created in 下午 5:01 19/7/8
 * @ Description：从1970 1.01 到现在的毫秒数
 * @ Modified By：
 * @Version: 10.$
 */
public class Millis {

	static Long getMillis1(){
		return System.currentTimeMillis();
	}

	static Long getMillis2(){
		return Calendar.getInstance().getTimeInMillis();
	}

	static Long getMillis3(){
		return Clock.systemDefaultZone().millis();
	}

	public static void main(String[] args) {
		System.out.println(getMillis1());
		System.out.println(getMillis2());
		System.out.println(getMillis3());
	}
}
