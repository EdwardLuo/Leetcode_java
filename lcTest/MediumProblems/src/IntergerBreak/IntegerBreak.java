package IntergerBreak;

public class IntegerBreak {
	public int integerBreak(int n){
		if(n==2)
			return 1;
		if(n==3)
			return 2;
		
		int result = 1;
		int remain;
		int m;
		remain = n%3;
		
		m=n/3;
		if(remain == 0)
			result *=(int)Math.pow(3, m);
		else if(remain == 1)
			result *=(int)Math.pow(3, m-1)*4;
		else
			result *=(int)Math.pow(3, m)*remain;
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntegerBreak test = new IntegerBreak();
		System.out.println(test.integerBreak(4));
	}

}
