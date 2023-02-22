package org.example.problems;

import org.example.problems.InsertionSortListProblem.ListNode;

// URL:https://leetcode.com/problems/insertion-sort-list/description/
public class InsertionSortListProblem {


    public static void main(String[] args) {
        ListNode listNode3 = new ListNode(3);
        ListNode listNode1 = new ListNode(1, listNode3);
        ListNode listNode2 = new ListNode(2, listNode1);
        ListNode listNode4 = new ListNode(4, listNode2);
        ListNode listNode5 = new ListNode(-1, listNode4);

        ListNode result = insertionSortList(listNode5);

        print(result);
    }


    static ListNode insertionSortList(ListNode head) {
        ListNode dummyParent = new ListNode(0, head);
        ListNode headParent = dummyParent;
        while (head != null) {
            headParent = sort(dummyParent.next, head, dummyParent, headParent);
            head = headParent.next;
        }
        return dummyParent.next;
    }

    static ListNode sort(ListNode start, ListNode end, ListNode startParent, ListNode endParent) {
        while (start != null && start != end) {
            if (end.val < start.val) {
                startParent.next = end;
                ListNode tempNode = end.next;
                end.next = start;
                endParent.next = tempNode;
                return endParent;
            }
            startParent = start;
            start = start.next;
        }
        return end;
    }


    static void print(ListNode ln) {

        while (ln != null) {
            System.out.println(ln.val);
            ln = ln.next;
        }
    }


    static class ListNode  {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

}
