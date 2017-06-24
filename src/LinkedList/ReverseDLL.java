package LinkedList;

import LinkedList.DoublyLinkedList.Node;

public class ReverseDLL {

	private static DoublyLinkedList dll;

	public static void main(String[] args) {
		dll = new DoublyLinkedList();
		dll.addNode(1);
		dll.addNode(2);
		dll.addNode(5);

		reverseList(dll.head);
		dll.printList();
	}

	private static Node reverseList(Node head) {
		Node current = head;

		while(current.next!=null) {

			Node nextNode = current.next;
			current.next = current.prev;
			current.prev = nextNode;
			
			current = nextNode;
		} 

		dll.head = current;
		current.next = current.prev;
		current.prev = null;
		
		if(head==null)
			return null;
		else
			return head;
	}
	
}
