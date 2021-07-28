package chap11.phone3g;

public class Phone3G1 implements VoiceCall, VisualCall {

	@Override
	public void sendVisualMsg() {
		System.out.println("음성 메시지 보내기");
	}

	@Override
	public void getVisualMsg() {
		System.out.println("음성 메시지 듣기");
	}

	@Override
	public void sendVoiceMsg() {
		System.out.println("영상 보내기");
	}

	@Override
	public void getVoiceMsg() {
		System.out.println("영상 보기");
	}	
}
