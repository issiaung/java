package LinkedList;

import LinkedList.SinglyLinkedList.Node;

public class RemoveDupes {

	static SinglyLinkedList sll;

	public static void main(String[] args) {
		sll = new SinglyLinkedList();
		sll.addNewNode(4);
		sll.addNewNode(4);
		sll.addNewNode(4);
		sll.addNewNode(4);

		RemoveDuplicates(sll.head);

		sll.printList();		
	}

	static Node RemoveDuplicates(Node head) {
		// This is a "method-only" submission. 
		// You only need to complete this method. 

		Node current = head;

		if(head==null)
			return null;
		else {
			while(current!=null) {
				if(current.next!=null && current.data == current.next.data)
					current.next = current.next.next;

				if(current.next!=null && current.data == current.next.data)
					continue;

				current = current.next;
			}

			return head;
		}
	}

}
