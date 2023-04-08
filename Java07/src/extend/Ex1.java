package extend;

public class Ex1 {
	public static void main(String[] args) {
		Human 홍씨 = new Human("홍길동", 16);
		홍씨.말하기();
		홍씨.밥먹기();
		홍씨.걷기();
		
		HumanEx 박씨 = new HumanEx("박첨지", 18);
		박씨.밥먹기();
		박씨.말하기();
		박씨.걷기();
		
		HumanDeco 이씨 = new HumanDeco("이순신", 20);
		이씨.밥먹기();
		이씨.말하기();
		이씨.걷기();
		이씨.나이정보();
		// 이때, 원본에 버그가 발생해서 수정해야 하면?
		// 1번 작업 필요 => 3번 작업 필요
		// 실수를 할 확률이 높아짐
		
		// ==> 문제 발생 원인 : 복사붙여넣기를 했기 때문에 
		// ==> '사람'이 복사붙여넣기를 했기때문에
		// ==> 컴퓨터가 알아서 붙여넣기하게 하자(상속)
		
	}
}

// 사람(Human) 클래스
class Human{
	// name, age
	private String name;
	private int age;

	
	// 생성자로 정보채워넣기
	Human(String name, int age){
		this.name =name;
		this.age = age;

	}
	
	// 말하기 ,걷기 , 밥먹기
	public void 말하기() {
		System.out.println(name+"(이)가 말합니다.");
	}
	
	public void 걷기() {
		System.out.println(name+"(이)가 걷습니다.");
	}
	
	public void 밥먹기() {
		System.out.println(name+"(이)가 밥먹습니다.");
	}
}

//사람(Human) 클래스에서 이름 옆에 나이 추가
class HumanEx{
	// name, age
	private String name;
	private int age;


	
	// 생성자로 정보채워넣기
	HumanEx(String name, int age){
		this.name =name;
		this.age = age;


	}
	
	// 말하기 ,걷기 , 밥먹기, 나이정보
	public void 말하기() {
		System.out.println(name+"("+age+"세)(이)가 말합니다.");
	}
	
	public void 걷기() {
		System.out.println(name+"("+age+"세)(이)가 걷습니다.");
	}
	
	public void 밥먹기() {
		System.out.println(name+"("+age+"세)(이)가 밥먹습니다.");
	}

}

class HumanDeco{
	// name, age
	private String name;
	private int age;
	
	// 생성자로 정보채워넣기
	HumanDeco(String name, int age){
		this.name =name;
		this.age = age;


	}
	
	// 말하기 ,걷기 , 밥먹기
	public void 말하기() {
		System.out.println("=="+name+"=="+"("+age+"세)(이)가 말합니다.");
	}
	
	public void 걷기() {
		System.out.println("=="+name+"=="+"("+age+"세)(이)가 걷습니다.");
	}
	
	public void 밥먹기() {
		System.out.println("=="+name+"=="+"("+age+"세)(이)가 밥먹습니다.");
	}
	
	public void 나이정보() {
		System.out.println("=="+name+"=="+"의 나이는 "+age+"세 입니다.");
	}
	
}