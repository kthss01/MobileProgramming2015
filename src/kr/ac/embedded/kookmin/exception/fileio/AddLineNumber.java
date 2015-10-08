package kr.ac.embedded.kookmin.exception.fileio;

import java.io.*;

public class AddLineNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//path 에 한글명이 들어가서 read 되지 않음 -> D에 생성
		System.out.print("Path : ");
		//String path = AddLineNumber.class.getResource("").getPath();
		String path = "D:\\";
		System.out.println(path);
		
		try{
			BufferedReader inputStream = 
					new BufferedReader(new FileReader(path+"original.txt"));
			PrintWriter outputStream =
					new PrintWriter(new FileOutputStream(path+"numbered.txt"));
		
			//  구현
			String line;
			int i = 1;
			while((line = inputStream.readLine()) != null) {
				outputStream.println(i + " " + line);
				i++;
			}
			
			inputStream.close();
			outputStream.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

}
