package ru.merkurev.leetcode.problems.p0021;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Объединение списков")
class SolutionTest {

    @Test
    @DisplayName("Оба списка равны null")
    void mergeTwoEmptyLists() {
        ListNode resultList = new Solution().mergeTwoLists(null, null);
        assertEquals(listToString(resultList), "");
    }

    @Test
    @DisplayName("Один из списков равен null")
    void mergeOneEmptyListsTest() {
        ListNode listNode1 = new ListNode(0);
        ListNode resultList = new Solution().mergeTwoLists(listNode1, null);
        assertEquals(listToString(resultList), listToString(listNode1));
    }

    @Test
    @DisplayName("Оба списка не пустые")
    void mergeListsTest() {
        ListNode listNode1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode listNode2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode expected = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4,
                new ListNode(4))))));

        ListNode actual = new Solution().mergeTwoLists(listNode1, listNode2);

        assertEquals(listToString(expected), listToString(actual));
    }

    private String listToString(ListNode listNode) {
        StringBuilder result = new StringBuilder();
        while (listNode != null) {
            result.append(listNode.val);
            listNode = listNode.next;
        }
        return result.toString();
    }
}