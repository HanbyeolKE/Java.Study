package varalbe;

public class var2 {
	public static void main(String[] args) {
		// 변수(프로그래밍) : 데이터 값을 저장해놓는 공간 (저장공간)
		// 변수(수학) : 변할 수 있는 수 ex) x, y, z
		
		//java 가 변할 수 있기 때문에 변수에다가 저장
		String var1 = "Java";		// var1 공간 생성 후 Java 데이터 넣음
		
		System.out.println("Hello" + var1 + "!");
		
		System.out.println(var1 + "is simple!");
		System.out.println("안녕하세요!");
		System.out.println("반갑습니다!");
		System.out.println(var1 + "를 공부합니다!");
		
		System.out.println(34-2);
		// 개발자가 32를 의도한건지, 34-2 글자 그 자체를 의도한건지 컴퓨터는 알 수가 없음
		// 사용자의 으도를 명확하게 나타내기 위해 변수에 '자료형' 개념 추가
		}
}
