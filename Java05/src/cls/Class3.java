package cls;

public class Class3 {
	public static void main(String[] args) {
		
		Car 아빠 = new Car();
		Car 엄마 = new Car();
		Car 나 = new Car();
		
		아빠.차종 = "벤츠 E class ";
		아빠.차색상 = "검정색";
		아빠.차주인 = "아빠";
		아빠.차정보();
		
		엄마.차종 = "현대 소나타";
		엄마.차색상 = "하얀색";
		엄마.차주인 = "엄마";
		엄마.차정보();
		
		나.차종 = "볼보 XC90";
		나.차색상 = "검정색";
		나.차주인 = "나";
		나.차정보();
				
		// 값을 안담고 사용하면 버그 발생
	}
}

// class 자동차
// 데이터 : 차주인, 차종, 차 색상
// 기능 : 차정보(주인이 누구인지, 차종은 무엇인지, 차종은 무엇인지 안내해주는 출력)
class Car{
	
	String 차주인;
	String 차종;
	String 차색상;
	
	void 차정보() {
		System.out.println(차주인 + "가 차주인" + " " + 차색상 + " " + 차종);
	}
}