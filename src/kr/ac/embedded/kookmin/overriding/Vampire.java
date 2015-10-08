package kr.ac.embedded.kookmin.overriding;

public class Vampire extends Monster{
	boolean frighten(int x) {
		System.out.println("a bite?");
		return true;
	}
}
