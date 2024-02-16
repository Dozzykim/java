package Day10.Ex04_MultiInterface;

public class SmatTelevisionEx {
	
	public static void main(String[] args) {
		
		SmartTelevision samsungTV = new SmartTelevision();
		
		samsungTV.trunOn();
		samsungTV.setVolume(20);
		
		int channel = samsungTV.channelSearch("SBS");
		samsungTV.setChannel(channel);
		
		String[] idols = samsungTV.contentSearch("아이돌");
		System.out.println("--------검색된 컨텐츠--------");
		for (int i = 0; i < idols.length; i++) {
			System.out.print(idols[i]);
			if (i < idols.length -1) {
				System.out.print(", ");
			}
		}
		System.out.println();
		samsungTV.receiveVoice("오늘 날씨 어때?");
		
		samsungTV.trunOff();
	}

}
