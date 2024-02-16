package Day10.Ex04_MultiInterface;

public class SmartTelevision implements Searchable, SmartRemoteControl {

	int volume; // 볼륨
	int channel; // 채널번호
	String keyword; // 검색어
	int x, y; // 터치패드 좌표

	@Override
	public void trunOn() {
		System.out.println("TV 전원 ON");
	}

	@Override
	public void trunOff() {
		System.out.println("TV 전원 OFF");

	}

	@Override
	public void setVolume(int volume) {
		this.volume = volume;
		System.out.println("현재 볼륨: " + volume);

	}

	@Override
	public void setChannel(int channel) {
		this.channel = channel;
		System.out.println("현재 채널: " + channel);

	}

	@Override
	public String receiveVoice(String voice) {
		System.out.println("음성입력: " + voice);
		return "voice: " + voice;
	}

	@Override
	public int channelSearch(String keyword) {
		int channel = 0;
		switch (keyword) {
		case "SBS":
			channel = 5;
			break;

		case "KBS":
			channel = 7;
			break;

		case "MBC":
			channel = 11;
			break;

		case "Mnet":
			channel = 27;
			break;

		case "ENA":
			channel = 30;
			break;
		}
		return channel;
	}

	@Override
	public String[] contentSearch(String keyword) {
		String[] movies = { "윙카", "서울의 봄", "해리포터", "인셉션", "인터스텔라", "타짜" };
		String[] idols = { "뉴진스", "투모로우바이투게더", "피프티", "BTS", "르세라핌" };
		String[] recommends = { "메타 코미디 클럽", "숏박스", "피식대학", "먹방" };
		String[] choices;

		switch (keyword) {
		case "영화":
			choices = movies;
			break;

		case "아이돌":
			choices = idols;
			break;

		default:
			choices = recommends;
			break;
		}
		return choices;
	}

	@Override
	public void touch(int x, int y) {

	}

}
