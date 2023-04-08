package extend;

public class Ex4 {
	public static void main(String[] args) {
		Starbucks cafe1 = new Starbucks("본점", 123);
		cafe1.printMenu();
		Bupyeong cafe2 = new Bupyeong("부평점", 234); 
		cafe2.printMenu();
		Gangnam cafe3 = new Gangnam("강남점", 345);
		cafe3.printMenu();
	}
}

// 스타벅스
class Starbucks{
	protected String location;
	protected String menu[] = new String[3];
	protected int money;
	
	public Starbucks(String location, int money) {
		this.location = location;
		this.money = money;
		setMenu();
	}
	
	public void setMenu() {
		menu[0] = "capuchino";
		menu[1] = "cafelatte";
		menu[2] = "orangejuice";
	}
	
	public void printMenu() {
		System.out.println(location+" 의 메뉴판");
		for(int i = 0; i < menu.length; ++i) {
			System.out.println(menu[i] + " ");
		}
		System.out.println();
		
	}
	
}
//스타벅스 부평점
class Bupyeong extends Starbucks{
	
	public Bupyeong(String location, int money) {
		super(location, money);
		this.location = location;
		this.money = money;
		setMenu();
	}
	
	public void setMenu() {
		menu[0] = "choco capuchino";
		menu[1] = "cafelatte";
		menu[2] = "espresso";
	}
	
	public void printMenu() {
		System.out.println(location+" 의 메뉴판");
		for(int i = 0; i < menu.length; ++i) {
			System.out.println(menu[i] + " ");
		}
		System.out.println();
		
	}
}

// 스타벅스 강남점
class Gangnam extends Starbucks{
	
	public Gangnam(String location, int money) {
		super(location, money);
		this.location = location;
		this.money = money;
		setMenu();
	}
	
	public void setMenu() {
		menu[0] = "ice americano";
		menu[1] = "calamel machiyatto";
		menu[2] = "espresso prapuchino";
	}
	
	public void printMenu() {
		System.out.println(location+" 의 메뉴판");
		for(int i = 0; i < menu.length; ++i) {
			System.out.println(menu[i] + " ");
		}
		System.out.println();
		
	}
}
