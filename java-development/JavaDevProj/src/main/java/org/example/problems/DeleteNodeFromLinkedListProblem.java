package org.example.problems;

public class DeleteNodeFromLinkedListProblem {

    public static void main(String[] args) {
     LinkedList list = new LinkedList(1);
     list.add(2);
     list.add(4);
     list.add(5);
     list.add(7);

     list.print();

    }



    static class LinkedList {


        void print() {
            print(root);
        }

        LinkedList(int val) {
            root = new Node(val);
        }

        void print(Node ln) {

            while (ln != null) {
                System.out.println(ln.val);
                ln = ln.next;
            }
        }

        void add(int val) {
            Node last = null;
            Node curr = root;
           while (curr != null) {
               last = curr;
               curr = curr.next;
           }
           last.next = new Node(val);
        }
        Node root = null;
        class Node {
            int val;
            Node next;
            Node(int val) {
                this.val = val;
            }
            Node(int val, Node next){
                this.val = val;
                this.next = next;
            }

        }

    }

}
