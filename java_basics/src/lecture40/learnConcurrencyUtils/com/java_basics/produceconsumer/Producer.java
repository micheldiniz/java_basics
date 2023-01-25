package lecture40.learnConcurrencyUtils.com.java_basics.produceconsumer;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

	int questionNo;
	BlockingQueue<Integer> questionQueue;

	public Producer(BlockingQueue<Integer> questionQueue) {
		this.questionQueue = questionQueue;
	}

	@Override
	public void run() {
		while (!questionQueue.contains(50)) {
			try {
				synchronized (this) {
					int nextQuestion = questionNo++;
					System.out.println("Got new Question: " + nextQuestion);
					questionQueue.put(nextQuestion);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
