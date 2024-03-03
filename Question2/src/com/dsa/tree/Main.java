package com.dsa.tree;

class Node {
    int val;
    Node left, right;
    // constructor to initialize a new node with given value
    Node(int item) {
        val = item;
        left = right = null;
    }
}

class Main {
    public static Node node;
    static Node prevNode = null;
    static Node headNode = null;// function to flatten the binary search tree into a skewed tree in increasing order

    static void flattenBTToSkewed(Node root) {
        // base case
        if (root == null) {
            return;
        }

        // recursively flatten left subtree
        flattenBTToSkewed(root.left);

        // store right and left nodes for future use
        Node rightNode = root.right;
        Node leftNode = root.left;

        // if this is the first node, assign it as the head of the skewed tree
        if (headNode == null) {
            headNode = root;
        }
        // otherwise, link the previous node to this node
        else {
            prevNode.right = root;
        }
        // remove left pointer
        root.left = null;
        // update previous node
        prevNode = root;

        // recursively flatten right subtree
        flattenBTToSkewed(rightNode);
    }

    // function to traverse the right skewed tree using recursion
    static void traverseRightSkewed(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        traverseRightSkewed(root.right);
    }

    public static void main(String[] args) {
        Main tree = new Main();
        tree.node = new Node(50);
        tree.node.left = new Node(30);
        tree.node.right = new Node(60);
        tree.node.left.left = new Node(10);
        tree.node.left.right = new Node(20);
        tree.node.right.left = new Node(55);

        // flatten the tree
        flattenBTToSkewed(node);
        // traverse the skewed tree
        traverseRightSkewed(headNode);
    }
}