package codeit_preperation;
// code written by Altaf ;
// largest element in Array;
public class Largest_no_in_array {
	public static void main(String[] args) {
		
		int arr[] = {10,13,15,17,4}; int temp;
		for(int i=0; i<=arr.length; i++) {
			
			for(int j=0; j<arr.length-1; j++) {
				 if(arr[j] > arr[j+1]) {
					 temp=arr[j];
					 arr[j]=arr[j+1];
					 arr[j+1]=temp;
				 }
			}
		}
		
			System.out.println(arr[arr.length-1]);
		

	}

}
