package leetcode;

public class RemoveDuplicatesSortedArrays {

  public static int removeDuplicates(int[] nums) {
    int j = 0;

    for (int i = 0; i < nums.length - 1; i++) {
      if (nums[i] != nums[i + 1]) {
        nums[j++] = nums[i];
      }
    }

    nums[j] = nums[nums.length - 1];

    for (int i = j + 1; i < nums.length; i++) {
      nums[i] = 1000;
    }

    return j + 1;
  }

  public static int[] reverseInPlace(int[] nums) {
    int n = nums.length;

    int m = (int) Math.floor(n / 2);

    for (int i = 0; i < m; i++) {
      int temp = nums[i];
      nums[i] = nums[n - 1 - i];
      nums[n - 1 - i] = temp;
    }

    return nums;
  }

  public static void main(String[] args) {
    int[] nums = new int[] {1, 1, 2, 3, 3, 4, 4};

    int t = removeDuplicates(nums);
  
    for (int i = 0; i < nums.length; i++) {
      System.out.println(nums[i]);
    }

    System.out.println("==================");
    System.out.println(t);
  }

}
