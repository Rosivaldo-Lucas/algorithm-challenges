/**
 * LeetCode
 * 
 * SEARCH INSERT POSITION
 * 
 * Given a sorted array of distinct integers and a target value, return the index if the target is found.
 * If not, return the index where it would be if it were inserted in order.
 * 
 * You must write an algorithm with O(log n) runtime complexity.
 * 
 * Example 1:
 *  Input: nums = [1,3,5,6], target = 5
 *  Output: 2
 * 
 * Example 2:
 *  Input: nums = [1,3,5,6], target = 2
 *  Output: 1
 * 
 * Example 3:
 *  Input: nums = [1,3,5,6], target = 7
 *  Output: 4
 * 
 * implementing binary search algorithm 
 * 
 * @version 0.0.1 Novembro/02/2023
 * @author  LUCAS, Rosivaldo
 */

public class SearchInsertPosition {
  
  public static int searchInsert(final int[] nums, final int target) {
    int l = -1;
    int r = nums.length;

    while (l < (r - 1)) {
      int m = (l + r) / 2;
      
      if (nums[m] < target) {
        l = m;
      } else {
        r = m;
      }
    }

    return r;
  }

  public static int searchInsert2(final int[] nums, final int target) {
    int init = 0;
    int end = nums.length;

    while (init <= end) {
      int m = (init + end) / 2;

      if (nums[m] == target) {
        end = m + 1;
      } else {
        if (target < nums[m]) {
          end = m - 1;
        } else {
          init = m + 1;
        }
      }
    }

    return end;
  }

  public static void main(String[] args) {
    int[] nums = new int[] {1, 3, 5, 6, 7, 9};
    int target = 5;

    int result = searchInsert(nums, target);
  
    System.out.println(result);
  }

}
