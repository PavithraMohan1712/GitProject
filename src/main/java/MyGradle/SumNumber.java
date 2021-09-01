package MyGradle;

public class SumNumber {
	public int sum(int a,int b) {
		if(a>=10)
			throw new IllegalArgumentException("value should be less than 10");
			return a+b;
	}

}
