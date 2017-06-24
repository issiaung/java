package LinkedList;

public class DoublyLinkedList {

	Node head;
	Node tail;
	
	public static void main(String[] args) {
		DoublyLinkedList dll = new DoublyLinkedList();
		dll.addNode(1);
		dll.addNode(2);
		dll.addNode(4);
		
		dll.printList();
	}

	public void printList() {
		Node current = head;
		
		while(current!=null){
			System.out.println(current.data);
			current = current.next;
		}
	}

	public void addNode(int data) {
		Node node = new Node(data);
		
		if(head == null)
			head = tail = node;
		else {
			tail.next = node;
			node.prev = tail;
			tail = tail.next;
		}
	}

	class Node {
		int data;
		Node next;
		Node prev;

		public Node(int data) {
			this.data = data;
			this.next = null;
			this.prev = null;
		}
	}

}
