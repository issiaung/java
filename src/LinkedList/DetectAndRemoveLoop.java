package LinkedList;
//Java program to detect and remove loop in linked list

class Node {

	int data;
	Node next;

	Node(int d) {
		data = d;
		next = null;
	}
}

class LinkedList {

	Node head;

	// Function that detects loop in the list
	int detectAndRemoveLoop(Node node) {
		Node slow = head;
		Node fast = head;
		
		while(slow!=null && fast!=null && fast.next!=null){
			slow = slow.next;
			fast = fast.next.next;

			if(slow == fast) {
				removeLoop(head, fast);
			}			
		}
		
		
		return 0;
	}

	// Function to remove loop
	void removeLoop(Node loop, Node curr) {
	
		while(loop.next != curr.next){
			loop = loop.next;
			curr = curr.next;
		}
		
		curr.next = null;
	}

	void printList(Node node) {
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

}
/**
 * Taken from: http://www.geeksforgeeks.org/detect-and-remove-loop-in-a-linked-list/
 * @author meghamehta
 */
public class DetectAndRemoveLoop {

	//Driver program to test above functions
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.head = new Node(50);
		list.head.next = new Node(20);
		list.head.next.next = new Node(15);
		list.head.next.next.next = new Node(4);
		list.head.next.next.next.next = new Node(10);

		// Creating a loop for testing 
		list.head.next.next.next.next.next = list.head.next.next;
		list.detectAndRemoveLoop(list.head);
		System.out.println("Linked List after removing loop : ");
		list.printList(list.head);
	}
}
