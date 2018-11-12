import java.util.ArrayList;
import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/11729
 */

class P11729 {

	private int n;
	private int moveNum = 0;
	private ArrayList<Integer> from = new ArrayList<Integer>();
	private ArrayList<Integer> to = new ArrayList<Integer>();
	
	void setNandStart(){
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		s.close();
		
		move(n, 1, 2, 3);
	}
	
	void move(int n, int from, int by, int to) {
	    if (n == 1){
			this.from.add(from);
			this.to.add(to);
	    }
	    else{
	    	move(n - 1, from, to, by);
			this.from.add(from);
			this.to.add(to);
	        move(n - 1, by, from, to);
	    }
		moveNum++;
	}
	
	void print() {
		System.out.println(moveNum);
		for(int i = 0; i < moveNum; i++) 
			System.out.println(from.get(i) + " " + to.get(i));
	}
	
	public static void main(String[] args) {
		P11729 p = new P11729();
		
		p.setNandStart();
		p.print();
	}
}
