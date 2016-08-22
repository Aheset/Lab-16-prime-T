package primeTDD;

public class Main {

	public static void main(String[] args) {
	
	}
	
	public static boolean prime(int i) {
		int number = i/2;
		for (i = 2; i <= number; i++ )
			if (number % i == 0)
		return true;//not prime
		
		{
		return false;}//prime
	}

}
