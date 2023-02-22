package org.example.concepts.datastructures;

public class BinaryTreeClass {

    static int diameter = 0;

    public static void main(String[] args) {
        int[] arr = {3,4,5,-1,0,2};
        BinaryTree binaryTree = new BinaryTree();

        // Addadd
        for (int i = 0; i < arr.length; i++) {
            binaryTree.add(arr[i]);
        }

        binaryTree.print(binaryTree.root);

        // Search
        System.out.println("BT contains -1: " + binaryTree.search(-1));
        System.out.println("BT contains 6: " + binaryTree.search(6));

        // Height
        diameter = 0;
        binaryTree.printDiameter();

        // Delete
        binaryTree.delete(3);
        binaryTree.print(binaryTree.root);

    }


    static class BinaryTree {

        Node root;


        void add(int value) {
            root = addNode(root, value);
        }
        Node addNode(Node node, int value) {
            if (node == null) {
                node = new Node(value);
                return node;
            }

            if (value < node.value) {
                node.left = addNode(node.left, value);
            } else {
                node.right = addNode(node.right, value);
            }
            return node;
        }


        Node minimumElement(Node current) {
            if (current.left == null) return current;

            return minimumElement(current.left);
        }

        void delete(int value) {
            deleteNode(root, value);
        }
        Node deleteNode(Node current, int value) {
            if (current == null) {
                return null;
            }

            if (value < current.value) {
                current.left = deleteNode(current.left, value);
            } else if (value > current.value) {
                current.right = deleteNode(current.right, value);
            } else {
                if (current.left != null && current.right != null) {
                    Node tempNode = current;
                    // Node has 2 children
                    // 1. We need to find the minimum node from the right
                    Node replacement = minimumElement(tempNode.right);
                    // 2. replace the value
                    current.value = replacement.value;
                    // 3. delete node of the value we moved
                    current.right = deleteNode(current.right, replacement.value);
                } else if (current.left != null) {
                    // Node only has one child in the left
                    current = current.left;
                } else if (current.right != null) {
                    // Node only has one child in the left
                    current = current.right;
                } else {
                    current = null;
                }
            }
            return current;
        }


        void print(Node current) {
            if (current != null) {
                print(current.left);
                System.out.println(current.value);
                print(current.right);
            }
        }

        boolean search(int value) {
            return contains(this.root, value);
        }


        boolean contains(Node n, int value) {
            if (n != null) {
                if (n.value == value) return true;
                if (value < n.value) return contains(n.left, value);
                if (value > n.value) return contains(n.right, value);
            }
            return false;
        }

        void printDiameter() {
            int diameter = diameter(root);
            System.out.println("Diamter of tree is: " + diameter);
        }

        int diameter(Node n) {
            if (n == null) return -1;

            int diameterLeft = diameter(n.left);
            int diameterRight = diameter(n.right);
            diameter = Math.max(diameter, diameterLeft + diameterRight + 2);

            return 1 + Math.max(diameterLeft, diameterRight);
        }


        class Node {
            int value;
            Node left;
            Node right;

            public Node(int value) {
                this.value = value;
                this.left = null;
                this.right = null;
            }


        }
    }
}
