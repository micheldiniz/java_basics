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
		try {
			synchronized (this) {
				questionQueue.put(getNextQuestion());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private synchronized int getNextQuestion() {
		int nextQuestion = questionNo++;
		System.out.println("Got new Question: " + nextQuestion);
		return nextQuestion;
	}

}
