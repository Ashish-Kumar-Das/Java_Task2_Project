import java.util.*;
public class Fibonacci {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
     int a=-1,b=1,c;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a numbers");
     int n=sc.nextInt();
     System.out.println("fibonacci series");
     for(int i=1;i<=n;i++) {
    	 c=a+b;
    	 System.out.println(c);
    	 a=b;
    	 b=c;
     }
	}

}
