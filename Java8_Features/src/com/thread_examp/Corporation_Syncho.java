package com.thread_examp;

class TicketEarning extends Thread {

	int totalEarning = 0;

	@Override
	public void run() {
		synchronized (this) {
			for (int i = 0; i <= 10; i++) {
				totalEarning += 100;
			}
			this.notify();
		}
	}

}

public class Corporation_Syncho {

	public static void main(String[] args) throws InterruptedException {
		TicketEarning t1 = new TicketEarning();
		t1.start();
		synchronized (t1) {
			t1.wait();
			System.out.println(t1.totalEarning);	
		}
		
	}

}
