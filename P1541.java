import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/1541
 */

class P1541 {
	private char[] mathematicalExpression;
	
	void init() {
		Scanner s = new Scanner(System.in);
		mathematicalExpression = s.nextLine().toCharArray();
		s.close();
	}
	
	int calculate() {
		int result = 0;
		int tmp = 0;
		int lNumPoint = -1;
		int fNumPoint = -1;
		boolean isFirstMinus = true;
		
		StringBuffer num = new StringBuffer();
		
		for(int i = 0; i< mathematicalExpression.length; i++) {
			if(mathematicalExpression[i] != '+' && mathematicalExpression[i] != '-') {
				if(fNumPoint == -1 && lNumPoint == -1) {
					lNumPoint = i;
					fNumPoint = i;
				}else {
					lNumPoint++;	
				}
			}else {
				while(fNumPoint <= lNumPoint)
					num.append(mathematicalExpression[fNumPoint++]);
				
				lNumPoint = -1;
				fNumPoint = -1;
				
				tmp += Integer.parseInt(num.toString());
				num.delete(0, num.length());
				
				if(mathematicalExpression[i] == '-') {
					if(isFirstMinus) {
						result += tmp;
						isFirstMinus = false;
					}else result -= tmp;
					tmp = 0;
				}
			}
		} 
		
		while(fNumPoint <= lNumPoint)
			num.append(mathematicalExpression[fNumPoint++]);

		tmp += Integer.parseInt(num.toString());
		
		if(!isFirstMinus) result -= tmp;
		else result += tmp;
		
		return result;
	}
	
	public static void main(String[] args) {
		P1541 p = new P1541();
		
		p.init();
		System.out.println(p.calculate());
	}
}
