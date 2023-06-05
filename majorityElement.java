package majority_element;


import java.util.Scanner;j

public class MajorityElement {
	
	static int majorityElement(int size,int arr[]) {
		int x = (int) Math.floor((size/2));
		
		
	    for(int i=0;i<size;i++) {
	    	int count =0;
	    	for(int j=0;j<size;j++) {
	    		
	    			if(arr[i]==arr[j]) {
	    				count++;
	    			}
	    		
	    		
	    	}
	    	if(count>x) {
	    		return arr[i];
	    	}
	    }
	    
	    return 0;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements:-");
		
		for(int i=0;i<n;i++) {
			System.out.print("arr["+i+"]=");
			arr[i]=sc.nextInt();
			
			
		}
		
		int ans = majorityElement(n,arr);
		
		if(ans==0) {
			System.out.println("No majority element found");
		}
		else {
			System.out.println("Majority element is: "+ ans);
			
		}
		
		

	}

}
