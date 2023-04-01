package cls;

public class Method5 {
	public static void main(String[] args) {
		
	}
}

class MyClass9{
	// 클래스 : 변수와 함수를 묶어놓은 것
	// 변수 ==> 멤버변수
	// 함수 ==> 메서드
	String str;		// 클래스에 있는 변수는 '클래스 멤버변수' 라고 한다
	
	void func() {}		// 클래스에 있는 함수는 '메서드' 라고 한다
	
	// 클래스 기원 : 초보자를 위해서(초보자에게 코드를 교육하지 않고 사용하게 하기 위해서)
	void setStr(String a_str) {
		// str 변수에 값을 담는 함수
		str = a_str;
	}
	
	String getStr() {
		// str 변수를 사용하는 함수
		return str;
	}
}