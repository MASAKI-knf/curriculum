package Calendar;
import java.text.SimpleDateFormat;
import java.util.Date;



public class Calendar {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Date d = new Date();
		
		  SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

		  System.out.println(sdf.format(d));

		}
	}


