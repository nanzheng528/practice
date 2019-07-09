package com.nz.practice;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;

/**
 * @ Author     ：nz.
 * @ Date       ：Created in 下午 5:14 19/7/8
 * @ Description：时间日期格式化
 * @ Modified By：
 * @Version: 1.0$
 */
public class DateFormatTest {
	public static void main(String[] args) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(simpleDateFormat.format(new Date()));

		// JDK1.8
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		System.out.println(dateTimeFormatter.format(LocalDate.now()));
	}
}
