package com.sgr.treeProblem;

public class BinaryTree {
	Node root;

	BinaryTree(int item) {
		root = new Node(item);
	}

	BinaryTree() {
		root = null;
	}

	public static void main(String args[]) {
		BinaryTree tree = new BinaryTree();

		tree.root = new Node(1);

		tree.root.left = new Node(2);
		tree.root.right = new Node(3);

		/*
		 * 1 2 3 null null
		 */

		tree.root.left.left = new Node(4);

	}

}

class Node {
	int key;
	Node left, right;

	Node(int item) {
		this.key = item;
		left = right = null;
	}

}
