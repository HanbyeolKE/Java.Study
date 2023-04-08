package extend;

public class Ex5 {
	public static void main(String[] args) {
		MyStr str1 = new MyStr("hello");
		str1.printStr();
		Deco str2 = new Deco("hi");
		str2.printStr();
	}
}

class MyStr{
	protected String str;

	public MyStr(String str) {
		super();
		this.str = str;
	}
	
	public String getStr() {
		return str;
	}
	
	public void setStr(String str) {
		this.str = str;
	}
	
	public void printStr() {
		System.out.println(str);
	}
}


// MyStr 클래스를 상속받고 출력이 좀 더 꾸며진 채로 출력될 수 있게 변경

class Deco extends MyStr{
	
	public Deco(String str) {
		super(str);
		// TODO Auto-generated constructor stub
	}

	public void printStr() {
		
		System.out.println("==" + str + "==");
	}
}