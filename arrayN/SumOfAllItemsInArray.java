package arrayN;

public class SumOfAllItemsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={7,5,13,15,17};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		System.out.println("Sum of all the elements in an array:" +sum);
		}		

	}
