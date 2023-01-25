package lecture40.learnConcurrencyUtils.com.java_basics.produceconsumer;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {

	BlockingQueue<Integer> questionQueue;

	public Consumer(BlockingQueue<Integer> questionQueue) {
		this.questionQueue = questionQueue;
	}

	@Override
	public void run() {
		System.out.println(questionQueue.size());
		while (questionQueue.size()>0 || !questionQueue.contains(50)) {
			try {
				Thread.sleep(100);
				System.out.println("ANSWERED QUESTION: " + questionQueue.take());
			} catch (InterruptedException e) {
			}
		}
	}

}
