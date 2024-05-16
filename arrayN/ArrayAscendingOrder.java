package arrayN;

public class ArrayAscendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] ={5, 2, 8, 7, 1};
		int temp=0,i,j;
		System.out.println("Element of original array: ");
		for(i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
			
		}
		for(i=0; i<arr.length; i++ ) {
			for(j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
				temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
			}
		}
	}
		System.out.println("Elements of array sorted in ascending order");
		for(i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
}
}
