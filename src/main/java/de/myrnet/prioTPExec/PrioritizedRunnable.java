package de.myrnet.prioTPExec;

public abstract class PrioritizedRunnable implements Runnable, Comparable<PrioritizedRunnable> {

	public abstract int getPriority();

	@Override
	public int compareTo(PrioritizedRunnable other) {
		return (this.getPriority() - other.getPriority());
	}
}
