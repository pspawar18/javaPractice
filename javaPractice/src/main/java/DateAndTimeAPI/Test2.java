package DateAndTimeAPI;

import java.time.LocalDate;

public class Test2 {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		int dd = date.getDayOfMonth();
		int mm = date.getMonthValue();
		int yyyy = date.getYear();
		 
		System.out.println(dd+"..."+mm+"..."+yyyy);
		System.out.printf("%d-%d-%d",dd,mm,yyyy);
	}

}
