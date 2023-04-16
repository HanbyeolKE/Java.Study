package time;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MyDateTime {
	String str1 = "멤버변수";			// 객체화 ㅇ벗이는 사용 불가능
	static  String str2 = "static정적 멤버변수";	// 객체화 안하고 사용 가능(변수 생성시점 이후에만)
	
	public static void main(String[] args) {
		MyTime mt = new MyTime();
		
		System.out.println(mt.dateTime());
		System.out.println(mt.date());
		System.out.println(mt.Time());
		System.out.println(mt.Tomorrow());
		System.out.println(mt.after30());
		
		//System.out.println(MyDateTime.str1);
		//System.out.println(str1);			// 객체화를 해야 변수와 메서드 사용가능
		System.out.println(str2);			// static이어서 어느 클래스 안에 있는지만 알려주면 바로 접근 가능
		
		// static으로 올려놓으면 객체화없이 그 안에 있는 메서드와 멤버변수를 바로 사용 가능
		GetInstance get = GetInstance.getInstance();		// GetInstance : static으로 올려놔서 막 접근이 가능
		GetInstance get2 = GetInstance.getInstance();		// get==get2
		
		// getInstance() : static으로 객체화
		
		get.print();
		
		// 정석적인 객체화
		// Singleton 홍길동 = new Singleton();
		// Singleton 이순신 = new Singleton();
		
		// 싱글턴패턴의 객체화(홍길동 == 이순신)
		Singleton 홍길동 = Singleton.getInstance();
		Singleton 이순신 = Singleton.getInstance();
		

		
;	}
}

class MyTime{
	// 자바 코드로 현재 시간을 가져오는법
	
	// Calender, Date, SimpleDateFormat, String

	// 멤버변수
	private String str;
	
	// 메서드
	public String dateTime() {
		// 현재 시간을 str에 반환
		Calendar cal = Calendar.getInstance();		// 객체화(싱글턴 페턴, 1회용 객체화)
		Date date = cal.getTime();				// 시간을 가져옴
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");		// 시간을 출력할 형태를 생성자로 결정
		
		str = sdf.format(date);
		return str;
	}
	
	public String date() {
		// 년, 월, 일 반환
		Calendar cal = Calendar.getInstance();		// 싱글턴페턴 객체화
		Date  date = cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년.MM월.dd일");
		
		str = sdf.format(date); 
		return str;
	}
	
	public String Time() {
		// 10-00-55
		Calendar cal = Calendar.getInstance();		// 싱글턴페턴 객체화
		Date date = cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("HH-mm-ss");
		
		str = sdf.format(date);
		return str;
	}
	public String Tomorrow() {
		// 내일
		Calendar cal = Calendar.getInstance();		// 싱글턴페턴 객체화
		Date date = cal.getTime();
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("MM");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd");
		SimpleDateFormat sdf4 = new SimpleDateFormat("HH");
		SimpleDateFormat sdf5 = new SimpleDateFormat("mm");
		SimpleDateFormat sdf6 = new SimpleDateFormat("ss");
		
		String year = sdf1.format(date);	// 년
		String month = sdf2.format(date);	// 월
		String day = sdf3.format(date);		// 일
		String hour = sdf4.format(date);	// 시
		String minute = sdf5.format(date);  // 분
		String second = sdf6.format(date);  // 초
		
		str = year + "년-" + month + "월-" + (Integer.parseInt(day)+1) + "일-" + 
		(Integer.parseInt(hour)+1) + "시:" + minute + "분:" + second + "초";
		
		return str;
	}
	public String after30() {
	//  30분 뒤 시간
		Calendar cal = Calendar.getInstance();		// 싱글턴페턴 객체화
		cal.add(Calendar.MINUTE, 30);
		Date date = cal.getTime();		// 이때 시간을 가져옴
		SimpleDateFormat sdf_hour = new SimpleDateFormat("HH");
		SimpleDateFormat sdf_minute = new SimpleDateFormat("mm");
		SimpleDateFormat sdf_second = new SimpleDateFormat("ss");
		
		
		String hour = sdf_hour.format(date);	
		String minute = sdf_minute.format(date);
		String second = sdf_second.format(date);
		
		str = hour + "시:" + minute + "분:" + second + "초";
	
		return str;
	}
}