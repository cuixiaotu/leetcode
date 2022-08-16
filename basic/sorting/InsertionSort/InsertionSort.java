package basic.sorting.InsertionSort;

import java.util.Arrays;

public class InsertionSort {

    public static void InsertionSort(int[] nums) {
        //自己喜欢从左往右插入
//        for (int i = 1,n = nums.length; i < n; ++i) {
//            for (int j = 0; j < i; ++j) {
//                if ( nums[j] > nums[i] ){
//                    swap(nums,i,j);
//                }
//            }
//        }
        //思路更为清楚的标答  拿出当前值 从右往左比
        for (int i = 1, j, n = nums.length; i < n; ++i) {
            int num = nums[i];
            for (j = i - 1; j >=0 && nums[j] > num; --j) {
                nums[j + 1] = nums[j];
            }
            nums[j + 1] = num;
        }
    }

    private static void swap(int[] nums,int i,int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,7,9,5,8};
        InsertionSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
