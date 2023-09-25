package Model;

import java.util.ArrayList;

import javazoom.jl.player.MP3Player;

public class MusicPlayer {

	private ArrayList<MusicVO> playlist = new ArrayList<>();
	private MP3Player mp3Player;
	private int index;

	public MusicPlayer(ArrayList<MusicVO> playlist) {
		this.playlist = playlist;
		this.mp3Player = new MP3Player();
	}

	public ArrayList<MusicVO> getPlayList() {
		return playlist;
	}

	public void indexNum(int index) {
		if (index < 0) {
			index = playlist.size() - 1;
		} else if (index >= playlist.size()) {
			index = 0;
		}
		this.index = index;
	}
	
	public MusicVO play(int index) {
		MusicVO m = playlist.get(index);
		if (mp3Player.isPlaying()) {
			mp3Player.stop();
		}
		mp3Player.play(m.getPath());
		return m;
	}
	
	public void stop(int index) {
		if(mp3Player.isPlaying()) {
			mp3Player.stop();
		}
	}
	
}
