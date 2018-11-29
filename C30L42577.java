/*
 * https://programmers.co.kr/learn/courses/30/lessons/42577
 */

class C30L42577 {
	
	public boolean solution(String[] phone_book) {		
		for(int i = 0; i < phone_book.length -1; i++) {
			for(int j = i + 1; j < phone_book.length; j++) {
				if(phone_book[i].startsWith(phone_book[j])) return false;
				if(phone_book[j].startsWith(phone_book[i])) return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		C30L42577 c = new C30L42577();
		
		System.out.println(c.solution(new String[] {"113", "12340", "123440", "12345", "98346"}));
	}
}
