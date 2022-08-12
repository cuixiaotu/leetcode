package basic.sorting.SelectionSort;

import java.util.Arrays;

public class SelectionSort {

    public static void SelectionSort(int[] nums) {
        for (int i = 0,n = nums.length; i < n-1 ; ++i) {
            int minIndex = i;
            for (int j = i; j < n; ++j) { //两两对比 记录最小的那个
                if ( nums[minIndex] > nums[j] ){
                    minIndex = j;
                }
            }
            swap(nums,minIndex,i);
        }
    }

    private static void swap(int[] nums,int i,int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,7,9,5,8};
        SelectionSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
