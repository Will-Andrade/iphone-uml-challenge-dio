package main.music;

import java.util.List;

public class MusicPlayer {
  private List<Song> albums;
  private String currentlyPlaying;
  private boolean hasLandscapeMode;
  private boolean touchedScreen;
  
  public Song playSong(String song) {
    return new Song();
  }
  
  public void stopPlayingSong(String song) {
  }
  
  public void setRating(int rating) {
  }

  public void setPlayerView(String viewMode) {
  }
  
  public Controls showPlayerControls() {
    return new Controls();
  }
}
