package chap13.Timer;

import java.util.TimerTask;

public class YourTimeTask extends TimerTask {
	@Override
	public void run() {
		System.out.println("이 것은 당신이 원하는 작업입니다.");
	}
}
