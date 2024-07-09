package ex15_5;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
//		LocalDate afterDay = now.plusDays(100);
		Period p = Period.ofDays(100);
		LocalDate afterDay = now.plus(p);
		DateTimeFormatter fmt = 
				DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");
		System.out.println(afterDay.format(fmt));
	}

}
