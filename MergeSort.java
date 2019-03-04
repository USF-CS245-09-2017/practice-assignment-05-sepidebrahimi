public class MergeSort implements SortingAlgorithm {

    public void sort(int[] a) {
        if(a.length > 1){
            int[] left = new int[a.length/2];
            System.arraycopy(a,0,left,0,left.length);
            int[] right = new int[a.length - left.length];
            System.arraycopy(a,left.length,right,0,right.length);
            sort(left);
            sort(right);
            merge(left,right,a);
        }
    }


    public void merge(int[] left, int[] right, int[] a){
        int left_index = 0;
        int right_index = 0;
        int target_index = 0;
        while(left_index < left.length && right_index < right.length){
            if(left[left_index] <= right[right_index]){
                a[target_index++] = left[left_index++];
            }
            else {
                a[target_index++] = right[right_index++];
            }
        }
        while(left_index < left.length){
            a[target_index++] = left[left_index++];
        }
        while(right_index < right.length){
            a[target_index++] = right[right_index++];
        }

    }//mergeSort

}
