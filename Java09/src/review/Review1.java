package review;

public class Review1 {
	// 자바 1
	// 변수, 자료형, 연산자, 조건문, 반복문 , 클래스, 메서드, 접근권한제어자, 캡슐화, this, 생성자, 인터페이스, 추상클래스
	public static void main(String[] args) {
		// 다른 클래스의 내용을 사용하기 위해선 '객체화'라는 작업이 필요
		// 객체를 통해서 사용
		// 클래스명 객체명 = new 생성자명();
		MyClass1 mc = new MyClass1();
		
		mc.myMethod();
		
	}
}

class MyClass1{
	// 변수와 자료형
	String str;			// 변수 선언(공간 생성)
	int num;			// 변수 초기화(공간 생성 + 처음값 대입)
	double dnum;
	private boolean bool;
	
	// 메서드
	public int myMethod() {
		// 변수 대입
		str = "Hello";			// 멤버변수
		String str = "World";	// 지역변수
		
		this.str = this.str + str;
		
		
		for(int i = 0; i < 3; ++i) {
			if(this.str != null || !(this.str.equals(""))) {
				System.out.println(this.str);
			}
		}
		return 0;		// return은 함수의 자료형과 맞춰준다
	}
}


class MyClass2 extends MyClass1{
	// MyClass1의 내용이 복붙되어있음
	// 추가
	
}