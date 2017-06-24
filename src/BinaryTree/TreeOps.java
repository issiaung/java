package BinaryTree;

class Tree {

	Node root;

	public void display(Node node){
		if(node!=null) {
			display(node.left);
			System.out.println(node.data);
			display(node.right);
		}
	}

	class Node{
		private int data;
		private Node right;
		private Node left;

		Node(int data){
			this.data=data;
			this.right = null;
			this.left = null;
		}
	}

	public void insert(int i) {
		Node node = new Node(i);

		if(root == null) {
			root = node;
			return;
		}

		Node current = root;
		Node parent = null;

		while(true) {
			parent = current;

			if(i < current.data){
				current = current.left;
				if(current == null){
					parent.left = node;
					return;
				}
			} else {
				current = current.right;
				if(current == null){
					parent.right = node;
					return;
				}
			}
		}
	}

	public boolean find(int i) {

		//If tree is blank
		if(root == null)
			return false;

		Node current = root;

		while(true){
			if(current==null)
				return false;

			if(current.data==i){
				System.out.print("Found number=" + i);
				return true;
			}
			else {
				if(current.data < i)
					current = current.right;
				else
					current = current.left;

			}
		}
	}
}

public class TreeOps{

	public static void main(String[] args) {
		Tree tree = new Tree();

		tree.insert(16);
		tree.insert(2);
		tree.insert(8);
		tree.insert(5);
		tree.insert(0);
		tree.insert(9);

		tree.display(tree.root);

		System.out.println(tree.find(8));
		System.out.println(tree.find(0));	}

}