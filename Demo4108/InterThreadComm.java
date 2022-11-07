package com.bytecode.multithreading;

class Producer extends Thread {

	int total = 0;

	@Override
	public void run() {
		synchronized (this) {
			System.out.println("Calculating total by producer");
          for (int i = 0; i < 50; i++) {
			 total=total+i;
		 }
          System.out.println("Giving notification to consumer");
          this.notify();
		}
	}
}

public class InterThreadComm {

	public static void main(String[] args) throws InterruptedException {

		Producer p1 = new Producer();
		synchronized (p1) {
		p1.start();
		System.out.println("Giving request to producer ");
		p1.wait();
		System.out.println("Printing total by consumer");
		System.out.println("Addition is =" + p1.total);
		}
		
	}

}
