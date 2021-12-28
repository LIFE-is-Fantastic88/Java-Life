
public class AudioPlayer {
private String audioClip;
  public AudioPlayer() {
	  audioClip="You Raise me Up";
  }
  public AudioPlayer(String ac) {
	  audioClip=ac;
  }
  void setAudioClip(String ac) {
	  audioClip=ac;
  }
  String getAudioClip() {
	  return audioClip;
  }
}
