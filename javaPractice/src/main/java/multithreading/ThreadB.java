package multithreading;

public class ThreadB extends Thread {
int total = 0;
public void run() {
	synchronized(this){
		System.out.println("Child Thread Starts Calculation...");
		for (int i = 0; i <= 100; i++) {
		total = total+i;	
		}
		System.out.println("Child Thread Giving Notification...");
		this.notify();
	}
}
}
