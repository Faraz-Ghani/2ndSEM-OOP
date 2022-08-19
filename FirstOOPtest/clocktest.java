package pckg.FirstOOPtest;

class Clock{
	float hour;
	float minute;
	float second;
	
	
	public float getHour() {
		return hour;
	}
	public float getMinute() {
		return minute;
	}
	public float getSecond() {
		return second;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	
	public float convertToSeconds(float Hour,float Minute) {
		float seconds=0;
		 Minute=Hour*60;
		seconds=Minute*60;

		return seconds;
	}
	
	public float convertToHours(float Minute,float Second) {
		float Hours=0;
	   
	Second+=Minute*60;
	Hours=Second/3600;
	return Hours;
	}
	
}

public class clocktest{
public static void main(String[] args) {
	Clock clock = new Clock();
	System.out.println(clock.convertToSeconds(3,50));
System.out.println(clock.convertToHours(3, 50));
}
}
