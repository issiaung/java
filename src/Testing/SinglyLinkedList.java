package Testing;

public class SinglyLinkedList {

	Node head = null;
	Node tail = null;

	public int getSize(){
		return 0;		
	}

	public void addNode(int num){
		Node node = new Node(num);

		if(head==null)
			head = tail = node;
		else {
			tail.next = node;
			tail = tail.next;
		}
	}

	public void removeNode(int num) {
		Node current = head;

		while(current.next.data!=num)
			current = current.next;
		
		current.next = current.next.next;
	}

	public void printLinkedList(){

		Node current = head;

		while(current != null){
			System.out.println(current.data);
			current = current.next;
		}
	}

	static class Node {

		int data;
		Node next;

		Node(int data){
			this.data = data;
			this.next = null;
		}
	}

	public static void main(String[] args) {
		SinglyLinkedList sll = new SinglyLinkedList();

		sll.addNode(0);
		sll.addNode(1);
		sll.addNode(2);
		sll.addNode(3);
		sll.addNode(4);
		sll.addNode(5);
		sll.printLinkedList();
		
		System.out.println("***********");
		sll.removeNode(4);
		sll.printLinkedList();

	}

}
