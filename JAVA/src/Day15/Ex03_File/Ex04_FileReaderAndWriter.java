package Day15.Ex03_File;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex04_FileReaderAndWriter {

	public static void main(String[] args) {

		// 키보드로 입력해서 파일에 입력 저장
		InputStreamReader is = new InputStreamReader(System.in);
		FileWriter fw = null;
		
		int data = 0;
		
		try {
			// 파일명 test2.txt로 출력 스트림 객체 생성
			fw = new FileWriter("./src/Day15/Test3.txt");
			
			// 키보드로부터의 입력
			while ((data = is.read()) != -1) {
				//입력된 내용을 출력
				fw.write(data);
			}
			is.close();
			fw.close();
			System.out.println("텍스트 파일이 저장되었습니다.");

		} catch (IOException e) {
			System.err.println("입출력 시, 에러가 발생하였습니다.");
			e.printStackTrace();

		}
	}

}
