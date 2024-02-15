import java.util.Scanner;

public class decimalToBinary {
    private static void dectobinary(int a) {
		String n="";
		while(a>0) {
			int binary=a%2;
			n=n+""+binary;
			a=a/2;
		}
		System.out.print(n);
	}
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Decimal number");
		int a=sc.nextInt();
		dectobinary(a);
	}
}
