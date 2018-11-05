import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/2875
 */


class P2875 {
	private Scanner s = new Scanner(System.in);
	private int N;
	private int M;
	private int K;
	
	void init(){
		N = s.nextInt();
		M = s.nextInt();
		K = s.nextInt();
	}
	
	int calculate() {
		int teamNum = 0;
		
		while(true) {
			if(N - 2 >= 0 && M - 1 >= 0 && N + M >= K + 3) {
				N -= 2;
				M -= 1;
				teamNum++;
			}else {
				break;
			}
		}
		
		return teamNum;
	}
	
	public static void main(String[] args) {
		P2875 p = new P2875();
		
		p.init();
		System.out.println(p.calculate());
	}
}
