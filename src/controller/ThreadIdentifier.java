package controller;

public class ThreadIdentifier extends Thread {
	
	private int IdThread;
	
	public ThreadIdentifier(int IdThread) {
		this.IdThread = IdThread;
	}
	@Override
	public void run() {
		System.out.println(IdThread);
	}
}
