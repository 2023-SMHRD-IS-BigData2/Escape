package model1;

public class MusicVO {
	private String title;
	private String singer;
	private String path;
	
	public MusicVO(String title, String singer, String path) {
		this.title = title;
		this.singer = singer;
		this.path = path;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
	
}
