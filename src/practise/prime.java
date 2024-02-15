import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n= 10;
		printNum(n);

	}
	static void printNum(int n){
		int count =0;
		for(int i=2;count<n;i++) {
			if(isprime(i)) {
				System.out.print(i+" ");
				count++;
			}
		}
	}
	
	 static boolean isprime(int n) 
	 {
		for(int i=2;i*i<=n;i++) 
		{
			if(n%i==0) 
			{
				return false;
			}
		 
		}
			return true;

}  }