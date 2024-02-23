package Day15.Ex03_File;

import java.io.FileReader;
import java.io.FileWriter;

public class Ex05_TextFileCopy {
	
	public static void main(String[] args) {
		//Test.txt 파일을 Test4.txt 파일로 복사
		//1. Test.txt 파일 입력
		//2. Test4.txt 파일로 출력
		FileReader reader = null;
		FileWriter writer = null;
		
		int data = 0;
		
		try {
			reader = new FileReader("./src/Day15/Test.txt");
			writer = new FileWriter("./src/Day15/Test4.txt");
			
			//파일 입력
			while ((data = reader.read() ) != -1) {
				//파일 출력
				writer.write(data);
			}
			
			reader.close();
			writer.close();
			System.out.println("파일이 복사되었습니다.");
			System.out.println("Test.txt -> Test4.txt");
			
		} catch (Exception e) {
			System.err.println("입출력 시, 예외가 발생하였습니다.");
			e.printStackTrace();
		}
	}

}
