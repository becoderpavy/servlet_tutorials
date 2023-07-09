package com.thread_examp;

class BookThreaterSeat {

	private static int totalSeat = 20;

	static synchronized public void bookSeat(int seatNo) {
		if (totalSeat >= seatNo) {
			System.out.println(seatNo + " ticket booked sucessfully");
			totalSeat -= seatNo;
			System.out.println(" available=" + totalSeat);
		} else {
			System.out.println(seatNo + " seats are not available");
		}

	}

}

class Thread1 extends Thread {

	BookThreaterSeat b;
	int seatNo;

	public Thread1(BookThreaterSeat b, int seatNo) {
		super();
		this.b = b;
		this.seatNo = seatNo;
	}

	@Override
	public void run() {
		b.bookSeat(seatNo);
	}

}

class Thread2 extends Thread {

	BookThreaterSeat b;
	int seatNo;

	public Thread2(BookThreaterSeat b, int seatNo) {
		super();
		this.b = b;
		this.seatNo = seatNo;
	};

	@Override
	public void run() {
		b.bookSeat(seatNo);
	}

}

public class MutualExclusice_Sysncronization extends Thread {

	public static void main(String[] args) {

		BookThreaterSeat b1 = new BookThreaterSeat();
		Thread1 t1 = new Thread1(b1, 7);
		t1.start();

		Thread1 t2 = new Thread1(b1, 6);
		t2.start();

		BookThreaterSeat b2 = new BookThreaterSeat();
		Thread2 t3 = new Thread2(b2, 7);
		t3.start();

		Thread2 t4 = new Thread2(b2, 4);
		t4.start();

	}

}

/*
 * public class TicketBook1 extends Thread {
 * 
 * static BookThreaterSeat b; int seatNo;
 * 
 * @Override public void run() { b.bookSeat(seatNo); }
 * 
 * public static void main(String[] args) { b = new BookThreaterSeat();
 * TicketBook1 t1 = new TicketBook1(); t1.seatNo = 7; t1.start();
 * 
 * TicketBook1 t2 = new TicketBook1(); t2.seatNo = 5; t2.start();
 * 
 * }
 * 
 * }
 */
