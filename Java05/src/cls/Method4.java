package cls;

public class Method4 {
	public static void main(String[] args) {
		MyClass7 mc7 = new MyClass7();
		System.out.println("" +mc7.나누기(2,0));
	}
}

class MyClass7{
	
	int num;
	String str;
	
	// 더하기
	int 더하기(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
	
	// 빼기 
	int 빼기(int num1, int num2) {
		return num1 - num2;
	}
	
	// 곱하기
	int 곱하기(int num1, int num2) {
		return num1 * num2;
	}
	
	// 나누기
	int 나누기(int num1, int num2) {
		int result = 0;
		if(num2 == 0) {
			return result;
		}
		else{
			return num1 / num2;
		}
	}
	
	// % 기호 안쓰고 나머지 구하기 만들어보기
	int 나머지구하기(int num1, int  num2) {
		// 나머지 구하기
		// 방법1
		// int result = num1 - ((num1/num2)*num2);
		
		// 방법2
//		result = num1;
//		while(true) {
//			if(result < num2) {
//				break;
//			}
//			result -= num2;
		return 0;
		}
		
	}

