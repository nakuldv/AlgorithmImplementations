package com.jensonjo.depth_binarytree;

public class BinaryTree {
	Node root;
	// static int leafNodeCounter = 0;

	int maxDepth(Node node) {
		if (node == null) {
			return 0;
		} else {
			int lDepth = maxDepth(node.lNode);
			int rDepth = maxDepth(node.rNode);
			if (lDepth > rDepth) {
				return (lDepth + 1);
			} else {
				return rDepth + 1;
			}
		}

	}

	int getLeafCount(Node node) {
		if (node == null) {
			return 0;
		}
		if (node.lNode == null && node.rNode == null)
			return 1;
		else
			return getLeafCount(node.lNode) + getLeafCount(node.rNode);
	}

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.lNode = new Node(2);
		tree.root.rNode = new Node(3);
		tree.root.rNode.rNode = new Node(4);
		tree.root.rNode.rNode.rNode = new Node(5);
		System.out.println("Binary tree generate");
		System.out.println("Depth of binary tree is : " + tree.maxDepth(tree.root));
		System.out.println("Number of leaf nodes :" + tree.getLeafCount(tree.root));
	}
}
