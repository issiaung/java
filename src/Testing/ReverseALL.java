package Testing;

import Testing.SinglyLinkedList.Node;

public class ReverseALL {
	
	static SinglyLinkedList sll;
	
	public static void main(String[] args) {

		sll = new SinglyLinkedList();

		sll.addNode(0);
		sll.addNode(1);
		sll.addNode(2);
		sll.addNode(3);
		sll.addNode(4);
		sll.addNode(5);
		sll.printLinkedList();

		System.out.println("********************************************");
		reverseLL(sll.head);
		sll.printLinkedList();
	}

	private static void reverseLL(Node node) {
		Node current = node;
		Node temp;
		Node nextNode = null;
		
		while (current != null) {
			temp = current.next;	
			current.next = nextNode;
			nextNode = current;
			current = temp;
		}		
		
		/**
		 * Make the last 'nextNode' the head of the LL
		 */
		sll.head = nextNode;
	}
}
