package ReverseString;

public class ReverseString {

	public String solution(String s){
		char[] ca = s.toCharArray();
		char[] rca = new char[s.length()];
		for(int i=s.length() - 1; i>=0; i--){
			rca[s.length() - i -1] = ca[i];
		}
		
		return new String(rca);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseString s = new ReverseString();
		System.out.println(s.solution("Hello"));
	}

}
