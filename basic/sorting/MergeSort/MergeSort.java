package basic.sorting.MergeSort;

import java.util.Arrays;

public class MergeSort {

    public static void MergeSort(int[] nums) {
        //自顶向下归并

        //自底往下归并


    }

    private static void swap(int[] nums,int i,int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,7,9,5,8};
        MergeSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
