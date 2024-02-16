package Day11.Ex04_AutoClose;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputTxt {
	
	public static void main(String[] args) {
		
		//파일을 가져오기위해서 사용되는 객체
		FileInputStream fis = null;
		
		try {
			//test.txt파일을 입력할 수 있도록 연결
			fis = new FileInputStream("test.txt");
			
			int read = 0;
			
			
			//fis.read() : 객체생성할때 생성자에 입력한 파일의 데이터를 한글자씩 읽어오는 메소드
			// 더이상 읽어올 데이터가 없으면 -1을 반환함.
			//while문: 더이상 읽어올 데이터가 없을때까지 한글자씩 출력함.
			while ((read = fis.read()) != -1) {
				System.out.print((char)read);
			}
			
		}
		catch (FileNotFoundException e) {
			//FileNotFoundException: 파일이 존재하지 않을 때 발생하는 예외
			e.printStackTrace();
			System.err.println("파일을 찾을 수 없음.");
		}
		catch (IOException e) {
			//IOException: input, output (입,출력)과정에서 발생하는 예외
			e.printStackTrace();
			System.err.println("입출력 관련 예외 발생");
		}
		
		//직접 자원해제
		finally {
			if(fis != null) {
				try {
					//close() : 메모리 해제.
					fis.close();
				} 
				catch (IOException e) {
					
					e.printStackTrace();
				} 
			}
		}
		
	}

}
