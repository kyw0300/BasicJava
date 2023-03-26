package chapter08;

public class Audio implements RemoteControl {
	public int volume;
	
	@Override
	public void turnOn() {
		System.out.println("Audio전원킴");
		
	}
	
	@Override
	public void turnOff() {
		System.out.println("Audio전원끔");
		
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
		System.out.println("현재 Audio 볼륨: " + volume);
	}

}
