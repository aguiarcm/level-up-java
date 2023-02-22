package org.example.problems;

public class RemoveTheNthNodeLinkedList {

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList(new MyLinkedList.Node(1));
        myLinkedList.add(new MyLinkedList.Node(2));
        myLinkedList.add(new MyLinkedList.Node(3));
        myLinkedList.add(new MyLinkedList.Node(4));

        myLinkedList.print();
        myLinkedList.reverse();
        myLinkedList.print();
    }


    static class MyLinkedList {

        Node head;

        MyLinkedList(Node head) {
            this.head = head;
        }

        void add(Node n) {
            Node curr  = head;
            while (curr.next != null) {
                curr = curr.next;
            }

            curr.next = n;
        }

        void print() {
            Node curr = this.head;
            while (curr != null) {
                System.out.println(curr.val);
                curr = curr.next;
            }
        }

        void reverse() {
            Node pointer = head;
            Node prev = null, curr = null;
            while (pointer != null) {
                curr = pointer;
                pointer = curr.next;
                curr.next = prev;
                prev  = curr;
                head = curr;
            }
        }

        static class Node {
            Node next;
            int val;

            Node(int val) {
                this.val = val;
            }

            Node(int val, Node next) {
                this.val = val;
                this.next = next;
            }

        }
    }
}
