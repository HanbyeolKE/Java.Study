package condition;

public class Ifelse2 {
	public static void main(String[] args) {
	int num = 99;
	
	// 10보다 작은지, 100보다 작은지, 1000보다 작은지, 1000이상인지
	// if만 쓰기 
	if(num < 10) {
		System.out.println(" 10 보다 작다");
	}
	else if (num < 100) {
		System.out.println(" 100 보다 작다");
	}
	else if (num < 1000) {
		System.out.println(" 1000 보다 작다");
	}else {
		System.out.println(" 그 밖에");
	}
	
	System.out.println("====================");
	// if 와 관계연산자 사용
	if(num >= 10 && num < 100) {
		System.out.println("10 이상이고 100 미만이다");
	}
	if (num >= 100 && num < 1000) {
		System.out.println("100 이상 1000 미만");
	}
	}
}
