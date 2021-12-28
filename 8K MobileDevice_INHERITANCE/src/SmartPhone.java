
public class SmartPhone extends MobileDevice {
private AudioPlayer aPlayer;
private VideoPlayer vPlayer;
	public SmartPhone(String ma, String mo, int bs, AudioPlayer ap,
			VideoPlayer vp) {
       super(ma,mo,bs);
       aPlayer=ap;
       vPlayer=vp;
       
	}
	void currentAudioPlaying() {
		System.out.println("Audio playing: "+aPlayer.getAudioClip());
	}
	void currentVideoPlaying() {
		System.out.println("Video playing: "+vPlayer.getVideoClip());
	}
    void setCurrentAudio(String ac) {
    	aPlayer.setAudioClip(ac);
    }
	void setCurrentVideo(String vc) {
		vPlayer.setVideoClip(vc);
	}
	void printDetails() {
		super.printDetails();
		currentAudioPlaying();
		currentVideoPlaying();
		
	}

}
