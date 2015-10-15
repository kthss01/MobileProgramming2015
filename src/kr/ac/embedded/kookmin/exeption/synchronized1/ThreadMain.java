package kr.ac.embedded.kookmin.exeption.synchronized1;

public class ThreadMain extends Thread {
	static Datacount dc;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ThreadMain tm = new ThreadMain();
		dc = new Datacount();
		
		tm.start();
		
		Thread.sleep(10);
		
		synchronized(dc) {
			while(dc.getCnt() < 10) {
				dc.addCnt();
			}
			dc.notify();
		}
	}
	public void run() {
		dc.addCntUntil3();
	}

}
