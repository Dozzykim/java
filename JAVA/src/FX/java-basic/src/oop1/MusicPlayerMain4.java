package oop1;

/*
 * 객체
*/

public class MusicPlayerMain4 {

	public static void main(String[] args) {
		MusicPlayer data = new MusicPlayer();

		// 음악 플레이어 켜기
		data.on();

		// 볼륨 증가
		data.volumeUp();

		// 볼륨 증가
		data.volumeUp();

		// 볼륨 감소
		data.volumeDown();

		// 음악 플레이어 상태
		data.showStatus();

		// 음악 플레이어 끄기
		data.off();

	}
}
