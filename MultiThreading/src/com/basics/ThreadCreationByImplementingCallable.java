package com.basics;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadCreationByImplementingCallable implements Callable<String> {
	private static final int THREAD_POOL_SIZE = 10;
	AtomicInteger atomicInteger = new AtomicInteger(0);

	@Override
	public String call() throws Exception {
		return Thread.currentThread().getName() + " Executing.." + atomicInteger.getAndIncrement();
	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ThreadCreationByImplementingCallable threadCreationByImplementingCallable = new ThreadCreationByImplementingCallable();

		ExecutorService executorService = Executors.newFixedThreadPool(THREAD_POOL_SIZE);

		Future<String> future1 = executorService.submit(threadCreationByImplementingCallable);
		Future<String> future2 = executorService.submit(threadCreationByImplementingCallable);

		System.out.println("Task finished " + future1.get());
		System.out.println("Task finished " + future2.get());

		executorService.shutdown();
	}
}
