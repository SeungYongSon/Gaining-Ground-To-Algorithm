import java.util.Arrays;
import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/10610
 */

class P10610 {
	private char[] c;
	
	void init() {
		Scanner sc = new Scanner(System.in);
		c = sc.nextLine().toCharArray();
		Arrays.sort(c);
		reverse(c);
		sc.close();
	}
	
	private void reverse(char[] A) {
		int idx = 0;
		for (int i = A.length - 1; i >= A.length / 2; i--) {
			char temp = A[i];
			A[i] = A[idx];
			A[idx] = temp;
			idx++;
		}
	}
	
	String calculate() {
		if(c[c.length-1] == '0') {
			int tmp = 0;
			for(char i : c) 
				tmp +=Character.getNumericValue(i);
			if(tmp % 3 == 0)
				return String.valueOf(c);
		}
		return "-1";
	}
	
	public static void main(String[] args) {
		P10610 p = new P10610();
		
		p.init();
		System.out.println(p.calculate());
	}
}
