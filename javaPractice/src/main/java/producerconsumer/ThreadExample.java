package producerconsumer;

public class ThreadExample {

	public static void main(String[] args) throws InterruptedException {
		//Object of a class that has both Produce() and consume() methods
		final PC pc = new PC();
		//Create producer thread.
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					pc.produce();
				} catch (Exception e) {
					
				}
				
			}
		});
		
		//Create Consumer Thread
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					pc.consume();
				} catch (Exception e) {
					// TODO: handle exception
				}
				
			}
		});
		//Start both thread
		t1.start();
		t2.start();
		//t1 finished before t2
		t1.join();
		t2.join();
	}
	

}
