package session8;

class MyThread extends Thread {

	// declaring integer variable for timer cycle

	int timercycle = 5;

	// overriding run method in thread class

	@Override

	public void run() {

		System.out.println("Timer is starting");
		// prints Timer is starting

		// thread prints Timeout message periodically

		try {

			// looping for thread cycle

			for (int i = 0; i < timercycle; i++) {

				Thread.sleep(18000); // thread sleeps for 18 seconds

				System.out.println("Timeout");
				// prints Timeout
			}

		} catch (InterruptedException ex) {

		}

		System.out.println("Timer ended");
		// prints Timer ended

	}

}

class Timer {

	public static void main(String[] args) {

		// creating instance object for MyThread extending Thread class

		Thread t = new MyThread();

		// starts execution of MyThread

		t.start();
	}

}
