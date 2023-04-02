package cls;

public class Class7 {
	public static void main(String[] args) {
		// 객체화
		Human hm = new Human();
		HumanView hv = new HumanView();
		
		hm.setName("홍길동");
		hm.setGender("남자");
		hm.setAge(22);
		
		hv.printInfo(hm);
	}
}

// 멤버변수 private
// 메서드 public
class Human{
	// 데이터 : name, gender, age
	private String name;
	private String gender;
	private int age;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public String getGender() {
		return gender;
	}
	public int getAge() {
		return age;
	}
}	

class HumanView{
	public void printInfo(Human hm ) {
		System.out.println("== " + hm.getName() + " " + hm.getGender() + " " + hm.getAge() +  " ==");
	}

}