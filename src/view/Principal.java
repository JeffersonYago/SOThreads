package view;

import controller.ThreadIdentifier;

public class Principal {

	public static void main(String[] args) {
		for (int ThreadId = 0; ThreadId < 5; ThreadId++) {
		ThreadIdentifier T = new ThreadIdentifier(ThreadId);
		T.start();
	}
	}
}
