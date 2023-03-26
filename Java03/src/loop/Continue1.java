package loop;

public class Continue1 {
	public static void main(String[] args) {
		// continue : 반복문의 시작점으로 돌아감, ()로 돌아감, 밑에 코드를 무시하고 위로 올라감
		
		int i = 0;
		while(i < 10) {
			i++;
			if(i % 2 == 1) {
				continue;
				}
			System.out.println("while : " + i);
			
		}
		for(int j=0; j < 0; j++) {
			System.out.println("for : " + i);
		}
	}
}
