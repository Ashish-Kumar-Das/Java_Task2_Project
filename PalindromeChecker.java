
public class PalindromeChecker {
   
	 public static boolean isBoolean(String str) {
		StringBuilder sb=new StringBuilder(str);
		sb.reverse();
		String rev=sb.toString();
		if(str.equals(rev)) {
			return true;
		}
		else {
			return false;
		}
		 
		 
	 }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(PalindromeChecker.isBoolean("jqitin"));
		

	}

}
