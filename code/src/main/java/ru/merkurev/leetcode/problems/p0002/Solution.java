package ru.merkurev.leetcode.problems.p0002;

import java.util.Objects;
import java.util.Optional;

/**
 * You are given two non-empty linked lists representing two non-negative 
 * integers. The digits are stored in reverse order, and each of their nodes
 * contains a single digit. Add the two numbers and return the sum as a linked list.
 *
 * You may assume the two numbers do not contain any leading zero, 
 * except the number 0 itself.
 */
class Solution {
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    int overflow = 0;
    ListNode top = new ListNode();
    ListNode current = top;
    while (!Objects.isNull(l1) || !Objects.isNull(l2) || !Objects.equals(overflow, 0)) {
      l1 = Optional.ofNullable(l1).orElse(new ListNode(0));
      l2 = Optional.ofNullable(l2).orElse(new ListNode(0));
      int val = (l1.val + l2.val + overflow) % 10;
      overflow = (l1.val + l2.val + overflow) / 10;
      current.next = new ListNode(val);
      current = current.next;
      l1 = l1.next;
      l2 = l2.next;
    }
    return top.next;
  }

}
