package com.training.thread;

public class MyThread implements Runnable{
	
	

	public static void main(String[] args) {
		MyThread m = new MyThread();
		Thread t = new Thread(m);
		t.start();

	}

	@Override
	public void run() {
		 for (int i = 0; i <= 10; i++) {
			System.out.println(5 + " * " + i + " = " + (5 * i));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
		}
		
	}

}
