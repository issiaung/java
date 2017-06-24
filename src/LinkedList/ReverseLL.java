package LinkedList;

import LinkedList.SinglyLinkedList.Node;

public class ReverseLL {
	static SinglyLinkedList sll = new SinglyLinkedList();
	
	public static void main(String[] args) {	
		sll.addNewNode(1);
		sll.addNewNode(2);
		sll.addNewNode(3);
		sll.addNewNode(4);
		sll.addNewNode(5);
		sll.addNewNode(46);
		sll.addNewNode(7);
		
		//Reverse LL
		reverseLL(sll.head);
		
	}

	private static void reverseLL(Node head ) {

		if(head==null)
			return;
		else {
			reverseLL(head.next);
			System.out.println(head.data);
		}
	}

}
