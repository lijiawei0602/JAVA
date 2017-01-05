package work;

//import org.omg.CORBA.PUBLIC_MEMBER;

public class Main_random {
	
	public static int linearSearch(int[] list , int key){
		for(int i = 0; i<list.length; i++){
			if(key == list[i]){
				return i;
			}
		}
		return -1;
	}
	
	public static int binarySearch(int[] list , int key){
		int low = 0;
		int high = list.length - 1;
		
		while(high >= low){
			int mid = (high + low) / 2 ;
			if(key < list[mid]){
				high = mid - 1;
			}
			else if(key == list[mid]){
				return mid;
			}
			else
				low = mid + 1;
		}
		return -low - 1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[100000];
		
		for(int i = 0; i< arr.length; i++){
			arr[i] = new java.util.Random().nextInt(100000) + 1;
		}
		
		int k = new java.util.Random().nextInt(100000) + 1;
		
		long startTime1 = System.nanoTime();
		linearSearch(arr ,k);
		long endTime1 = System.nanoTime();
		long executionTime1 = endTime1 - startTime1;
		
		long startTime2 = System.nanoTime();
		java.util.Arrays.sort(arr);
		binarySearch(arr, k);
		long endTime2 = System.nanoTime();
		long executionTime2 = endTime2 - startTime2;
		
		System.out.println(executionTime1);
		System.out.println(executionTime2);
	}

}
