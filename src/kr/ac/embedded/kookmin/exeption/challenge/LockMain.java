package kr.ac.embedded.kookmin.exeption.challenge;

public class LockMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntBuffer b = new IntBuffer();
		Producer p = new Producer(b);
		Consumer c = new Consumer(b);
		p.start();
		c.start();
	}

}
