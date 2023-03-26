package chapter08;

public interface RemoteControl {
	
	public int MAX_VALUE = 10;
	public int MIN_VALUE = 0;
	
	void turnOn();
	void turnOff();
	void setVolume(int volume);
}
