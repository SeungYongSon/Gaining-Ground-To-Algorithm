import java.util.Arrays;
import java.util.Comparator;

/*
 * https://programmers.co.kr/learn/courses/30/lessons/42577
 */

class C30L42577 {
	
	public boolean solution(String[] phone_book) {		
		Arrays.sort(phone_book, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s1.length() - s2.length();
			}
		});
		
		for(int i = 0; i < phone_book.length; i++) {
			for(int j = 0; j < phone_book.length; j++) {
				if(i != j) {
					if(phone_book[j].length() > phone_book[i].length()) {
						if(phone_book[i].contains(phone_book[j].substring(0, phone_book[i].length()))) 
							return false;
					}else {
						if(phone_book[j].contains(phone_book[i].substring(0, phone_book[j].length()))) 
							return false;
					}
				}
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		C30L42577 c = new C30L42577();
		
		System.out.println(c.solution(new String[] {"113", "12340", "123440", "12345", "98346"}));
	}
}
