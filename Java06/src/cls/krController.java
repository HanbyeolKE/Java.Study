package cls;

public class krController {
	public static void main(String[] args) {
		// 객체화
		krMode1 km1 = new krMode1();
		krMode1 km2 = new krMode1();
	
		
		km1.setNum(111);
		km1.setStr("안녕");
		
		km2.setNum(222);
		km2.setStr("반갑");
		
		krService ks = new krService();		// 꾸며주기 클래스
		krView1 kv = new krView1();
		
		kv.printStr(km1);
		kv.printStr(km2);
		
		ks.decoEquals(km1);
		ks.decoPlus(km2);
		
		kv.printStr(km1);
		kv.printStr(km2);
		

	}
}

// krMode1 클래스 (num, str / 메서드 : get, set)

// krView 클래스 (출력용)

class krMode1{
	
	int num;
	String str;
	
	void setNum(int num) {
		this.num = num;
	}
	
	void setStr(String str) {
		this.str = str;
	}
	
	int getNum() {
		return num;
	}
	
	String getStr() {
		return str;
	}
}

class krView1{
	
	void printNum(krMode1 km) {
		System.out.println(km.str);
	}
	
	void printStr(krMode1 km) {
		System.out.println(km.str);
	}
}

// krService 클래스 (자바기능)
class krService{
	// 출력하기 전에 꾸며주기
	void decoEquals(krMode1 km) {
		// 양 옆에 == 표시
		km.setStr("==" +km.getStr()+ "==");		// 문자열을 가져온다음 == 를 붙여서 저장
	}
	
	void decoPlus(krMode1 km){
		// 앞옆에 + 표시
		//km.setStr("+" + km.getStr() + "+")	// 문자열을 가져온 다음 + 붙여서 저장
		km.str = "+" + km.str + "+";
		
	}
}