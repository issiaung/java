package multiThreading;
/**
 * Taken from http://netjs.blogspot.in/2015/06/synchronization-in-java-multithreading-synchronizing-thread.html
 * @author meghamehta
 *
 */
class Message{
	public static void syncMethod(){
		String threadName = Thread.currentThread().getName();
		System.out.println(threadName);

		synchronized (Message.class) {

			for (int i = 1; i <= 10; i++) {
				System.out.print(threadName + ": ");
				System.out.println(i);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}	

class ThreadPriorities implements Runnable {
	//public class UsingRunnable extends Thread {

	Message msg;

	public ThreadPriorities(Message msg) {
		this.msg = msg;
	}

	public static void main(String[] args) {

		Message msg = new Message();

		// creating threads, 2 threads will be created 
		// all sharing the same object msg
		Thread t1 = new Thread(new ThreadPriorities(msg), "T1");
		Thread t2 = new Thread(new ThreadPriorities(msg), "T2");


		try {
			//Wait for the threads to finish
			t1.start();
			//t1.join();
			//Thread.yield();
			t2.start();
			t2.join();
			System.out.println("t1 Alive - " + t1.isAlive());
			System.out.println("t2 Alive - " + t2.isAlive());
			System.out.println("Done");

		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
	}

	@Override
	public void run() {
		msg.syncMethod();
	}

}
