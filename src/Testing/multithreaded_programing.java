package Testing;

public class multithreaded_programing {
    public static void main(String args[]) {
        Thread t = Thread.currentThread();
        System.out.println(t);        
        
        Thread t1 = new Thread("nextthread");
        System.out.println(t1);        
        
    }
}