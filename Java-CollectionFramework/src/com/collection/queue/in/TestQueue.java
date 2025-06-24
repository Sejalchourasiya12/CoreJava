package com.collection.queue.in;

import java.util.ArrayDeque;
import java.util.Queue;

public class TestQueue {

	public static void main(String[] args) {
		
		Queue q = new ArrayDeque();
		
		q.offer(1);
		q.offer(2);
		q.offer(3);
		q.offer(4);
		
		
		System.out.println("q" +q);
	}
}
