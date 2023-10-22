package array;

public class arrayProblemsPart_I {

	public static void leadersInArray(int arr[]) {
		for(int i=0; i<arr.length-1; i++) {
			boolean flag = true;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] < arr[j]) {
					flag = false;
				}
			}
			if(flag == true) {
				System.out.print(arr[i] + " ");
			}
		}
	}
	public static void main(String[] args) {
		int[] arr = {2, 7, 6, 3, 4, 1};
		leadersInArray(arr);
	}

}
