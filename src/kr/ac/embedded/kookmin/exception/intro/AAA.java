package kr.ac.embedded.kookmin.exception.intro;

import java.io.*;

public class AAA {

	public void readFile() {
		//path 에 한글명이 들어가서 read 되지 않음 -> C에다 생성
		//String path = Trade.class.getResource("").getPath();
		String path = "C:\\";
		System.out.print("Path : ");
		System.out.println(path+"a.txt");
		
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(path+"a.txt"));
			System.out.println(reader.readLine());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			closeFile(reader);
		}
	}
	
	public void closeFile(BufferedReader reader) {
		try {
			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
