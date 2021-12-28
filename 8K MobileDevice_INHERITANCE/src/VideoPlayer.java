
public class VideoPlayer {
private String videoClip;
   public VideoPlayer() {
	   videoClip="Mr.Bean's Holiday";
   }
   public VideoPlayer(String vc) {
	   videoClip=vc;
   }
   void setVideoClip(String vc) {
	   videoClip=vc;
   }
   String getVideoClip() {
	   return videoClip;
   }
}
