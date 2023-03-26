package chapter08;

public class SmartTelevision implements RemoteControl, Searchable {
	public int volume;
	
	@Override
	public void turnOn() {
		System.out.println("tv전원킴");
		
	}
	
	@Override
	public void turnOff() {
		System.out.println("tv전원끔");
		
	}
	
	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VALUE) {
			volume = RemoteControl.MAX_VALUE;
		} else if(volume < RemoteControl.MIN_VALUE) {
			volume = RemoteControl.MIN_VALUE;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 tv 볼륨: " + volume);
	}
	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다");
		
	}

}
