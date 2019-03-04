public class QuickSort implements SortingAlgorithm {

    public void sort(int[] a){
        qs(a,0,a.length-1);
    }

    public void qs (int[] a, int low, int high){
        if(high - low > 1){
            int pivot = partition(a,low,high);
            qs(a,low,pivot-1);
            qs(a,pivot+1,high);
        }
    }


    public int partition(int[] a, int low, int high){
        int pivot = low;
        int i= low+1;
        int j= high;

        while(i<j){
            while(i <= j && a[i] <= a[pivot]){
                i++;
            }
            while(j >= i && a[j] > a[pivot]){
                j--;
            }
            if(i <= j){
                swap(a,i,j);
            }
        } // while
        swap(a,pivot,j);
        return j;
    }

    public void swap(int[]a, int i, int j){  //swaps a[i] with a[j]
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
