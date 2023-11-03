public class TwoSum {
  
  public static int[] twoSum(int[] nums, int target) {
    int[] index = new int[2];

    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] + nums[j] == target) {
          index[0] = i;
          index[1] = j;

          break;
        }
      }
    }

    return index;
  }

  public static void main(final String[] args) {
    // int[] nums = new int[] {15, 11, 2, 7};
    int[] nums = new int[] {3, 2, 4};
    // int[] nums = new int[] {3, 3};

    int[] out = twoSum(nums, 9);

    System.out.println(out[0]);
    System.out.println(out[1]);
  }

}
