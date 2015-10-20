package kr.ac.embedded.kookmin.exeption.challenge;

public class IntBuffer {
	private int index;
	private int[] buffer = new int[8];
	
	public synchronized void add(int num) {
		while(true) {
			if(index < buffer.length) {
				// 소비한거와 생산한게 같은건지 (index값 같은지)테스트
//				System.out.print(index + " ");
				buffer[index++] = num;
				notify();
				return;
			} else {
				try {
				// producer가 buffer넘기게 생산하면 멈추는지 테스트
//					System.out.println("Producer wait");
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	public synchronized int remove() {
		while(true) {
			if(index > 0) {
				// 소비한거와 생산한게 같은건지 (index값 같은지)테스트
//				System.out.print(index-1 + " "); // index전에꺼를 소비하므로 -1
				notify();
				return buffer[--index];
			} else {
				try {
				// consumer가 buffer에 없을때 소비하면 멈추는지 테스트
//					System.out.println("Consumer wait");
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
