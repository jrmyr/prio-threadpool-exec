package de.myrnet.prioTPExec;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@SuppressWarnings("serial")
public class PrioritizedThreadPoolTaskExecutor extends ThreadPoolTaskExecutor {

	@Override
	protected BlockingQueue<Runnable> createQueue(int queueCapacity) {
		return new PriorityBlockingQueue<Runnable>(queueCapacity);
	}

	public void execute(PrioritizedRunnable task) {
		super.execute(task);
	}
}