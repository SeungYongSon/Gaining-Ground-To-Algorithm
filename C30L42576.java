import java.util.Arrays;

/*
 * https://programmers.co.kr/learn/courses/30/lessons/42576
 */

class C30L42576 {
	public String solution(String[] participant, String[] completion) {
		Arrays.sort(participant, String.CASE_INSENSITIVE_ORDER);
	    Arrays.sort(completion, String.CASE_INSENSITIVE_ORDER);
	    
	    for(int i = 0; i< participant.length -1; i++) {
	    	if(!participant[i].equals(completion[i])){
	    		return participant[i];
	    	}
	    }
	    return participant[participant.length -1];
	}
    
    public static void main(String[] args) {
		C30L42576 s = new C30L42576();
		
		System.out.println(s.solution(new String[]{"leo", "kiki", "eden"}, new String[]{"eden", "kiki"}));
	}
}