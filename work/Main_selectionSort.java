package work;

public class Main_selectionSort {
	
	public static void selectionSort(double[] list){
		for(int i = 0; i<list.length - 1; i++){
			int k =i;
			for(int j = i+1; j < list.length; j++){
				if(list[k] > list[j])
					k = j;
			}
			if(k != i){
				double t = list[k];
				list[k] = list[i];
				list[i] = t;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] arr = {1,9,8,6,5,4,3,7,10,6};
		selectionSort(arr);
		for(int i =0;i<arr.length; i++){
			System.out.println(arr[i]);
		}
	}
}