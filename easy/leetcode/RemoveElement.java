package leetcode;

public class RemoveElement {
  
  public static int removeElement(int[] nums, int val) {
    int index = 0;

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != val) {
        nums[index++] = nums[i];
      }
    }

    return index;
  }

  public static void main(String[] args) {
    // int[] nums = new int[] {0, 1, 2, 2, 0, 4, 2};
    int[] nums = new int[] {0, 1, 2, 2, 3, 0, 4, 2};
    // int[] nums = new int[] {3, 2, 2, 3};
    int val = 2;

    int t = removeElement(nums, val);
  
    for (int i = 0; i < nums.length; i++) {
      System.out.println(nums[i]);
    }

    System.out.println("==================");
    System.out.println(t);
  }

}
