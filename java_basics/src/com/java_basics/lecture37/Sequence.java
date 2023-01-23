package com.java_basics.lecture37;

public class Sequence {
	private int value = 0;

	public synchronized int getNext() {
//		synchronized (this) {
			value = value + 1;
			return value;
//		}
	}
}
