import java.util.*;
public class PermutationCombination {
	static long factorial(int num) {
		int f=1;
		for(int i=1;i<=num;i++) {
			f*=1;
		}
		return f;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the value of n");
      int n=sc.nextInt();
      System.out.println("Enter the value of r");
      int r=sc.nextInt();
      int p= (int)((int)(factorial(n))/factorial(n-r));
      int c=(int) ((int)(factorial(n))/(factorial(n-r))*(factorial(r)));
      System.out.println("permutation ="+p);
      System.out.println("combination ="+c);
	}

}
