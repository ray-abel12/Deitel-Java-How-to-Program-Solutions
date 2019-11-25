package exercises;

public class time1 {
private int hour;//0-23
private int minute;//0-59
private int second;//0-59

public void setTime(int hour, int minute, int second) {
	//validate hour, time, minute 
	if(hour < 0 || hour >=24 || minute < 0 || minute >= 60 || second < 0 || second >=60){
		throw new IllegalArgumentException("hour, minute or second is out of range ");
	}
	this.hour = hour;
	this.minute = minute;
	this.second = second;
}
// convert to string in universal-time format(HH:MM:SS)
public String toUniversalString() {
	return String.format("%02d:%02d:%02d", hour, minute, second);
}
}
