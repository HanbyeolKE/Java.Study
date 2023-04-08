package extend;

// Imp1 : 구현부
public class PhoneImp1 {
	public static void main(String[] args) {
		Phone2G ph1 = new Phone2G();
		Phone3G ph2 = new Phone3G();
		Phone4G ph3 = new Phone4G();
		Phone5G ph4 = new Phone5G();
		System.out.println("2G");
		ph1.call();
		ph1.msg();
		System.out.println("3G");
		ph2.call();
		ph2.msg();
		ph2.internet();
		System.out.println("4G");
		ph3.call();
		ph3.msg();
		ph3.internet();
		ph3.fast();
		System.out.println("5G");
		ph4.call();
		ph4.msg();
		ph4.internet();
		ph4.fast();
		ph4.BigData();
	}
}

class Phone2G implements Phone{

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("전화를 합니다.");
	}

	@Override
	public void msg() {
		// TODO Auto-generated method stub
		System.out.println("문자를 합니다.");
	}
	// 전화 + 문자

}

class Phone3G implements Phone{

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("전화를 합니다.");

	}

	@Override
	public void msg() {
		// TODO Auto-generated method stub
		System.out.println("문자를 합니다.");

	}
	// 전화 + 문자 + 인터넷
	public void internet() {
		// TODO Auto-generated method stub
		System.out.println("인터넷를 합니다.");
	}

}

class Phone4G implements Phone{

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("전화를 합니다.");
	}

	@Override
	public void msg() {
		// TODO Auto-generated method stub
		System.out.println("문자를 합니다.");

	}

	public void internet() {
		// TODO Auto-generated method stub
		System.out.println("인터넷를 합니다.");
	}

	public void fast() {
		// TODO Auto-generated method stub
		System.out.println("속도가 빠릅니다.");
	}
	// 전화 + 문자 + 인터넷 + 속도

}

class Phone5G implements Phone{

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("전화를 합니다.");
	}

	@Override
	public void msg() {
		// TODO Auto-generated method stub
		System.out.println("문자를 합니다.");

	}
	// 전화 + 문자 + 인테넷 + 속도 + 빅데이터

	public void internet() {
		// TODO Auto-generated method stub
		System.out.println("인터넷를 합니다.");

	}

	public void fast() {
		// TODO Auto-generated method stub
		System.out.println("속도가 빠릅니다.");

	}

	public void BigData() {
		// TODO Auto-generated method stub
		System.out.println("빅데이터를 사용합니다");
	}
}
