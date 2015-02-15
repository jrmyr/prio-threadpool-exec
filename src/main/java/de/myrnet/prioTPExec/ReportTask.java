package de.myrnet.prioTPExec;

public class ReportTask extends PrioritizedRunnable {

	private final String name;
	private final int priority;

	public ReportTask(String name, int priority) {
		this.name = name;
		this.priority = priority;
	}

	@Override
	public void run() {
		System.out.println("Started " + name + " (" + priority + ")");
		System.out.println("Finished " + name);
	}

	@Override
	public int getPriority() {
		return priority;
	}



}
