package com.nz.practice;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.SimpleFormatter;

/**
 * @ Author     ：nz.
 * @ Date       ：Created in 下午 5:07 19/7/8
 * @ Description：某个月的最后一天
 * @ Modified By：
 * @Version: 1.1$
 */
public class GetLastedDayOfTheMonth {

	public static void main(String[] args) {
		Calendar instance = Calendar.getInstance();
		instance.get(Calendar.MONTH);
		System.out.println(instance.getActualMaximum(Calendar.DAY_OF_MONTH));

		Calendar instance1 = Calendar.getInstance();
		instance1.add(Calendar.MONTH, -1);
		System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(instance1.getTime()));
	}
}
