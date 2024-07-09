package ex15_4;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		//①
		Date now = new Date();
		//②
		Calendar c = Calendar.getInstance();
		c.setTime(now);
		//③
		int day = c.get(Calendar.DAY_OF_MONTH);
//		int day = c.get(Calendar.DATE);
		//④
		c.set(Calendar.DAY_OF_MONTH, day + 100);
		//⑤
		Date d = c.getTime();
		//⑥
		SimpleDateFormat fmt = 
				new SimpleDateFormat("西暦yyyy年MM月dd日");
		System.out.println(fmt.format(d));
		
	}

}
