import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int f=1;
		while(n>=1) {
			f=f*n;
			n--;
		}
		System.out.println("Factorial number is"+f);
	}

}
