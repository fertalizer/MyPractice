
public class ThreeSortDemo {

	public static void main(String[] args) {
		
		int N = 100000;
		int[] A = new int[N];
		
		for(int i = 0;i < A.length;i++) {
			
			A[i] = (int) (Math.random() * N * 10);
			
			//System.out.printf("%4d",A[i]);
			
		}
		double t0 = System.nanoTime() / 1e6;
		SelectionSort(A);
		double t1 = System.nanoTime() / 1e6;
		InsertionSort(A);
		double t2 = System.nanoTime() / 1e6;
		BubbleSort(A);
		double t3 = System.nanoTime() / 1e6;
		
		double[] Time = {t1 - t0, t2 - t1, t3 - t2};
		String[] Word = { "SelectionSort is ", "InsertionSort is ", "BubbleSort is "};
		
		
		System.out.printf("N = %d, timecost is shown as below.\n",N);
		
		for(int i = 0;i < Time.length;i++) {
			System.out.printf("%s%f ms\n", Word[i], Time[i] );			
		}
		
		
	}

	public static void SelectionSort(int[] A) {
		for(int i = 0;i < A.length;i++) {
			//minimum number position.
			int k = i;
			for(int j = i+1;j < A.length;j++) {
				if(A[k] > A[j]) 
					k = j;//new minimum number position.
			}
			//Move the minimum number to first position.
			int temp = A[k];
			A[k] = A[i];
			A[i] = temp;
		}	
	}	
	public static void InsertionSort(int[] A) {
		for(int i = 1;i < A.length;i++) {
			int temp = A[i]; //Extract a element.
			for(int j = i - 1;j >= 0 ;j--) {
				if(temp < A[j]) {
					//move element to the right by 1.
					A[j+1] = A[j];
					A[j] = temp;
				}
			}		
		}
	}
	public static void BubbleSort(int[] A) {
		for(int i = 0;i < A.length;i++) {
			for(int j = 0;j < A.length-1;j++) {
				if(A[j] > A[j+1]) {
					int temp = A[j+1];
					A[j+1] = A[j];
					A[j] = temp;
					//swap left element and right element.
				}
			}		
		}		
	}
	
	
	
}
