package medium;

public class AddTwoNumbers {

  public static ListNode addTwoNumbers(final ListNode l1, final ListNode l2) {
    while (l1 != null || l2 != null) {
      int x = l1.val;
      int y = l2.val;

      int sum = x + y;

      
    }

    return null;
  }

  public static void main(String[] args) {
    // final ListNode l1 = new ListNode();
    // l1.val = 5;
    // l1.next = new ListNode(6, new ListNode(4, null));

    // final ListNode l2 = new ListNode();
    // l2.val = 2;
    // l2.next = new ListNode(4, new ListNode(3, null));

    final ListNode l1 = new ListNode();
    l1.val = 0;
    l1.next = null;

    final ListNode l2 = new ListNode();
    l2.val = 0;
    l2.next = null;

    final ListNode l = addTwoNumbers(l1, l2);

    ListNode p = l;
    while (p != null) {
      System.out.println(p.val);

      p = p.next;
    }

  }

  public static class ListNode {
    int val;
    ListNode next;
    
    ListNode() {}
    
    ListNode(int val) {
      this.val = val;
    }
    
    ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
    }
  }

}
