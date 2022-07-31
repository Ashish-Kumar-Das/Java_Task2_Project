
public class MirrorInverse {
	static boolean isMirrorInverse(int arr[])
    {
        for (int i = 0; i < arr.length; i++) {
 
            // If condition fails for any element
            if (arr[arr[i]] != i)
                return false;
        }
 
        // Given array is mirror-inverse
        return true;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Java implementation of the approach
	
			
			// Driver code
		
			{
				int arr[] = { 1, 2, 3, 0 };
				if (isMirrorInverse(arr))
					System.out.println("Yes");
				else
					System.out.println("No");
			}
		}


	}


