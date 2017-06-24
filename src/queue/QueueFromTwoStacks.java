package queue;

import java.util.Stack;

/**
 * Nice explanation over here:
 * https://www.youtube.com/watch?v=wbfuly4DBIk, 
 * <p> and here:https://www.youtube.com/watch?v=AN0axYeLue0
 * @author meghamehta
 *
 */
public class QueueFromTwoStacks {

	static Stack<String> s1 = new Stack<String>();
	static Stack<String> s2 = new Stack<String>();

	public static void main(String[] args) {

		//Initial queue size
		System.out.printf("Stack is empty: %b\n", QueueFromTwoStacks.isEmpty());
		System.out.printf("Stack size: %d\n", QueueFromTwoStacks.size());

		//After adding the sentence
		QueueFromTwoStacks.enqueue("Hi");
		QueueFromTwoStacks.enqueue("How");
		QueueFromTwoStacks.enqueue("Are");
		QueueFromTwoStacks.enqueue("You");
		QueueFromTwoStacks.enqueue("Today?");

		//Size after adding words
		System.out.printf("Stack is empty: %b\n", QueueFromTwoStacks.isEmpty());
		System.out.printf("Stack size: %d\n", QueueFromTwoStacks.size());

		//Read the sentence
		//while(!QueueFromTwoStacks.isEmpty())
		System.out.println(QueueFromTwoStacks.dequeue());
		System.out.println(QueueFromTwoStacks.dequeue());
		System.out.println(QueueFromTwoStacks.dequeue());
		System.out.println(QueueFromTwoStacks.dequeue());
		System.out.println(QueueFromTwoStacks.dequeue());

		QueueFromTwoStacks.enqueue("Lovely");
		QueueFromTwoStacks.enqueue("Lovely2");
		System.out.println(QueueFromTwoStacks.dequeue());
		System.out.println(QueueFromTwoStacks.dequeue());

	}

	/**
	 * Remove front element from queue
	 * @return
	 */
	private static String dequeue() {
		if(s2.isEmpty())
			while(!s1.isEmpty()){
				String topWord = s1.pop();
				s2.push(topWord);
			}						
		return s2.pop();
	}

	/**
	 * Add to front of queue
	 * @param string 
	 */
	private static void enqueue(String word) {
		s1.push(word);
	}

	public static boolean isEmpty(){
		return s1.isEmpty() && s2.isEmpty();
	}

	public static int size(){
		return s1.size() + s2.size();
	}

}
