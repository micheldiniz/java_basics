package lecture41.learnConcurrencyUtils.com.java_basics.threadpools;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolDemo {

	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(2);//recycle threads
		
		Runnable processor = new MessageProcessor(2);
		executor.execute(processor);
		
		Runnable processor2 = new MessageProcessor(3);
		executor.execute(processor2);
		
		Runnable processor3 = new MessageProcessor(4);
		executor.execute(processor3);
		
		Runnable processor4 = new MessageProcessor(4);
		executor.execute(processor4);
		
		executor.shutdown();// Rejects any new tasks from being submitted. Gracefully shuts down the service.
//		executor.shutdownNow(); //Terminate the executor service immediately..
		
		try {
			executor.awaitTermination(10, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
//		the bellow loop will prevent the code from getting to the next instruction (seems like a bad code)
//		while(!executor.isTerminated()) {
//		
//		}
		
		System.out.println("submitted all tasks...");		
		
	}
}
