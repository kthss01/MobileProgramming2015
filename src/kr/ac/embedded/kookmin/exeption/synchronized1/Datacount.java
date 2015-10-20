package kr.ac.embedded.kookmin.exeption.synchronized1;

public class Datacount {
	private int cnt = 0;
	private Object key = new Object();
	
	public Object getKey() {
		return this.key;
	}
	
	public void addCnt() {
		cnt++;
		System.out.print(cnt + ", ");
	}
	
	public void addCntUntil3() {
		synchronized (this){
			while (true) {
				cnt++;
				System.out.print(cnt + ", ");
				if (cnt > 2) {
					System.out.println("Wait Runnable thread");
					try {
							this.wait();
							System.out.println("Wake thread");
							return;
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
	
	public int getCnt() {
		return cnt;
	}
	
	public void printcnt() {
		System.out.println(cnt);
	}
}
