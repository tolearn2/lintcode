public class LongestIncreasingSubsequence {
  /**
   * @param nums: The integer array
   * @return: The length of LIS (longest increasing subsequence)
   */
  public int longestIncreasingSubsequence(int[] nums) {
    if (nums == null || nums.length == 0) {
      return 0;
    }

    int len = nums.length;
    int[] lis = new int[len];
    int max = Integer.MIN_VALUE;

    for (int i = 0; i < len; i++) {
      lis[i] = 1;

      for (int j = 0; j < i; j++) {
        if (nums[j] <= nums[i]) {
          lis[i] = Math.max(lis[j] + 1, lis[i]);
        }
      }

      max = Math.max(lis[i], max);
    }

    return max;
  }
}

