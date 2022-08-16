package basic.sorting.ShellSort;

import java.util.Arrays;

public class ShellSort {

    public static int[] ShellSort(int[] nums) {
        int n = nums.length;
        for (int gap = n/2; gap >0 ; gap/=2) {//步长为2，每次切两半
            for (int i = gap; i < n; i++) { //从切割位开始
                int key = nums[i];
                int j = i;
                while (j >= gap && nums[j-gap] > key){
                    nums[j] = nums[j-gap];
                    j -= gap;
                }
                nums[j] = key;
            }
        }
        return nums;
    }



    private static void swap(int[] nums, int i, int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,7,9,5,8};
        int[] newNums = ShellSort(nums);
        System.out.println(Arrays.toString(newNums));
    }
}
