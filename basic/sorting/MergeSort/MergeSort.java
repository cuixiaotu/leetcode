package basic.sorting.MergeSort;

import java.util.Arrays;

public class MergeSort {

    private static int[] tmp = new int[100010];

    public static void MergeSort(int[] nums, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = (left + right) >> 1;
        MergeSort(nums, left, mid);
        MergeSort(nums, mid + 1, right);
        int i = left, j = mid + 1, k = 0;
        while (i <= mid && j <= right) {
            if (nums[i] <= nums[j]) {
                tmp[k++] = nums[i++];
            } else {
                tmp[k++] = nums[j++];
            }

        }
        while (i <= mid) {
            tmp[k++] = nums[i++];
        }
        while (j <= right) {
            tmp[k++] = nums[j++];
        }
        for (i = left, j = 0; i <= right; ++i, ++j) {
            nums[i] = tmp[j];
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 7, 9, 5, 8};
        MergeSort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }
}
