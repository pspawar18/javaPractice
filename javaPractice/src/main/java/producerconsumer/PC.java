package producerconsumer;

import java.util.LinkedList;

public class PC {
	//this class has a list shared by producer and consumer size of list is 2
			LinkedList<Integer> list = new LinkedList<Integer>();
			int capacity = 2;
			//Function called by producer thread.
			public void produce() throws InterruptedException
			{
				int value = 0;
				while(true) {
					synchronized (this) {
						//producer thread waits while list is full
						while(list.size() == capacity);
						wait();
						
						System.out.println("Producer Produced - "+value);
						
						//to insert the job in the list
						list.add(value++);
						//notifies the consumer thread that now it start consuming.
						notify();
						Thread.sleep(1000);
						
					}
				}
				
			}
			
			//Function called by Consumer thread
			public void consume() throws InterruptedException{
				while(true) {
					synchronized(this) {
						//consumer thread waits while list is empty
						while(list.size()==0);
						wait();
						//to retrieve the first job in the list
						int val = list.removeFirst();
						
						System.out.println("Consumer Consumed - "+val);
						//wake up producer thread
						notify();
						//and sleep
						Thread.sleep(1000);
					}
				}
				
			}

}
