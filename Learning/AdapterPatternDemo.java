//Create interfaces for Media Player and Advanced Media Player//

interface MediaPlayer {
	   public void play(String audioType, String fileName);
	}

interface AdvancedMediaPlayer {	
	   public void playVlc(String fileName);
	   public void playMp4(String fileName);
	}
//Create concrete classes implementing the AdvancedMediaPlayer interface//
class VlcPlayer implements AdvancedMediaPlayer{
	   @Override
	   public void playVlc(String fileName) {
	      System.out.println("Playing vlc file. Name: "+ fileName);		
	   }

	   @Override
	   public void playMp4(String fileName) {
	      //do nothing
	   }
	}
class Mp4Player implements AdvancedMediaPlayer{

	   @Override
	   public void playVlc(String fileName) {
	      //do nothing
	   }

	   @Override
	   public void playMp4(String fileName) {
	      System.out.println("Playing mp4 file. Name: "+ fileName);		
	   }
	}

//Create concrete class implementing the MediaPlayer interface//
 class AudioPlayer implements MediaPlayer {
	   MediaAdapter mediaAdapter; 

	      public void play(String audioType, String fileName) {		

	      //inbuilt support to play mp3 music files
	      if(audioType.equalsIgnoreCase("mp3")){
	         System.out.println("Playing mp3 file. Name: " + fileName);			
	      } 
	      
	      //mediaAdapter is providing support to play other file formats
	      else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")){
	         mediaAdapter = new MediaAdapter(audioType);
	         mediaAdapter.play(audioType, fileName);
	      }
	      
	      else{System.out.println("Invalid media. " + audioType + " format not supported");
	      }
	   }   
	}
 class MediaAdapter implements MediaPlayer {

   AdvancedMediaPlayer advancedMusicPlayer;

   public MediaAdapter(String audioType){
   
      if(audioType.equalsIgnoreCase("vlc") ){
         advancedMusicPlayer = new VlcPlayer();			
         
      }else if (audioType.equalsIgnoreCase("mp4")){
         advancedMusicPlayer = new Mp4Player();
      }	
   }

   public void play(String audioType, String fileName) {
   
      if(audioType.equalsIgnoreCase("vlc")){
         advancedMusicPlayer.playVlc(fileName);
      }
      else if(audioType.equalsIgnoreCase("mp4")){
         advancedMusicPlayer.playMp4(fileName);
      }
   }
}

class AdvancedAdapter implements AdvancedMediaPlayer {

	private final MediaPlayer mediaPlayer;

	public AdvancedAdapter(MediaPlayer mediaPlayer){
		this.mediaPlayer = mediaPlayer;
	}

	@Override
	public void playVlc(String fileName){
		mediaPlayer.play("vlc",fileName);
	}

	@Override
	public void playMp4(String fileName){
		mediaPlayer.play("mp4",fileName);
	}
}

//Use the AudioPlayer to play different types of audio formats//
class AdapterPatternDemo {
		   public static void main(String[] args) {
			      AudioPlayer audioPlayer = new AudioPlayer();

			      audioPlayer.play("mp3", "beyond the horizon.mp3");
			      audioPlayer.play("mp4", "alone.mp4");
			      audioPlayer.play("vlc", "far far away.vlc");
			      audioPlayer.play("avi", "mind me.avi");

				  AdvancedAdapter advancedAdapter = new AdvancedAdapter(new AudioPlayer());
				  advancedAdapter.playMp4("hello");
				  advancedAdapter.playVlc("hello");
			   }
			}

