import java.util.Scanner;

public class binaryToDecimal {
    private static void bintodec(int a) {
		int pow=0;
		int dec=0;
		while(a>0) {
			int decimal=a%10;
			dec=dec+(decimal*(int)Math.pow(2, pow));
			pow++;
			a=a/10;
		}
		System.out.println(dec);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Binary number");
        int a=sc.nextInt();
        bintodec(a);
    }
}


	
	
