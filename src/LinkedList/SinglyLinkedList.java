package LinkedList;

/**
 * Addition, deletion of linkedlists
 * @author meghamehta
 *
 */
public class SinglyLinkedList {

	Node head = null;
	Node tail = null;

	public static void main(String[] args) {
		SinglyLinkedList sll = new SinglyLinkedList();

		sll.addNewNode(4);
		sll.addNewNode(2);
		sll.addNewNode(1);
		sll.addNewNode(3);

		sll.printList();

		sll.deleteNode(4);
		sll.deleteNode(3);
		System.out.println("\nPost-deletion:");
		sll.printList();
		
		sll.addNewNode(5);
		System.out.println("\nPost-addition:");
		sll.printList();
		
		sll.addNewNode(7);
		sll.addNewNode(8);
		sll.addNewNode(10, 4);
		System.out.println("\nPost-addition at position-5:");
		sll.printList();
		
		sll.deleteAtPos(3);
		System.out.println("\nPost-deletion at position-3:");
		sll.printList();
		
	}

	public void deleteAtPos(int pos) {
		Node current = head;
		int i=1;
		
		while(i < pos-1){
			current = current.next;
			i++;
		}
		
		current.next = current.next.next;
		
	}

	/**
	 * To add a number somewhere in between
	 * @param num
	 * @param pos
	 */
	public void addNewNode(int num, int pos) {
		
		Node current = head;
		int i = 1;

		while(i < pos-1){
			current = current.next;
			i++;
		}
		
		Node temp = new Node(num);
		
		temp.next = current.next;
		current.next = temp;
	}

	public void deleteNode(int i) {
		Node current = head;

		if(head.data == i){
			head = head.next;
		} else {
			while(current.next.data != i){
				current = current.next;
			}
		}

		//If the last element is deleted, move the tail up by a position
		if(current.next == tail)
			tail = current;
		
		current.next = current.next.next;

	}

	public void printList() {
		Node current = head;

		while(current != null){
			System.out.println(current.data);
			current = current.next;
		}
	}

	public void addNewNode(int i) {
		Node node = new Node(i);

		if(head==null) {
			head = tail = node;
		}
		else {
			tail.next = node;
			tail = node;
		}
	}

	class Node {

		int data;
		Node next;

		public Node(int data){
			this.data = data;
			this.next = null;
		}
	}

}
