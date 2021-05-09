package multithreading;

public class B {
public synchronized void d2(A a) {
	System.out.println("Thread2 starts execution of d2() method");
	try {
		Thread.sleep(60000);
	} catch (Exception e) {
	}
	System.out.println("Thread2 trying to call A's last()");
	a.last();
}
public void last() {
	System.out.println("Inside B, this is last() method");
}
}
