package ru.merkurev.leetcode.problems.p0002;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  @Test
  public void addTwoNumbers0() {
    ListNode list1 = new ListNode(0);
    ListNode list2 = new ListNode(1);
    ListNode result = new Solution().addTwoNumbers(list1, list2);
    assertEquals(1, result.val);
    assertNull(result.next);
  }

  @Test
  public void addTwoNumbers1() {
    ListNode list1 = new ListNode(2, new ListNode(4, new ListNode(3)));
    ListNode list2 = new ListNode(5, new ListNode(6, new ListNode(4)));
    ListNode result = new Solution().addTwoNumbers(list1, list2);
    assertEquals(7, result.val);
    assertEquals(0, result.next.val);
    assertEquals(8, result.next.next.val);
    assertNull(result.next.next.next);
  }

  @Test
  public void addTwoNumbers2() {
    ListNode list1 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, 
                     new ListNode(9, new ListNode(9, new ListNode(9)))))));
    ListNode list2 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));
    ListNode result = new Solution().addTwoNumbers(list1, list2);
    assertEquals(8, result.val);
    assertEquals(9, result.next.val);
    assertEquals(9, result.next.next.val);
    assertEquals(9, result.next.next.next.val);
    assertEquals(0, result.next.next.next.next.val);
    assertEquals(0, result.next.next.next.next.next.val);
    assertEquals(0, result.next.next.next.next.next.next.val);
    assertEquals(1, result.next.next.next.next.next.next.next.val);
    assertNull(result.next.next.next.next.next.next.next.next);
  }
}