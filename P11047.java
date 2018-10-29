import java.util.ArrayList;
import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/11047
 */

class P11047 {
	private Scanner s = new Scanner(System.in);
	private ArrayList<Integer> coins = new ArrayList<Integer>();
	private int N;
	private int K;

	void setCoins() {
		for(int i = 0; i < this.N; i++)
			this.coins.add(this.s.nextInt());
	}
	
	void setCoinN() {
		this.N = this.s.nextInt();
	}
	
	void setSumK() {
		this.K = this.s.nextInt();
	}
	
	int calculate() {
		int coinCountMin = 0;
		int tmp;
		
		tmp = this.K;
		for(int i = coins.size() - 1; i >= 0; i--) {
			if(coins.get(i) <= tmp) {
				while((tmp / coins.get(i)) != 0) {
					tmp -= coins.get(i);
					coinCountMin++;
				}
			}
		}
		return coinCountMin;
	}
	
	public static void main(String[] args) {
		P11047 c = new P11047();
	
		c.setCoinN();
		c.setSumK();
		c.setCoins();
		
		System.out.println(c.calculate());
	}
}
