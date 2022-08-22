package basic.sorting.HeapSort;

import java.util.Arrays;

public class HeapSort {

    public static void main(String[] args) {
        int[] nums = {1,2,7,9,5,8};
        heapSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void heapSort(int[] nums) {
        int n = nums.length;
        //构建堆
        for (int k = (n-1)/2; k >=0 ; k--) {
            sink(nums, k, n);
        }
        for(int i = n - 1; i > 0; i--) {
            swap(nums, 0, i);
            sink(nums, 0, i);
        }
    }

    //堆的下沉方法
    private static void sink(int[] nums ,int k,int n ) {
        int j = 2*k + 1;
        while (j < n){
            if (j+1<n && nums[j+1] < nums[j]){
                j++;
            }
            if (nums[j]>nums[k]){
             break;
            }
            swap(nums, k ,j);
            k = j;
            j = 2*k + 1;
        }
    }

    private static void swap(int[]nums,int i ,int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

}
