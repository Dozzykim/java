package Day11.Ex04_AutoClose;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * 
*/

public class TryWithResource {

	public static void main(String[] args) {
		
		/*
		 * try( 자동으로 자원해제할 객체 생성 ) { }
		 * :finally 구문에서 직접 .close를 하지않아도, 자동으로 자원해제 시켜줌.
		 * *AutoClosable 인터페이스를 구현한 클래스여야 자동으로 자원해제 가능.
		 */
		try (FileInputStream fis = new FileInputStream("test.txt")){
			//test.txt파일을 입력할 수 있도록 연결
			
			int read = 0;
			
			//fis.read() : 객체생성할때 생성자에 입력한 파일의 데이터를 한글자씩 읽어오는 메소드
			// 더이상 읽어올 데이터가 없으면 -1을 반환함.
			//while문: 더이상 읽어올 데이터가 없을때까지 한글자씩 출력함.
			while ((read = fis.read()) != -1) {
				System.out.print((char)read);
			}
			
		}
		//FileNotFoundException: 파일이 존재하지 않을 때 발생하는 예외
		catch (FileNotFoundException e) {
			
			e.printStackTrace();//예외 발생의 원인을 찾아 단계별로 예외 메시지를 출력
			System.err.println("파일을 찾을 수 없음.");
		}
		//IOException: input, output (입,출력)과정에서 발생하는 예외
		catch (IOException e) {
			
			e.printStackTrace();
			System.err.println("입출력 관련 예외 발생");
		}
		
	}
}
