package kr.ac.embedded.kookmin.exception.basicthread;

public class testMain {

	public static BankAccount account = new BankAccount();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread depositMan = new Thread() {
			public void run() {
				while (true) {
					try {
						sleep(500);
						// 10만큼 입금
						account.add(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
			}
		};
		Thread withdrawMan = new Thread() {
			public void run() {
				while (true) {
					try {
						sleep(500);
						// 10만큼 출금
						account.delete(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
			}
		};
		depositMan.start();
		withdrawMan.start();
	}

}
