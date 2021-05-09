package multithreading;

public class A {
	public synchronized void d1(B b) {
		System.out.println("Thread1 Starts Execution of d1() method");
		try {
			Thread.sleep(6000);

		} catch (InterruptedException e) {
		}
		System.out.println("Thread1 trying to call B's last()");
		b.last();
	}
	public void last() {
		System.out.println("Inside A, this is last() method");
	}
}
