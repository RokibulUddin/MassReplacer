package riki.cobra.executor;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimpleThreadPool {
	private List<Runnable> tasks;

	public SimpleThreadPool(List<Runnable> tasks) {
		if(tasks == null) {
			this.tasks = new LinkedList<>();
		}else this.tasks = tasks;
	}

	public SimpleThreadPool() {
		this(null);
	}

	public void runall() {
		ExecutorService executor = Executors.newCachedThreadPool();
		tasks.forEach(t -> executor.execute(t));
	}

	public void addTask(Runnable task) {
		this.tasks.add(task);
	}
}
