package loop;

public class While2 {
	public static void main(String[] args) {
		// 반복문 : 유사한 코드를 자동 수행하기 위해
		
		// while은 설계가 필요하다
		// 10000번만 수행할수 있도록
		int i = 0;
		// 샘플로 3번
		while(i < 16) {
			// 반복 수행할 코드
			System.out.println("반갑습니다!");
			i++;
		}
		
		// while 을 사용하려면
		// 플래그 변수가 필요, 조건식 세우기, while 안에서 플래그의 값을 증감
		
		// 퀴즈 : while 문을 사용해서 반갑습니다 15번을 해주세요
		
		
	}
}
