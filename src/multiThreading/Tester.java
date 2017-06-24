package multiThreading;

class PingPong2 {
	synchronized void hit(String n) {
		for(int i = 1; i < 3; i++)
			System.out.println(n + "-" + i + " ");
	}
}

public class Tester implements Runnable {
	static PingPong2 pp2 = new PingPong2();
	
	public static void main(String[] args) {
		new Thread(new Tester(), "Thread1").start();
		new Thread(new Tester(), "Thread2").start();
	}
	
	public void run() {
		pp2.hit(Thread.currentThread().getName()); 
	}
}
