package array;

public class arrayBasics {
	
	public static void search (int arr[], int key) {
		for( int i=0; i<arr.length; i++ ) {
			if(arr[i] == key) {
				System.out.print(key + " is index " + i);
				return;
			} else if(i == arr.length-1) {
				System.out.print(key + " is not found");
				return;
			}
		}
	}
	public static int delete (int arr[], int key) {
		int i=0;
		for( ; i<arr.length; i++ ) {
			if(arr[i] == key) {
				break;
			} 
		}
		if(i == arr.length) return arr.length;
		for(; i<arr.length-1; i++) {
			arr[i] = arr[i+1];
		}
		return arr.length-1;
		
	}
	public static int largestEle (int arr[]) {
		int max = 0, i=0;
		for(; i<arr.length; i++) {
			if(arr[i] >= arr[max]) {
				max = i;
			}
		}
		return arr[max];
	}
	public static int secondLargestEle (int arr[]) {
		int maxInd = 0, secMaxInd = -1, i = 1;
		if(arr.length < 2 || secMaxInd == -1) return -1;
		for(; i<arr.length; i++) {
			if(arr[i] > arr[maxInd]) {
				secMaxInd = maxInd;
				maxInd = i;
			} else if(arr[i] < arr[maxInd]) {
				if(secMaxInd == -1 || arr[i] > arr[secMaxInd]) {
					secMaxInd = i;
				}
			}  
		}
		return arr[secMaxInd];
	}
	public static int removeDuplicate(int arr[]) {
		int index = 0;
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i] == arr[i+1]) {
				arr[i] = arr[i+1];
				index++;
			}
		}
		if(index == 0) return arr.length;
		return index;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 1, 1};
		int key = 1;
//		search(arr, key);
//		delete(arr, key);
//		for(int i=0; i<delete(arr, key); i++) {
//			System.out.print(arr[i] + " ");
//		}
//		System.out.println("largest element is: " + largestEle(arr));
//		System.out.println(" Second largest element is: " + secondLargestEle(arr));
		for(int i=0; i<removeDuplicate(arr); i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
