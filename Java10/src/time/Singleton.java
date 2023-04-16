package time;

public class Singleton {
	// 디자인패턴을 싱글턴패턴으로 해서 클래스를 구성(디자인)
	// 싱글턴패턴 : 한번만 객체화를 허용해주되 static으로 객체화를 시켜서 어디서든 자유롭게 사용 가능하게함

	// 생성자를 private으로 해서 일반적인 객체화를 불가능하게함
	private Singleton () {}
	
	private static Singleton instance;
	
	// 객체 멤버변수를 반환해줄 static 메서드 : getInstance()
	public static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
		
	// 멤버변수와 메서드
	private String str;
	public String getStr() {return str;}
	public void setStr(String str) {this.str = str;}  
}
